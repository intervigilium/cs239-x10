import x10.util.Timer;
import x10.io.Console;
import x10.array.Dist;
import x10.array.DistArray;

public class ParallelPrefix {

    val reg = (0..20);
    var a: DistArray[Int];

    public def this() {
        val dist = Dist.makeBlock(reg);
        a = DistArray.make[Int](dist, ([i]:Point(1)) => i);
    }

    public def printArray() {
        val ref = a;
        finish for (place in ref.dist.places()) at (place) {
            for (p in ref|here) {
                Console.OUT.println(ref(p));
            }
        }
    }

    public def run() {
        Console.OUT.println("ParallelPrefix using " + Place.MAX_PLACES + " places");
        prefixSum();
        printArray();
    }

    def reduceHere(val arr: DistArray[Int]): Int {
        val size = arr.dist.get(here).size();
        val start = arr.dist.get(here).min(0);
        val end = arr.dist.get(here).max(0);
        val sum: Array[Int] = new Array[Int](size);
        for (var iter: Int = 1; iter < size; iter *= 2) {
            finish for (p in arr|here) async {
                if (p(0) - iter >= start) {
                    sum(p(0) - start) = arr(p) + arr(p(0) - iter);
                }
            }
            finish for (p in arr|here) async {
                if (p(0) - iter >= start) {
                    arr(p) = sum(p(0) - start);
                }
            }
        }

        return arr(end);
    }

    def mapHere(val arr: DistArray[Int], f: (Int) => Int): Int {
        val end = arr.dist.get(here).max(0);
        val max = arr.dist.get(here).size();
        finish for (p in arr|here) async {
            arr(p) = f(arr(p));
        }
        return arr(end);
    }

    public def prefixSum() {
        val ref = a;
        val placeSum: Array[Int] = new Array[Int](Place.MAX_PLACES);
        finish for (place in ref.dist.places()) async {
            placeSum(place.id) = at (place) {
                reduceHere(ref)
            };
        }
        for (var iter: Int = 1; iter <= Place.MAX_PLACES; iter *= 2) {
            val i = iter;
            finish for (place in ref.dist.places()) async {
                if (place.id - i >= 0) {
                    placeSum(place.id) = at (place) {
                        val f: (Int) => Int = (x: Int) => {
                            return x + placeSum(place.id - i);
                        };
                        mapHere(ref, f)
                    };
                }
            }
        }
    }

    public static def main(args:Array[String]) {
        val tmr = new Timer();
        var count:Int = 0;
        val start = Timer.milliTime();
        finish {
            new ParallelPrefix().run();
        }
        val stop = Timer.milliTime();
        Console.OUT.println("Wall-clock time for parallel prefix sum: " + (stop - start) / 1000.0 + " secs");
    }
}

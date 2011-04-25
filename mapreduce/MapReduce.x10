import x10.util.Timer;
import x10.io.Console;
import x10.array.Dist;
import x10.array.DistArray;

public class MapReduce {

    val reg = (0..300000);
    var a: DistArray[Int];
    var total: Int;

    public def this() {
        val dist = Dist.makeBlock(reg);
        a = DistArray.make[Int](dist, ([i]:Point(1)) => i);
        total = 0;
    }

    public def run() {
        Console.OUT.println("MapReduce using " + Place.MAX_PLACES + " places");
        val f: (Int) => Int = (x: Int) => {
            return x * x;
        };
        map(f);
        reduceLog();
        Console.OUT.println(total);
    }

    public def map(f: (Int) => Int) {
        val ref = a;
        finish for (place in ref.dist.places()) async at (place) {
            for (p in ref|here) async {
                ref(p) = f(ref(p));
            }
        }
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

    def reducePlaces(val arr: Array[Int]): Int {
        val sum: Array[Int] = new Array[Int](arr.size);
        for (var iter: Int = 1; iter < arr.size; iter *= 2) {
            finish for (p in arr) async {
                if (p(0) - iter >= 0) {
                    sum(p) = arr(p) + arr(p(0) - iter);
                }
            }
            finish for (p in arr) async {
                if (p(0) - iter >= 0) {
                    arr(p) = sum(p);
                }
            }
        }

        return arr(arr.size - 1);
    }

    public def reduceLog() {
        val ref = a;
        val result: Array[Int] = new Array[Int](Place.MAX_PLACES);
        finish for (place in ref.dist.places()) async {
            result(place.id) = at (place) {
                reduceHere(ref)
            };
        }
        total = reducePlaces(result);
    }

    public def reduceParallel() {
        val ref = a;
        val result: Array[Int] = new Array[Int](Place.MAX_PLACES);
        finish for (place in ref.dist.places()) async {
            result(place.id) = at (place) {
                var localSum: Int = 0;
                for (p in ref|here) {
                    localSum += ref(p);
                }
                localSum
            };
        }

        for (p in result) {
            total = total + result(p);
        }
    }

    public static def main(args:Array[String]) {
        val tmr = new Timer();
        var count:Int = 0;
        val start = Timer.milliTime();
        finish {
            new MapReduce().run();
        }
        val stop = Timer.milliTime();
        Console.OUT.println("Wall-clock time for mapreduce: " + (stop - start) / 1000.0 + " secs");
    }
}

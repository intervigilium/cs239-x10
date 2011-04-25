import x10.util.Timer;
import x10.io.Console;
import x10.array.Dist;
import x10.array.DistArray;

public class ParallelPrefix {

    val reg = (0..15);
    var a: DistArray[Int];

    public def this() {
        val dist = Dist.makeBlock(reg);
        a = DistArray.make[Int](dist, ([i]:Point(1)) => i);
    }

    public def printArray() {
        val ref = a;
        finish for (place in ref.dist.places()) async at (place) {
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

    def reduceAtPlace(val arr: DistArray[Int], val place: Place): Int {
        val max = arr.dist.get(place).size();
        val offset = place.id * max;
        val sum: Array[Int] = new Array[Int](max);
        for (var iter: Int = 1; iter < max; iter *= 2) {
            finish for (p in arr|place) async {
                if (p(0) - iter >= offset) {
                    sum(p(0) - offset) = arr(p) + arr(p(0) - iter);
                }
            }
            finish for (p in arr|place) async {
                if (p(0) - iter >= offset) {
                    arr(p) = sum(p(0) - offset);
                }
            }
        }

        return arr((place.id + 1) * max - 1);
    }

    def mapSum(val arr: DistArray[Int], val place: Place, val sum: Int): Int {
        val max = arr.dist.get(place).size();
        finish for (p in arr|place) async {
            arr(p) += sum;
        }
        return arr((place.id + 1) * max - 1);
    }

    public def prefixSum() {
        val ref = a;
        val placeSum: Array[Int] = new Array[Int](Place.MAX_PLACES);
        finish for (place in ref.dist.places()) async {
            placeSum(place.id) = at (place) {
                reduceAtPlace(ref, place)
            };
        }
        for (var iter: Int = 1; iter <= Place.MAX_PLACES; iter *= 2) {
            val i = iter;
            finish for (place in ref.dist.places()) async {
                if (place.id - i >= 0) {
                    placeSum(place.id) = at (place) {
                        mapSum(ref, place, placeSum(place.id - i))
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

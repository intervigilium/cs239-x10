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

    public def printArray() {
        val ref = a;
        finish for (place in ref.dist.places()) async at (place) {
            for (p in ref|here) {
                Console.OUT.println(ref(p));
            }
        }
    }

    public def run() {
        Console.OUT.println("MapReduce using " + Place.MAX_PLACES + " places");
        map();
        reduce();
        Console.OUT.println(total);
    }

    public def map() {
        val ref = a;
        finish for (place in ref.dist.places()) async at (place) {
            for (p in ref|here) async {
                ref(p) = f(ref(p));
            }
        }
    }

    public def f(val x: Int): Int {
        return x*x;
    }

    def logParallelReduce(val arr: DistArray[Int], val place: Place): Int {
        val max = arr.dist.get(place).size();
        val offset = place.id * max;
        val sum: Array[Int] = new Array[Int](max);
        for (var iter: Int = 1; iter < max; iter *= 2) {
            finish for (p in arr|place) {
                if (p(0) - iter >= offset) {
                    async {
                        sum(p(0) - offset) = arr(p) + arr(p(0) - iter);
                    }
                }
            }
            finish for (p in arr|place) {
                if (p(0) - iter >= offset) {
                    async {
                        arr(p) = sum(p(0) - offset);
                    }
                }
            }
        }

        return arr((place.id + 1) * max - 1);
    }

    def logParallelReduce(val arr: Array[Int]): Int {
        val sum: Array[Int] = new Array[Int](arr.size);
        for (var iter: Int = 1; iter < arr.size; iter *= 2) {
            finish for (var i: Int = 0; i < arr.size; i++) {
                if (i - iter >= 0) {
                    val j = i;
                    async {
                        sum(j) = arr(j) + arr(j - iter);
                    }
                }
            }
            finish for (var i: Int = 0; i < arr.size; i++) {
                if (i - iter >= 0) {
                    val j = i;
                    async {
                        arr(j) = sum(j);
                    }
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
                logParallelReduce(ref, place)
            };
        }
        total = logParallelReduce(result);
    }

    public def reduce() {
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

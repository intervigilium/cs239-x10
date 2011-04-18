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
            for (p in ref) {
                Console.OUT.println(ref(p));
            }
        }
    }

    public def run() {
        map();
        reduce();
        Console.OUT.println(total);
    }

    public def map() {
        val ref = a;
        finish for (place in ref.dist.places()) async at (place) {
            for (p in ref) async {
                ref(p) = f(ref(p));
            }
        }
    }

    public def f(val x: Int): Int {
        return x*x;
    }

    public def reduce() {
        val ref = a;
        val result: Array[Int] = new Array[Int](Place.MAX_PLACES);
        finish for (place in ref.dist().places()) async {
            result(place.id) = at (place) {
                var localSum: Int = 0;
                for (p in ref) {
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

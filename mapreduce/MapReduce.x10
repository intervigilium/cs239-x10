import x10.util.Timer;
import x10.io.Console;
import x10.array.Dist;
import x10.array.DistArray;

public class MapReduce {
    public static def main(Array[String]): Void { 
	    val tmr = new Timer();
	    var count:Int = 0;
        finish { 
            tmr.start(count);
        }
	    finish {
            new MR().run();
        }
        tmr.stop(count);
	    Console.OUT.println("Wall-clock time for mapreduce: " + tmr.readTimer(count) + " secs");
	}
}

public class MR {
    val reg = (0..300000);
    var a: Array[Int];
    var total: Int;

    public MR() { 
        val dist = Dist.makeBlock(reg);
        a = DistArray.make[Int](dist);
        total = 0;
    }

    public def run(): Void {
        map();
        reduce();
        Console.OUT.println(total);
    }

    public def map(): Void {
        val b: Array[Int] = a;
        finish ateach (p in b) {
            b(p) = f(b(p));
        }
    }

    public def f(val x: Int): Int {
        return x*x;
    }

    public def reduce(): Void {
        val h: Place = here;
        val reg = a.region;
        val dis = reg->here;
        val result: Array[Int] = new Array[Int](dis);
        // Create an final array having a "slot" reserved 
        // for the result of each iteration
        for (p in a) {
            finish {
                val c: Array[Int] = a;
                async (a.dist.get(p)) {
                    val v: Int = c(p);
                    async (h) {
                        result(p) = v;
                    }
                }
            }
        }

        for (p in result) {
            total = total + result(p);
        }
    }
}

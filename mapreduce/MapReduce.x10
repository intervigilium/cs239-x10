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

    public def reduceLog() {
        val ref = a;
        val result: Array[Int] = new Array[Int](Place.MAX_PLACES);
        finish for (place in ref.dist.places()) async {
            result(place.id) = at (place) {
                val max = ref.dist.get(place).size();
                val localArray: Array[Int] = new Array[Int](ref.dist.region.size());
                var iter: Int = 1;
                var flip: Boolean = false;
                var res: Int;
                while (iter < max) {
                    finish for (p in ref|here) {
                        if (p(0) >= iter) {
                            if (flip) {
                                async {
                                    localArray(p) = ref(p - iter) + ref(p);
                                }
                            } else {
                                async {
                                    ref(p) = localArray(p - iter) + localArray(p);
                                }
                            }
                        }
                    }
                    iter *= 2;
                    flip = !flip;
                }

                if (flip) {
                    res = ref(max - 1);
                } else {
                    res = localArray(max - 1);
                }
                res
            };
        }

        for (p in result) {
            total = total + result(p);
        }
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

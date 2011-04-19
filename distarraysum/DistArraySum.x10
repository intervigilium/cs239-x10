public class DistArraySum {
    public static def main(Array[String]) {
        val R : Region= 1..8;
        val D = Dist.makeBlock(R);
        val a = DistArray.make[Int](D, ([i]:Point) => 10*i);
        val b = DistArray.make[Int](D, ([i]:Point) => i*i);
        x10.io.Console.OUT.println("str(a) = " + str(a));
        x10.io.Console.OUT.println("str(b) = " + str(b));
        val c = add(a,b);
        x10.io.Console.OUT.println("str(c) = " + str(c));
    }
    
    static def str[T](a:DistArray[T]):String =
    {
        var s : String = "";
        var first : Boolean = true;
        for(x in a) {
            if (first) first=false;
            else s += ",";
            s += at (a.dist(x)) a(x); 
        }
        return s;
    }
    
    static def add(a:DistArray[Int], b:DistArray[Int])
    {a.dist == b.dist} :DistArray[Int]{self.dist == a.dist} = {
        val c = DistArray.make[Int](a.dist, (p:Point)=>0);
        for (val p in a.dist) { // could be done in parallel
            at(a.dist(p)) {
                c(p) = a(p) + b(p);
            }
        }
        return c;
    }
}

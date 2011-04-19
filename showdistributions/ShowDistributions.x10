public class ShowDistributions {
    static def show(s:String, d:Dist) {
        x10.io.Console.OUT.print(s + " = ");
        for(p:Point in d.region)
            x10.io.Console.OUT.print("" + d(p).id);
        x10.io.Console.OUT.println("");
    }
    public static def main(Array[String]) {
        R : Region = 1..35;
        show("R->here                 ", R->here);
        show("Dist.makeConstant(here) ", Dist.makeConstant(R, here));
        show("Dist.makeBlock(R)       ", Dist.makeBlock(R));
    }
}
// prints
// R->here                  = 00000000000000000000000000000000000
// Dist.makeConstant(here)  = 00000000000000000000000000000000000
// Dist.makeBlock(R)        = 00000000011111111122222222233333333

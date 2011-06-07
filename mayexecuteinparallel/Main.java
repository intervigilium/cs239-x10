import syntaxtree.*;
import visitor.*;
import cs239.*;

public class Main {
    public static void main(String [] args) {
        try {
            INode root = new MiniX10Parser(System.in).File();
            MayExecuteInParallelVisitor scanner = new MayExecuteInParallelVisitor();
            root.accept(scanner);
        } catch (ParseException e) {
            System.out.println(e.toString());
        }
    }
}

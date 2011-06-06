import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         // new MiniX10Parser(System.in).Goal();
         INode root = new MiniX10Parser(System.in).File();
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}


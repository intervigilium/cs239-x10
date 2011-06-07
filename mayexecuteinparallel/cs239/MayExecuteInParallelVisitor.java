package cs239;

import syntaxtree.*;
import visitor.*;
import java.util.*;

public class MayExecuteInParallelVisitor extends DepthFirstVoidVisitor {

  public void visit(final Statement n) {
    n.f0.accept(this);
    System.out.println(n.f0.toString());
  }

  public void visit(final AsyncStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final Block n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final BlockStatement n) {
    n.f0.accept(this);
  }

  public void visit(final FinishStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

}

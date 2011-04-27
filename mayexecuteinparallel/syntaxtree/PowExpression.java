/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class PowExpression implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public NodeToken f2;

  public NodeToken f3;

  public Expression f4;

  public NodeToken f5;

  public Expression f6;

  public NodeToken f7;

  private static final long serialVersionUID = 144L;

  public PowExpression(final NodeToken n0, final NodeToken n1, final NodeToken n2, final NodeToken n3, final Expression n4, final NodeToken n5, final Expression n6, final NodeToken n7) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
    f6 = n6;
    f7 = n7;
  }

  public PowExpression(final Expression n0, final Expression n1) {
    f0 = new NodeToken("Math");
    f1 = new NodeToken(".");
    f2 = new NodeToken("pow");
    f3 = new NodeToken("(");
    f4 = n0;
    f5 = new NodeToken(",");
    f6 = n1;
    f7 = new NodeToken(")");
  }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}

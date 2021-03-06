/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class GreaterThanExpression implements INode {

  public PrimaryExpression f0;

  public NodeToken f1;

  public Expression f2;

  private static final long serialVersionUID = 144L;

  public GreaterThanExpression(final PrimaryExpression n0, final NodeToken n1, final Expression n2) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
  }

  public GreaterThanExpression(final PrimaryExpression n0, final Expression n1) {
    f0 = n0;
    f1 = new NodeToken(">");
    f2 = n1;
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

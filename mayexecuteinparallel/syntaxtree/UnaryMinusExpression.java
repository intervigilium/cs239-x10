/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class UnaryMinusExpression implements INode {

  public NodeToken f0;

  public PrimaryExpression f1;

  private static final long serialVersionUID = 144L;

  public UnaryMinusExpression(final NodeToken n0, final PrimaryExpression n1) {
    f0 = n0;
    f1 = n1;
  }

  public UnaryMinusExpression(final PrimaryExpression n0) {
    f0 = new NodeToken("-");
    f1 = n0;
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

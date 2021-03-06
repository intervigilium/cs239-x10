/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class DotMethodCall implements INode {

  public PrimaryExpression f0;

  public NodeToken f1;

  public Identifier f2;

  public NodeToken f3;

  public NodeOptional f4;

  public NodeToken f5;

  private static final long serialVersionUID = 144L;

  public DotMethodCall(final PrimaryExpression n0, final NodeToken n1, final Identifier n2, final NodeToken n3, final NodeOptional n4, final NodeToken n5) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
  }

  public DotMethodCall(final PrimaryExpression n0, final Identifier n1, final NodeOptional n2) {
    f0 = n0;
    f1 = new NodeToken(".");
    f2 = n1;
    f3 = new NodeToken("(");
    f4 = n2;
    f5 = new NodeToken(")");
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

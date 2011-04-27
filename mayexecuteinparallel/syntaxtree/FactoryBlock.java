/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class FactoryBlock implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public Expression f2;

  public NodeToken f3;

  private static final long serialVersionUID = 144L;

  public FactoryBlock(final NodeToken n0, final NodeToken n1, final Expression n2, final NodeToken n3) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
  }

  public FactoryBlock(final Expression n0) {
    f0 = new NodeToken("dist.factory.block");
    f1 = new NodeToken("(");
    f2 = n0;
    f3 = new NodeToken(")");
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

/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class ArrayInitializer implements INode {

  public NodeToken f0;

  public PointType f1;

  public ExplodedSpecification f2;

  public NodeToken f3;

  public Block f4;

  private static final long serialVersionUID = 144L;

  public ArrayInitializer(final NodeToken n0, final PointType n1, final ExplodedSpecification n2, final NodeToken n3, final Block n4) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
  }

  public ArrayInitializer(final PointType n0, final ExplodedSpecification n1, final Block n2) {
    f0 = new NodeToken("(");
    f1 = n0;
    f2 = n1;
    f3 = new NodeToken(")");
    f4 = n2;
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

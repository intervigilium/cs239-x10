/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class NewUpdatableArray implements INode {

  public NodeToken f0;

  public NonArrayType f1;

  public NodeToken f2;

  public Identifier f3;

  public NodeToken f4;

  public NodeOptional f5;

  private static final long serialVersionUID = 144L;

  public NewUpdatableArray(final NodeToken n0, final NonArrayType n1, final NodeToken n2, final Identifier n3, final NodeToken n4, final NodeOptional n5) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
  }

  public NewUpdatableArray(final NonArrayType n0, final Identifier n1, final NodeOptional n2) {
    f0 = new NodeToken("new");
    f1 = n0;
    f2 = new NodeToken("[");
    f3 = n1;
    f4 = new NodeToken("]");
    f5 = n2;
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

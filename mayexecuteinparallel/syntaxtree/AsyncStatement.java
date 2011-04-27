/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class AsyncStatement implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public Expression f2;

  public NodeToken f3;

  public Block f4;

  private static final long serialVersionUID = 144L;

  public AsyncStatement(final NodeToken n0, final NodeToken n1, final Expression n2, final NodeToken n3, final Block n4) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
  }

  public AsyncStatement(final Expression n0, final Block n1) {
    f0 = new NodeToken("async");
    f1 = new NodeToken("(");
    f2 = n0;
    f3 = new NodeToken(")");
    f4 = n1;
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

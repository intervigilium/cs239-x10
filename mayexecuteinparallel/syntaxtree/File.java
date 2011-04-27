/* Generated by JTB 1.4.4 */
package syntaxtree;

import visitor.*;

public class File implements INode {

  public NodeListOptional f0;

  public NodeToken f1;

  private static final long serialVersionUID = 144L;

  public File(final NodeListOptional n0, final NodeToken n1) {
    f0 = n0;
    f1 = n1;
  }

  public File(final NodeListOptional n0) {
    f0 = n0;
    f1 = new NodeToken("");
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

/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;
import java.util.*;

public class DepthFirstVoidArguVisitor<A> implements IVoidArguVisitor<A> {


  public void visit(final NodeChoice n, final A argu) {
    n.choice.accept(this, argu);
    return;
  }

  public void visit(final NodeList n, final A argu) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this, argu);
    }
    return;
  }

  public void visit(final NodeListOptional n, final A argu) {
    if (n.present()) {
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        e.next().accept(this, argu);
        }
      return;
    } else
      return;
  }

  public void visit(final NodeOptional n, final A argu) {
    if (n.present()) {
      n.node.accept(this, argu);
      return;
    } else
    return;
  }

  public void visit(final NodeSequence n, final A argu) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this, argu);
    }
    return;
  }

  public void visit(final NodeToken n, @SuppressWarnings("unused") final A argu) {
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return;
  }

  public void visit(final File n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final TopLevelDeclaration n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final MainClass n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
    n.f8.accept(this, argu);
    n.f9.accept(this, argu);
    n.f10.accept(this, argu);
    n.f11.accept(this, argu);
    n.f12.accept(this, argu);
    n.f13.accept(this, argu);
    n.f14.accept(this, argu);
    n.f15.accept(this, argu);
    n.f16.accept(this, argu);
    n.f17.accept(this, argu);
  }

  public void visit(final ClassDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final ClassMember n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ConstantDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
  }

  public void visit(final UpdatableFieldDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final MethodDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
  }

  public void visit(final FormalParameterList n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final FormalParameter n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final FinalFormalParameter n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final UpdatableFormalParameter n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final FormalParameterRest n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final ReturnType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final VoidType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Type n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final UpdatableArrayType n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final RankEquation n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final NonArrayType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final BooleanType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final IntegerType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final DoubleType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final StringType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final PlaceType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final DistType n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final RegionType n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final PointType n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final ClassNameType n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Identifier n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Statement n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final Assignment n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final AsyncStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final Block n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final BlockStatement n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final FinalVariableDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final UpdatableVariableDeclaration n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final FinishStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final IfStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final ElseClause n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final LoopStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
  }

  public void visit(final ExplodedSpecification n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final PointName n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final IdentifierList n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final IdentifierRest n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final PostfixStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final PrintlnStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final ReturnStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final ThrowStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
  }

  public void visit(final WhileStatement n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final Expression n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final InclusiveOrExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final EqualsExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final NotEqualsExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final GreaterThanExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final PlusExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final MinusExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final TimesExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final DivideExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final SinExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final CosExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final PowExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
    n.f6.accept(this, argu);
    n.f7.accept(this, argu);
  }

  public void visit(final AbsExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final MapExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final RegionConstant n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final ColonRest n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final ColonExpression n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ColonPair n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final UnaryMinusExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final CoercionToIntExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final CoercionToDoubleExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final TypeAnnotatedExpression n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final TypeAnnotation n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final PrimaryExpression n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final This n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final FactoryBlock n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final ArrayAccess n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
  }

  public void visit(final DotMethodCall n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final DotDistribution n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final DotIsFirst n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final DotIdentifier n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
  }

  public void visit(final AllocationExpression n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final NewObject n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

  public void visit(final NewUpdatableArray n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
    n.f5.accept(this, argu);
  }

  public void visit(final Literal n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final IntegerLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final FloatingPointLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final StringLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final HereLiteral n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final DistUnique n, final A argu) {
    n.f0.accept(this, argu);
  }

  public void visit(final ExpressionList n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final ArgumentRest n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
  }

  public void visit(final ArrayInitializer n, final A argu) {
    n.f0.accept(this, argu);
    n.f1.accept(this, argu);
    n.f2.accept(this, argu);
    n.f3.accept(this, argu);
    n.f4.accept(this, argu);
  }

}

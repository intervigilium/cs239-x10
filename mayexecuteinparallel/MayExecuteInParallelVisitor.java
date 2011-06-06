/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;
import java.util.*;

public class MayExecuteInParallelVisitor implements IVoidVisitor {


  public void visit(final NodeChoice n) {
    n.choice.accept(this);
    return;
  }

  public void visit(final NodeList n) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this);
    }
    return;
  }

  public void visit(final NodeListOptional n) {
    if (n.present()) {
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        e.next().accept(this);
        }
      return;
    } else
      return;
  }

  public void visit(final NodeOptional n) {
    if (n.present()) {
      n.node.accept(this);
      return;
    } else
    return;
  }

  public void visit(final NodeSequence n) {
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      e.next().accept(this);
    }
    return;
  }

  public void visit(final NodeToken n) {
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return;
  }

  public void visit(final File n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final TopLevelDeclaration n) {
    n.f0.accept(this);
  }

  public void visit(final MainClass n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
    n.f8.accept(this);
    n.f9.accept(this);
    n.f10.accept(this);
    n.f11.accept(this);
    n.f12.accept(this);
    n.f13.accept(this);
    n.f14.accept(this);
    n.f15.accept(this);
    n.f16.accept(this);
    n.f17.accept(this);
  }

  public void visit(final ClassDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final ClassMember n) {
    n.f0.accept(this);
  }

  public void visit(final ConstantDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
  }

  public void visit(final UpdatableFieldDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final MethodDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
  }

  public void visit(final FormalParameterList n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final FormalParameter n) {
    n.f0.accept(this);
  }

  public void visit(final FinalFormalParameter n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final UpdatableFormalParameter n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final FormalParameterRest n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final ReturnType n) {
    n.f0.accept(this);
  }

  public void visit(final VoidType n) {
    n.f0.accept(this);
  }

  public void visit(final Type n) {
    n.f0.accept(this);
  }

  public void visit(final UpdatableArrayType n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final RankEquation n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final NonArrayType n) {
    n.f0.accept(this);
  }

  public void visit(final BooleanType n) {
    n.f0.accept(this);
  }

  public void visit(final IntegerType n) {
    n.f0.accept(this);
  }

  public void visit(final DoubleType n) {
    n.f0.accept(this);
  }

  public void visit(final StringType n) {
    n.f0.accept(this);
  }

  public void visit(final PlaceType n) {
    n.f0.accept(this);
  }

  public void visit(final DistType n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final RegionType n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final PointType n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final ClassNameType n) {
    n.f0.accept(this);
  }

  public void visit(final Identifier n) {
    n.f0.accept(this);
  }

  public void visit(final Statement n) {
    n.f0.accept(this);
  }

  public void visit(final Assignment n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final AsyncStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final Block n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final BlockStatement n) {
    n.f0.accept(this);
  }

  public void visit(final FinalVariableDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final UpdatableVariableDeclaration n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final FinishStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final IfStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final ElseClause n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final LoopStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
  }

  public void visit(final ExplodedSpecification n) {
    n.f0.accept(this);
  }

  public void visit(final PointName n) {
    n.f0.accept(this);
  }

  public void visit(final IdentifierList n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final IdentifierRest n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final PostfixStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final PrintlnStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final ReturnStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final ThrowStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
  }

  public void visit(final WhileStatement n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final Expression n) {
    n.f0.accept(this);
  }

  public void visit(final InclusiveOrExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final EqualsExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final NotEqualsExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final GreaterThanExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final PlusExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final MinusExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final TimesExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final DivideExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final SinExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final CosExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final PowExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
    n.f6.accept(this);
    n.f7.accept(this);
  }

  public void visit(final AbsExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final MapExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final RegionConstant n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final ColonRest n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final ColonExpression n) {
    n.f0.accept(this);
  }

  public void visit(final ColonPair n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final UnaryMinusExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final CoercionToIntExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final CoercionToDoubleExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final TypeAnnotatedExpression n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final TypeAnnotation n) {
    n.f0.accept(this);
  }

  public void visit(final PrimaryExpression n) {
    n.f0.accept(this);
  }

  public void visit(final This n) {
    n.f0.accept(this);
  }

  public void visit(final FactoryBlock n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final ArrayAccess n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
  }

  public void visit(final DotMethodCall n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final DotDistribution n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final DotIsFirst n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final DotIdentifier n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
  }

  public void visit(final AllocationExpression n) {
    n.f0.accept(this);
  }

  public void visit(final NewObject n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

  public void visit(final NewUpdatableArray n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
    n.f5.accept(this);
  }

  public void visit(final Literal n) {
    n.f0.accept(this);
  }

  public void visit(final IntegerLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final FloatingPointLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final StringLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final HereLiteral n) {
    n.f0.accept(this);
  }

  public void visit(final DistUnique n) {
    n.f0.accept(this);
  }

  public void visit(final ExpressionList n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final ArgumentRest n) {
    n.f0.accept(this);
    n.f1.accept(this);
  }

  public void visit(final ArrayInitializer n) {
    n.f0.accept(this);
    n.f1.accept(this);
    n.f2.accept(this);
    n.f3.accept(this);
    n.f4.accept(this);
  }

}

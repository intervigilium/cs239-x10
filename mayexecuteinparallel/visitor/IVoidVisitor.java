/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;

public interface IVoidVisitor {

  public void visit(final NodeList n);

  public void visit(final NodeListOptional n);

  public void visit(final NodeOptional n);

  public void visit(final NodeSequence n);

  public void visit(final NodeToken n);

  public void visit(final File n);

  public void visit(final TopLevelDeclaration n);

  public void visit(final MainClass n);

  public void visit(final ClassDeclaration n);

  public void visit(final ClassMember n);

  public void visit(final ConstantDeclaration n);

  public void visit(final UpdatableFieldDeclaration n);

  public void visit(final MethodDeclaration n);

  public void visit(final FormalParameterList n);

  public void visit(final FormalParameter n);

  public void visit(final FinalFormalParameter n);

  public void visit(final UpdatableFormalParameter n);

  public void visit(final FormalParameterRest n);

  public void visit(final ReturnType n);

  public void visit(final VoidType n);

  public void visit(final Type n);

  public void visit(final UpdatableArrayType n);

  public void visit(final RankEquation n);

  public void visit(final NonArrayType n);

  public void visit(final BooleanType n);

  public void visit(final IntegerType n);

  public void visit(final DoubleType n);

  public void visit(final StringType n);

  public void visit(final PlaceType n);

  public void visit(final DistType n);

  public void visit(final RegionType n);

  public void visit(final PointType n);

  public void visit(final ClassNameType n);

  public void visit(final Identifier n);

  public void visit(final Statement n);

  public void visit(final Assignment n);

  public void visit(final AsyncStatement n);

  public void visit(final Block n);

  public void visit(final BlockStatement n);

  public void visit(final FinalVariableDeclaration n);

  public void visit(final UpdatableVariableDeclaration n);

  public void visit(final FinishStatement n);

  public void visit(final IfStatement n);

  public void visit(final ElseClause n);

  public void visit(final LoopStatement n);

  public void visit(final ExplodedSpecification n);

  public void visit(final PointName n);

  public void visit(final IdentifierList n);

  public void visit(final IdentifierRest n);

  public void visit(final PostfixStatement n);

  public void visit(final PrintlnStatement n);

  public void visit(final ReturnStatement n);

  public void visit(final ThrowStatement n);

  public void visit(final WhileStatement n);

  public void visit(final Expression n);

  public void visit(final InclusiveOrExpression n);

  public void visit(final EqualsExpression n);

  public void visit(final NotEqualsExpression n);

  public void visit(final GreaterThanExpression n);

  public void visit(final PlusExpression n);

  public void visit(final MinusExpression n);

  public void visit(final TimesExpression n);

  public void visit(final DivideExpression n);

  public void visit(final SinExpression n);

  public void visit(final CosExpression n);

  public void visit(final PowExpression n);

  public void visit(final AbsExpression n);

  public void visit(final MapExpression n);

  public void visit(final RegionConstant n);

  public void visit(final ColonRest n);

  public void visit(final ColonExpression n);

  public void visit(final ColonPair n);

  public void visit(final UnaryMinusExpression n);

  public void visit(final CoercionToIntExpression n);

  public void visit(final CoercionToDoubleExpression n);

  public void visit(final TypeAnnotatedExpression n);

  public void visit(final TypeAnnotation n);

  public void visit(final PrimaryExpression n);

  public void visit(final This n);

  public void visit(final FactoryBlock n);

  public void visit(final ArrayAccess n);

  public void visit(final DotMethodCall n);

  public void visit(final DotDistribution n);

  public void visit(final DotIsFirst n);

  public void visit(final DotIdentifier n);

  public void visit(final AllocationExpression n);

  public void visit(final NewObject n);

  public void visit(final NewUpdatableArray n);

  public void visit(final Literal n);

  public void visit(final IntegerLiteral n);

  public void visit(final FloatingPointLiteral n);

  public void visit(final StringLiteral n);

  public void visit(final HereLiteral n);

  public void visit(final DistUnique n);

  public void visit(final ExpressionList n);

  public void visit(final ArgumentRest n);

  public void visit(final ArrayInitializer n);

}

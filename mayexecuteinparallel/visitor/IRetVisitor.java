/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;

public interface IRetVisitor<R> {

  public R visit(final NodeList n);

  public R visit(final NodeListOptional n);

  public R visit(final NodeOptional n);

  public R visit(final NodeSequence n);

  public R visit(final NodeToken n);

  public R visit(final File n);

  public R visit(final TopLevelDeclaration n);

  public R visit(final MainClass n);

  public R visit(final ClassDeclaration n);

  public R visit(final ClassMember n);

  public R visit(final ConstantDeclaration n);

  public R visit(final UpdatableFieldDeclaration n);

  public R visit(final MethodDeclaration n);

  public R visit(final FormalParameterList n);

  public R visit(final FormalParameter n);

  public R visit(final FinalFormalParameter n);

  public R visit(final UpdatableFormalParameter n);

  public R visit(final FormalParameterRest n);

  public R visit(final ReturnType n);

  public R visit(final VoidType n);

  public R visit(final Type n);

  public R visit(final UpdatableArrayType n);

  public R visit(final RankEquation n);

  public R visit(final NonArrayType n);

  public R visit(final BooleanType n);

  public R visit(final IntegerType n);

  public R visit(final DoubleType n);

  public R visit(final StringType n);

  public R visit(final PlaceType n);

  public R visit(final DistType n);

  public R visit(final RegionType n);

  public R visit(final PointType n);

  public R visit(final ClassNameType n);

  public R visit(final Identifier n);

  public R visit(final Statement n);

  public R visit(final Assignment n);

  public R visit(final AsyncStatement n);

  public R visit(final Block n);

  public R visit(final BlockStatement n);

  public R visit(final FinalVariableDeclaration n);

  public R visit(final UpdatableVariableDeclaration n);

  public R visit(final FinishStatement n);

  public R visit(final IfStatement n);

  public R visit(final ElseClause n);

  public R visit(final LoopStatement n);

  public R visit(final ExplodedSpecification n);

  public R visit(final PointName n);

  public R visit(final IdentifierList n);

  public R visit(final IdentifierRest n);

  public R visit(final PostfixStatement n);

  public R visit(final PrintlnStatement n);

  public R visit(final ReturnStatement n);

  public R visit(final ThrowStatement n);

  public R visit(final WhileStatement n);

  public R visit(final Expression n);

  public R visit(final InclusiveOrExpression n);

  public R visit(final EqualsExpression n);

  public R visit(final NotEqualsExpression n);

  public R visit(final GreaterThanExpression n);

  public R visit(final PlusExpression n);

  public R visit(final MinusExpression n);

  public R visit(final TimesExpression n);

  public R visit(final DivideExpression n);

  public R visit(final SinExpression n);

  public R visit(final CosExpression n);

  public R visit(final PowExpression n);

  public R visit(final AbsExpression n);

  public R visit(final MapExpression n);

  public R visit(final RegionConstant n);

  public R visit(final ColonRest n);

  public R visit(final ColonExpression n);

  public R visit(final ColonPair n);

  public R visit(final UnaryMinusExpression n);

  public R visit(final CoercionToIntExpression n);

  public R visit(final CoercionToDoubleExpression n);

  public R visit(final TypeAnnotatedExpression n);

  public R visit(final TypeAnnotation n);

  public R visit(final PrimaryExpression n);

  public R visit(final This n);

  public R visit(final FactoryBlock n);

  public R visit(final ArrayAccess n);

  public R visit(final DotMethodCall n);

  public R visit(final DotDistribution n);

  public R visit(final DotIsFirst n);

  public R visit(final DotIdentifier n);

  public R visit(final AllocationExpression n);

  public R visit(final NewObject n);

  public R visit(final NewUpdatableArray n);

  public R visit(final Literal n);

  public R visit(final IntegerLiteral n);

  public R visit(final FloatingPointLiteral n);

  public R visit(final StringLiteral n);

  public R visit(final HereLiteral n);

  public R visit(final DistUnique n);

  public R visit(final ExpressionList n);

  public R visit(final ArgumentRest n);

  public R visit(final ArrayInitializer n);

}
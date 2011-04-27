/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;

public interface IRetArguVisitor<R, A> {

  public R visit(final NodeList n, final A argu);

  public R visit(final NodeListOptional n, final A argu);

  public R visit(final NodeOptional n, final A argu);

  public R visit(final NodeSequence n, final A argu);

  public R visit(final NodeToken n, final A argu);

  public R visit(final File n, final A argu);

  public R visit(final TopLevelDeclaration n, final A argu);

  public R visit(final MainClass n, final A argu);

  public R visit(final ClassDeclaration n, final A argu);

  public R visit(final ClassMember n, final A argu);

  public R visit(final ConstantDeclaration n, final A argu);

  public R visit(final UpdatableFieldDeclaration n, final A argu);

  public R visit(final MethodDeclaration n, final A argu);

  public R visit(final FormalParameterList n, final A argu);

  public R visit(final FormalParameter n, final A argu);

  public R visit(final FinalFormalParameter n, final A argu);

  public R visit(final UpdatableFormalParameter n, final A argu);

  public R visit(final FormalParameterRest n, final A argu);

  public R visit(final ReturnType n, final A argu);

  public R visit(final VoidType n, final A argu);

  public R visit(final Type n, final A argu);

  public R visit(final UpdatableArrayType n, final A argu);

  public R visit(final RankEquation n, final A argu);

  public R visit(final NonArrayType n, final A argu);

  public R visit(final BooleanType n, final A argu);

  public R visit(final IntegerType n, final A argu);

  public R visit(final DoubleType n, final A argu);

  public R visit(final StringType n, final A argu);

  public R visit(final PlaceType n, final A argu);

  public R visit(final DistType n, final A argu);

  public R visit(final RegionType n, final A argu);

  public R visit(final PointType n, final A argu);

  public R visit(final ClassNameType n, final A argu);

  public R visit(final Identifier n, final A argu);

  public R visit(final Statement n, final A argu);

  public R visit(final Assignment n, final A argu);

  public R visit(final AsyncStatement n, final A argu);

  public R visit(final Block n, final A argu);

  public R visit(final BlockStatement n, final A argu);

  public R visit(final FinalVariableDeclaration n, final A argu);

  public R visit(final UpdatableVariableDeclaration n, final A argu);

  public R visit(final FinishStatement n, final A argu);

  public R visit(final IfStatement n, final A argu);

  public R visit(final ElseClause n, final A argu);

  public R visit(final LoopStatement n, final A argu);

  public R visit(final ExplodedSpecification n, final A argu);

  public R visit(final PointName n, final A argu);

  public R visit(final IdentifierList n, final A argu);

  public R visit(final IdentifierRest n, final A argu);

  public R visit(final PostfixStatement n, final A argu);

  public R visit(final PrintlnStatement n, final A argu);

  public R visit(final ReturnStatement n, final A argu);

  public R visit(final ThrowStatement n, final A argu);

  public R visit(final WhileStatement n, final A argu);

  public R visit(final Expression n, final A argu);

  public R visit(final InclusiveOrExpression n, final A argu);

  public R visit(final EqualsExpression n, final A argu);

  public R visit(final NotEqualsExpression n, final A argu);

  public R visit(final GreaterThanExpression n, final A argu);

  public R visit(final PlusExpression n, final A argu);

  public R visit(final MinusExpression n, final A argu);

  public R visit(final TimesExpression n, final A argu);

  public R visit(final DivideExpression n, final A argu);

  public R visit(final SinExpression n, final A argu);

  public R visit(final CosExpression n, final A argu);

  public R visit(final PowExpression n, final A argu);

  public R visit(final AbsExpression n, final A argu);

  public R visit(final MapExpression n, final A argu);

  public R visit(final RegionConstant n, final A argu);

  public R visit(final ColonRest n, final A argu);

  public R visit(final ColonExpression n, final A argu);

  public R visit(final ColonPair n, final A argu);

  public R visit(final UnaryMinusExpression n, final A argu);

  public R visit(final CoercionToIntExpression n, final A argu);

  public R visit(final CoercionToDoubleExpression n, final A argu);

  public R visit(final TypeAnnotatedExpression n, final A argu);

  public R visit(final TypeAnnotation n, final A argu);

  public R visit(final PrimaryExpression n, final A argu);

  public R visit(final This n, final A argu);

  public R visit(final FactoryBlock n, final A argu);

  public R visit(final ArrayAccess n, final A argu);

  public R visit(final DotMethodCall n, final A argu);

  public R visit(final DotDistribution n, final A argu);

  public R visit(final DotIsFirst n, final A argu);

  public R visit(final DotIdentifier n, final A argu);

  public R visit(final AllocationExpression n, final A argu);

  public R visit(final NewObject n, final A argu);

  public R visit(final NewUpdatableArray n, final A argu);

  public R visit(final Literal n, final A argu);

  public R visit(final IntegerLiteral n, final A argu);

  public R visit(final FloatingPointLiteral n, final A argu);

  public R visit(final StringLiteral n, final A argu);

  public R visit(final HereLiteral n, final A argu);

  public R visit(final DistUnique n, final A argu);

  public R visit(final ExpressionList n, final A argu);

  public R visit(final ArgumentRest n, final A argu);

  public R visit(final ArrayInitializer n, final A argu);

}

package cs239;

import syntaxtree.*;
import visitor.*;
import java.util.*;

public class MayExecuteInParallelVisitor extends DepthFirstVoidVisitor {

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

}

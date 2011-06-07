package cs239;

import syntaxtree.*;
import visitor.*;
import java.util.*;

public class MayExecuteInParallelVisitor extends DepthFirstVoidVisitor {

	public void visit(final Statement n) {
		n.f0.accept(this);
	}

    /*
     * f0: Expression
     * f1: '='
     * f2: Expression
     * f3: ';'
     */
	public void visit(final Assignment n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
	}

    /*
     * f0: 'async'
     * f1: '('
     * f2: Expression
     * f3: ')'
     * f4: Block()
     */
	public void visit(final AsyncStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
	}

    /*
     * f0: '{'
     * f1: BlockStatement
     * f2: '}'
     */
	public void visit(final Block n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
	}

    /*
     * f0: final var declaration |
     *      updateable var declaration |
     *      statement
     */
	public void visit(final BlockStatement n) {
		n.f0.accept(this);
	}

    /*
     * f0: 'finish'
     * f1: Statement
     */
	public void visit(final FinishStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
	}

    /*
     * f0: 'if'
     * f1: '('
     * f2: Expression
     * f3: ')'
     * f4: Statement
     * f5: ElseClause?
     */
	public void visit(final IfStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
		n.f5.accept(this);
	}

    /*
     * f0: 'else'
     * f1: Statement
     */
	public void visit(final ElseClause n) {
		n.f0.accept(this);
		n.f1.accept(this);
	}

    /*
     * f0: 'for'
     * f1: '('
     * f2: PointType
     * f3: ExplodedSpecification
     * f4: ':'
     * f5: Expression
     * f6: ');
     * f7: Statement
     */
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

    /*
     * f0: Expression
     * f1: ';'
     */
	public void visit(final PostfixStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
	}

    /*
     * f0: 'System.out.println'
     * f1: '('
     * f2: Expression
     * f3: ')'
     * f4: ';'
     */
	public void visit(final PrintlnStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
	}

    /*
     * f0: 'return'
     * f1: Expression
     * f2: ';'
     */
	public void visit(final ReturnStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
	}

    /*
     * f0: 'throw'
     * f1: 'new'
     * f2: 'RuntimeException'
     * f3: '('
     * f4: Expression
     * f5: ')'
     * f6: ';'
     */
	public void visit(final ThrowStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
		n.f5.accept(this);
		n.f6.accept(this);
	}

    /*
     * f0: 'while'
     * f1: '('
     * f2: Expression
     * f3: ')'
     * f4: Statement
     */
	public void visit(final WhileStatement n) {
		n.f0.accept(this);
		n.f1.accept(this);
		n.f2.accept(this);
		n.f3.accept(this);
		n.f4.accept(this);
	}

}

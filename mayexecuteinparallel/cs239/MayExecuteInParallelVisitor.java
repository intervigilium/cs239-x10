package cs239;

import syntaxtree.*;
import visitor.*;
import java.util.*;

public class MayExecuteInParallelVisitor extends DepthFirstVoidVisitor {

    private HashMap<INode, Mol> statements;

    public MayExecuteInParallelVisitor() {
        statements = new HashMap<INode, Mol>();
    }

    private static HashSet<LabelPair> symCross(HashSet<INode> l0, HashSet<INode> l1) {
        HashSet<LabelPair> res = new HashSet<LabelPair>();
        for (Iterator<INode> i = l0.iterator(); i.hasNext(); ) {
            INode n0 = i.next();
            for (Iterator<INode> j = l1.iterator(); j.hasNext(); ) {
                INode n1 = i.next();
                res.add(new LabelPair(n0, n1));
            }
        }
        return res;
    }

    public void printOutput() {
        for (Mol mol : statements.values()) {
            for (Iterator<LabelPair> i = mol.m.iterator(); i.hasNext(); ) {
                LabelPair p = i.next();
                System.out.println(p.left.toString() + " " + p.right.toString());
            }
        }
    }

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
     * f4: Block
     */
	public void visit(final AsyncStatement n) {
        super.visit(n);
        
        Mol current = new Mol();

        Mol expression = statements.get(n.f2);
        Mol block = statements.get(n.f4);
        // should not be null since these are guaranteed to have been visited

        current.m.addAll(block.m);
        current.o.addAll(block.l);
        current.l.addAll(block.l);
        current.l.add(n);

        statements.put(n, current);
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
        super.visit(n);
	}

    /*
     * f0: 'finish'
     * f1: Statement
     */
	public void visit(final FinishStatement n) {
        super.visit(n);

        Mol current = new Mol();
        Mol statement = statements.get(n.f1);

        current.m.addAll(statement.m);
        current.l.addAll(statement.l);
        current.l.add(n);

        statements.put(n, current);
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
        super.visit(n);

        Mol current = new Mol();
        Mol statement = statements.get(n.f7);

        current.m.addAll(statement.m);
        current.m.addAll(symCross(statement.o, statement.l));
        current.o.addAll(statement.o);
        current.l.addAll(statement.l);
        current.l.add(n);

        statements.put(n, current);
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
        super.visit(n);

        Mol current = new Mol();
        Mol statement = statements.get(n.f4);

        current.m.addAll(statement.m);
        current.m.addAll(symCross(statement.o, statement.l));
        current.o.addAll(statement.o);
        current.l.addAll(statement.l);
        current.l.add(n);

        statements.put(n, current);
	}

}

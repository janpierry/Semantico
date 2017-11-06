package syntacticTree;

import parser.*;


public class AtribNode extends StatementNode {
    public ExpreNode expr1;
    public ExpreNode expr2;

    public AtribNode(Token t, ExpreNode e1, ExpreNode e2, MethodCallNode e3) {
        super(t);
        expr1 = e1;
        expr2 = e2;
    }
}

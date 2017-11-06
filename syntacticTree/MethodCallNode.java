package syntacticTree;

import parser.*;


public class MethodCallNode extends StatementNode {
	public ListNode parametros;

    public MethodCallNode(Token t, ListNode p) {
        super(t);
        parametros = p;
    }
}
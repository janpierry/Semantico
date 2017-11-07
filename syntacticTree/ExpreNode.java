package syntacticTree;

import parser.*;


abstract public class ExpreNode extends GeneralNode {
    public MethodCallNode methodCall;

    public ExpreNode(Token t) {
        super(t);
    }

    public ExpreNode(MethodCallNode m){
    	super(null);
    	methodCall = m;
    }
}

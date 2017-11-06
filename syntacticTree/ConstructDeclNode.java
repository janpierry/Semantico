package syntacticTree;

import parser.*;


public class ConstructDeclNode extends GeneralNode {
    
    public Token construtor;
    public MethodBodyNode body;

    public ConstructDeclNode(Token a, Token t, MethodBodyNode m) {
        super(a);
        construtor = t;
        body = m;
    }
}

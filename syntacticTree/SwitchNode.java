package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
    public Token variavel;
    public Token lbrace;
    public StatementNode statement;

    public SwitchNode(Token a, Token b, Token c, StatementNode s) {
        super(a);
        variavel = b;
        lbrace = c;
        statement = s;
    }

}

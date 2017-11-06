package syntacticTree;

import parser.*;


public class VarDeclNode extends StatementNode {
    public ListNode vars;
    public Token hasfinal;
    public PrimitiveTypeNode tipo;
    public Token tipoClasse;

    public VarDeclNode(Token a, Token b, PrimitiveTypeNode c, Token t, ListNode p) {
        super(a);
        hasfinal = b;
        if(c == null){
        	tipoClasse = t;
        }else{
        	tipo = c;
        }
        vars = p;
    }
}

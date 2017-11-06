package syntacticTree;

import parser.*;


public class MethodDeclNode extends GeneralNode {
    public int dim;
    public Token isFinal;
    public Token tipoClasse;
    public PrimitiveTypeNode tipo;
    public Token name;
    public MethodBodyNode body;

    public MethodDeclNode(Token a, Token b, PrimitiveTypeNode c, Token t, int k, Token t2, MethodBodyNode m) {
        super(a);
        isFinal = b;
        if(c == null){
        	tipoClasse = t1;
        }else{
        	tipo = c;
        }
        dim = k;
        name = t2;
        body = m;
    }
}

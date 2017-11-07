package syntacticTree;

import parser.*;


public class NewArrayNode extends ExpreNode {
	public PrimitiveTypeNode tipo = null;
    public Token name = null;;
    public ListNode dims;

    public NewArrayNode(Token t, PrimitiveTypeNode a, Token t2, ListNode d) {
        super(t);
        if(a == null){
        	name = t2;
        }else{
        	tipo = a;
        }
        
        dims = d;
    }
}

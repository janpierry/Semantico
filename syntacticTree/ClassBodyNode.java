package syntacticTree;

import parser.*;


public class ClassBodyNode extends GeneralNode {
    public ListNode clist; // lista de classes aninhadas
    public ListNode vlist; // lista de vari�veis da classe
    public ListNode ctlist; // lista de construtores
    public ListNode mlist; // lista de m�todos  
    public ListNode aslist; //lista de atribui��es de valores � vari�veis

    public ClassBodyNode(Token t1, ListNode c, ListNode v, ListNode as, ListNode ct,
        ListNode m) {
        super(t1); // passa token de refer�ncia para construtor da superclasse
        clist = c;
        vlist = v;
        aslist = as;
        ctlist = ct;
        mlist = m;
    }
}

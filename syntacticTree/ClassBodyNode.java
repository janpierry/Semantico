package syntacticTree;

import parser.*;


public class ClassBodyNode extends GeneralNode {
    public ListNode clist; // lista de classes aninhadas
    public ListNode vlist; // lista de variáveis da classe
    public ListNode ctlist; // lista de construtores
    public ListNode mlist; // lista de métodos  
    public ListNode aslist; //lista de atribuições de valores à variáveis

    public ClassBodyNode(Token t1, ListNode c, ListNode v, ListNode as, ListNode ct,
        ListNode m) {
        super(t1); // passa token de referência para construtor da superclasse
        clist = c;
        vlist = v;
        aslist = as;
        ctlist = ct;
        mlist = m;
    }
}

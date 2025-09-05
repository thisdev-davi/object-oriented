package trabalho;

import java.util.LinkedList;

public class PilhaPaginas {
    private LinkedList<Pagina> stack;

    public PilhaPaginas(){
        this.stack = new LinkedList<>();
    }

    public void push(Pagina novaPagina){
        this.stack.addFirst(novaPagina);
    }

    public Pagina pop(){
        return this.stack.removeFirst();
    }

    public Pagina top(){
        return this.stack.getFirst();
    }

    public boolean isEmpty(){
        return this.stack.size()==0;
    }
}

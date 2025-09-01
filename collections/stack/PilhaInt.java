package collections.stack;

import java.util.LinkedList;

public class PilhaInt {
    private LinkedList<Integer> stack;

    public PilhaInt(){
        this.stack = new LinkedList<>();
    }

    public boolean isEmpty(){
        return (this.stack.size()==0);
    }

    public int size(){
        return this.stack.size();
    }

    public int top(){
        return this.stack.getFirst();
    }

    public void push(int num){
        this.stack.addFirst(num);
    }

    public int pop(){
        return this.stack.removeFirst();
    }
}

package collections.queue;
import java.util.LinkedList;

public class FilaInt {
    private LinkedList<Integer> queue;

    public FilaInt(){
        this.queue = new LinkedList<>();
    }

    public boolean isEmpty(){
        return (this.queue.isEmpty());
    }

    public int size(){
        return this.queue.size();
    }

    public int peek(){
        return this.queue.getFirst();
    }

    public void enqueue(int num){
        this.queue.addLast(num);
    }

    public int dequeue(){
        return this.queue.removeFirst();
    }
}
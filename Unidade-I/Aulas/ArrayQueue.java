public class ArrayQueue implements Queueable {
    private Object [] data;
    private int head;
    private int tail;

    public ArrayQueue(){
        this(10);
    }
    public ArrayQueue(int length) {
        
    }
    @Override
    public void enqueue(Object data) {
        if (isFull()){
            System.err.println("A fila está cheia!");
        } else {
            tail++;
        }
    }
    
}

public LinkedList<T> implements Listable<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int capacity;
    private int elements;

    public LinkedList() {
    }

    LinkedList(){
        this(10);

    }
    LinkedList(int capacity){
        this.capacity = capacity;
        this.elements = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void append(T data) {
        if (isFull()) {
            throw new OverflowException("Lista cheia");
        }
        DoubleNode<T> newData = new DoubleNode<T>(data);
        if (!isEmpty())
            tail.setNext(newData);
        else
            head = newData;    
        newData.setPrevious(tail);
        tail = newData;
        elements++;
    }
    @Override
    public T select(int index){
        T data = null;
        
    }
    }

    @Override
    public T[] selectAll() {
        Object[] temp = new T[10];
        DoubleNode<T> aux = head;
        for (int i = 0; i < elements; i++) {
            temp[i] = aux.getData();
            aux = aux.getNext();
        }
        return temp;
    }

    @Override
    public void update(int index, T data) {
        DoubleNode<T> aux = head;
        for (int i = 0; i < index; i++){
            aux = aux.getNext();
        }
        aux.setData(data);
    }

    @Override
    public int size(){
        return elements;
    }
    
    @Override
    public boolean isEmpty(){
        return elements == 0;
    }
    
    @Override
    public boolean isFull(){
        return elements == capacity;
    }
   
    @Override
    String print(){
        String result = "";
        DoubleNode<T> aux = head;
        for (int i = 0; i < elements; i++) {
            result += aux.getData();
            if( i != elements-1)
                result += ", ";
            aux = aux.getNext();
            
        }
        return "[" + result + "]";
    }

}
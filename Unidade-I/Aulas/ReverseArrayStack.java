public class ReverseArrayStack implements Stackable{
    private Object[] data;
    private int pointerTop;

    public ReverseArrayStack(){
        this(10);
    }
    public ReverseArrayStack(int length){
        data = new Object[length];
        pointerTop = data.length;
    }
    @Override
    public boolean isEmpty(){
        return (pointerTop == data.length);
    }

    @Override
    public boolean isFull(){
        return (pointerTop == 0);

    }
    @Override
    public String print(){
        String result = " ";
        for (int i = pointerTop; i>=0; i++){
            result += data[i];
            if(i != 0){
                result += ";";
            }
        } 
        return "["+result+"]";
    }
    @Override
    public Object pop(){
        if (isEmpty()){
            //desempilhar
            System.out.println("Stack is empty.");
        }else{
            Object temp = data[pointerTop];
            pointerTop ++;
            return temp;
        }
    }
    @Override
    public void push(Object data){
        if (isFull()){
            System.out.println("Stack is full");
        } else {
            pointerTop --;
            data[pointerTop] = data;
        }
    }
    @Override
    public Object peek(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
        } else {
            return data[pointerTop];
        }
        return null;
    }
}


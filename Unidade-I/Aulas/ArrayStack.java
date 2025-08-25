public class ArrayStack implements Stackable{
   
    //variáveis de instâncias
    private Object[] data;
    private int pointerTop;
   
    //construtores
    public ArrayStack(){
        this(10);
    }

    public ArrayStack (int length){
        data = new Object[length];
        pointerTop = -1;
    }

    //métodos auxiliares
    @Override
    public boolean isEmpty(){
        return (pointerTop == -1);
    }
    @Override
    public boolean isFull(){
        return (pointerTop == data.length -1);
    }
    @Override
    public String print(){
        String result = " ";
        for (int i = pointerTop; i >= 0; i--){
            //iterar elementos do Array
            result += data[i];
            if(i != 0){
                result += ";";
            }
        } 
        return "["+result+"]";
    }

    //métodos principais
    @Override
    public Object pop(){
        if (isEmpty()){
            //desempilhar
            System.out.println("Stack is empty.");
        }else{
            Object temp = data[pointerTop];
            pointerTop --;
            return temp;
        }
    }
    @Override
    public void push(Object data){
        if (isFull()){
            //empilhar
            System.out.println("Stack is full.");
        } else {

        }
    }
    @Override
    public Object peek(){
        //espiar
        if (isEmpty()){
            System.out.println("Stack is empty.");
        } else {
            return data[pointerTop];
        }
        return null;
    }
}
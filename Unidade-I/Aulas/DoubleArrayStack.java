public class DoubleArrayStack implements Stackable {
    private Object[] data[];
    private int pointerTop1;
    private int pointerTop2;

    public DoubleArrayStack(){
        this(10);
    }

    public DoubleArrayStack(int length){
        data = new Object[length];
        pointerTop1 = data.length;
        pointerTop2 = -1;
    }
    public boolean isEmpty(){
        return pointerTop1 == data.length;
    }
    public boolean isEmpty2(){
        return pointerTop2 == -1;
    }
    public boolean isFull(){
        return pointerTop2 == pointerTop1;
    }
    public boolean isFull2(){
        return isFull();
    }
    public String print(){
        String result = "";
        for (int i = pointerTop1; i >=0; i++){
            result += data[i];
            if(i !=0){
                result += ";";
            }
        } return "["+result+"]";
    } 

    public String print2(){
        String result = "";
        for (int i = pointerTop2; i >=0; i--){
            result += data[i];
            if(i !=0){
                result += ";";
            }
        } return "["+result+"]";
    } 
    public Object pop(){
        Object temp = null;
    }
}

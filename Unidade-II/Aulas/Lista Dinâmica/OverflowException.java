public class OverflowException extends RuntimeException {
    
    OverflowException() {
        super(); //coisas que o filho faz
    }
    
    public void getMessage(String message){
        System.out.println(message);
    }
}
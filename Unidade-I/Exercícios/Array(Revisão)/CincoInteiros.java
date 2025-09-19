import java.util.Scanner;

public class CincoInteiros{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5 números inteiros:");
        for (int i = 0; i < 5; i++){
            System.out.println("Número "+ (i+1) + ": ");
            num[i] = input.nextInt();
        }
        System.out.println("Números digitados:");
        for(int numero : num){
            System.out.println(numero);
        }

        input.close();
    }
}
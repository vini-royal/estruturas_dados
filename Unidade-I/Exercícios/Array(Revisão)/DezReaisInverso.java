import java.util.Scanner;
public class DezReaisInverso {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] num = new double[10];

    for(int i = 0; i < 10; i++){
        System.out.println("Digite o número " + (i+1) + ": ");
        num[i] = input.nextDouble();
    }
    System.out.println("Números digitados em ordem inversa: ");
    for(int i = 9; i >= 0; i--){
        System.out.println(num[i]);
    }
    input.close();
 }
}
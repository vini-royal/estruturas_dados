import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] par = new int[20];
        int[] impar = new int[20];
        int qtdPares = 0;
        int qtdImpares = 0;

        for(int i = 0; i < 20; i++){
            System.out.println("Digite o " + (i+1) + "o número: ");
            int num = input.nextInt();

            if(num % 2 ==0){
                par[qtdPares] = num;
                qtdPares++;
            } else {
                impar[qtdImpares] = num;
                qtdImpares++;
            }
        }
        System.out.println("Números pares: ");
        for(int i = 0; i < qtdPares; i++){
            System.out.println(par[i] + " ");
        }
        System.out.println("Números ímpares: ");
        for(int i = 0; i < qtdImpares; i++){
            System.out.println(impar[i] + " ");
        }

    }
}

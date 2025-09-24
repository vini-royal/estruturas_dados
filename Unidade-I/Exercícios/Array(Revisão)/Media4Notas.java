import java.util.Scanner;
public class Media4Notas {

    public static void main(String[] args){
        double soma = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];

        System.out.println("Digite suas 4 notas: ");
        for (int i = 0; i < 4; i++){
            notas[i] = input.nextDouble();
        }
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
            media = soma / 4;
        }
        System.out.println("Sua média é: " + media);
    }
}
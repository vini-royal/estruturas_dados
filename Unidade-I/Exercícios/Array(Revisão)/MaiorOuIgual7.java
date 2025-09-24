import java.util.Scanner;
public class MaiorOuIgual7 {
   
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] medias = new double[10];
    int alunosAprovados = 0;

    for(int i = 0; i < 10; i++){
        double soma = 0;
        System.out.println("Aluno "+ (i+1) + ":");

       for(int j = 0; j <4; j++){
        System.out.println("Insira a "+ (j+1) + "ª nota: ");
        soma += input.nextDouble();
       }
        medias[i] = soma / 4;
    }

    for (int k = 0; k < 10; k++){
        if(medias[k] >= 7){
            alunosAprovados++;
        }
    }
    System.out.println("Alunos aprovados: " + alunosAprovados);
   }
}
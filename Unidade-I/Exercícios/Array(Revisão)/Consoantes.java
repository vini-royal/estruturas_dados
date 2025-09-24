import java.util.Scanner;
public class Consoantes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[] caracteres = new char[10];
        int qtdConsoantes = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o "+ (i+1) + "º caractere: ");
            char c = input.next().charAt(0);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                caracteres[i] = c;
                qtdConsoantes++;
            }

        }
        System.out.println("Número de consoantes: " +qtdConsoantes);
    }
}
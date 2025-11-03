import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoUtil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        int opcao;

        do { 
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Listar alunos de um curso específico");
            System.out.println("3 - Listar alunos por ano e semestre de ingressão");
            System.out.println("4 - Exibir quantidade total de alunos cadastrados");
            System.out.println("0 - Encerrar o programa");

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno(input, alunos);
                    break;
                case 2:
                    listarPorCurso(input, alunos);
                    break;
                case 3:
                    listarPorAnoSemestre(input, alunos);
                    break;
                case 4:
                    exibirQuantidadeTotal(alunos);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
        input.close();
    }
    
    //(1)
    private static void cadastrarAluno(Scanner input, List<Aluno> alunos) {
        while (true) {
            System.out.println("\n--- Cadastrando Alunos ---");

            System.out.print("Matrícula: ");
            int matricula = input.nextInt();
            input.nextLine();

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Sexo (M ou F): ");
            String sexo = input.nextLine();

            System.out.print("Curso: ");
            String curso = input.nextLine();

            System.out.print("Ano de Ingresso: ");
            int anoIngresso = input.nextInt();
            input.nextLine();

            System.out.print("Semestre de Ingresso (1 ou 2): ");
            int semestreIngresso = input.nextInt();
            input.nextLine();

            Aluno novo = new Aluno(matricula, nome, sexo, curso, anoIngresso, semestreIngresso);

            alunos.add(novo);

            System.out.println("Aluno cadastrado!");

            System.out.println("Cadastrar novo aluno? (S/N)");
            String resposta = input.nextLine();

            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida! Digite apenas S ou N:");
                resposta = input.nextLine();
            }
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }   
    }
    
    //(2)
    private static void listarPorCurso(Scanner input, List<Aluno> alunos){
        System.out.println("Digite o nome do curso: ");
        String curso = input.nextLine();
        boolean existe = false;

        System.out.println("\n--- Alunos do curso " + curso + " ---");

        for (Aluno a : alunos) {
            if (a.getCurso().equalsIgnoreCase(curso)) {
                System.out.println("Matrícula: " + a.getMatricula());
                System.out.println("Nome: " + a.getNome());
                System.out.println("Sexo: " + a.getSexo());
                System.out.println("Ano de Ingresso: " + a.getAnoIngresso());
                System.out.println("Semestre de Ingresso: " + a.getSemestreIngresso());
                System.out.println("------------------");
                existe = true;
            }
        }

        if(!existe){
            System.out.println("Nenhum aluno foi encontrado neste curso.");
        }

    }
    //(3)
    private static void listarPorAnoSemestre(Scanner input, List<Aluno> alunos){
        System.out.println("Digite o ano de ingresso: ");
        int ano = input.nextInt();
        input.nextLine();

        System.out.println("Digite o semestre de ingresso (1 ou 2): ");
        int semestre = input.nextInt();
        input.nextLine();

        boolean existe = false;
        System.out.println("\n--- Alunos do ano " + ano + " e semestre " + semestre + " ---");

        for (Aluno a : alunos) {
            if (a.getAnoIngresso() == ano && a.getSemestreIngresso() == semestre) {
                System.out.println("Matrícula: " + a.getMatricula());
                System.out.println("Nome: " + a.getNome());
                System.out.println("Sexo: " + a.getSexo());
                System.out.println("Curso: " + a.getCurso());
                System.out.println("------------------");
                existe = true;
            }
        }
        if(!existe){
            System.out.println("Nenhum aluno foi encontrado neste ano e semestre.");
        }
    }

    //(4)
    private static void exibirQuantidadeTotal(List<Aluno> alunos){
        System.out.println("Quantidade total de alunos cadastrados: " + alunos.size());
    }
        

}
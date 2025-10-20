import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaGestaoAcademica sistema = new SistemaGestaoAcademica();

        System.out.println("Sistema de Gestão Acadêmica");
        System.out.println("Digite o número de alunos a serem cadastrados:");

        int quantidadeAlunos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = sc.nextLine();

            System.out.println("Digite a primeira nota de " + nome + ":");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota de " + nome + ":");
            double nota2 = sc.nextDouble();

            System.out.println("Digite a terceira nota de " + nome + ":");
            double nota3 = sc.nextDouble();
            sc.nextLine();
            sistema.cadastrarAluno(nome, nota1, nota2, nota3);
        }

        sistema.gerarRelatorio();
        sc.close();
    }
}
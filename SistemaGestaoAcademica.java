import java.util.ArrayList;

public class SistemaGestaoAcademica {
    private ArrayList<Aluno> alunos;

    public SistemaGestaoAcademica() {
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, double nota1, double nota2, double nota3) {
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        alunos.add(aluno);
    }

    public void gerarRelatorio() {
        System.out.println("Relatório Final:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Notas: ");
            for (double nota : aluno.getNotas()) {
                System.out.println(nota);
            }
            System.out.println("Média: " + aluno.calcularMedia());
            System.out.println("Situação: " + aluno.situacao());
            System.out.println("-------------------------------");
        }
    }
}
public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.notas = new double[]{nota1, nota2, nota3};
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String situacao() {
        double media = calcularMedia();
        return media >= 7 ? "Aprovado" : "Reprovado";
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
}
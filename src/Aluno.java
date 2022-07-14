import java.util.Scanner;

public class Aluno {

    protected double nota1 = 0;
    protected double nota2 = 0;
    protected double media = 0;
    private String nome;

    public Aluno (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getMedia() {
        return this.media;
    }

    public void perguntaNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira Nota: ");
        this.nota1 = scanner.nextDouble();
        System.out.println("Segunda Nota: ");
        this.nota2 = scanner.nextDouble();
    }

    public void calculaMedia() {
        this.media = (this.nota1 + this.nota2) / 2;
    }

    public String pegaSituacao() {
        if (this.media >= 7) {
            return "APROVADO";
        }
        if (this.media >= 5) {
            return "EM RECUPERAÇÃO";
        }
        return "REPROVADO";
    }
}
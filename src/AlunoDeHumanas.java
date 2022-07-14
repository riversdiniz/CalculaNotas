import java.util.Scanner;

public class AlunoDeHumanas extends Aluno{

    protected double nota3 = 0;
    protected double nota4 = 0;

    public AlunoDeHumanas(String nome) {
        super(nome);
    }

    public void perguntaNotas() {
        super.perguntaNotas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Terceira Nota: ");
        this.nota3 = scanner.nextDouble();
        System.out.println("Quarta Nota: ");
        this.nota4 = scanner.nextDouble();
    }

    public void calculaMedia() {
        super.media = (super.nota1 + super.nota2 + this.nota3 + this.nota4) / 4;
    }
}

import java.util.Scanner;

public class TestaCalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de media de alunos!");
        System.out.println("Digite o Nome do Aluno: ");

        String nome = scanner.nextLine();
        Aluno aluno;
        System.out.println("É aluno especial? (1 = Sim, 0 = Não)");
        Integer resposta = scanner.nextInt();
        if (resposta == 1) {
            aluno = new AlunoEspecial(nome);
        } else {
            System.out.println("É aluno de exatas? (1 = Sim, 0 = Não)");
            resposta = scanner.nextInt();
            if (resposta == 1) {
                aluno = new AlunoDeExatas(nome);
            } else {
                aluno = new Aluno(nome);
            }
        }

        aluno.perguntaNotas();
        aluno.calculaMedia();

        System.out.println("A situacao do aluno " + aluno.getNome());
        System.out.println("é " + aluno.pegaSituacao());

    }
}
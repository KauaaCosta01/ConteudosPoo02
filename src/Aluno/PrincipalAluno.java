package Aluno;
import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        System.out.println("\n=== Informações Aluno===");
        System.out.println("Digite seu nome: ");
        aluno1.setNome(scanner.nextLine());

        System.out.println("Digite Três notas de 0 a 10!");
        System.out.println("Digite sua primeira nota: ");
        aluno1.setNota1(scanner.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        aluno1.setNota2(scanner.nextDouble());

        System.out.println("Digite sua terceira nota: ");
        aluno1.setNota3(scanner.nextDouble());

        aluno1.exibeInformacoesAluno();
        System.out.printf("Média das Três notas: %.2f", aluno1.calculaMedia());

        System.out.println();

        scanner.nextLine();

        System.out.println("\n=== Aluno 2 ===");
        System.out.println("Digite seu nome: ");
        aluno2.setNome(scanner.nextLine());

        System.out.println("Digite Três notas de 0 a 10!");
        System.out.println("Digite sua primeira nota: ");
        aluno2.setNota1(scanner.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        aluno2.setNota2(scanner.nextDouble());

        System.out.println("Digite sua terceira nota: ");
        aluno2.setNota3(scanner.nextDouble());

        aluno2.exibeInformacoesAluno();
        System.out.printf("Média das Três notas: %.2f", aluno2.calculaMedia());

        scanner.close();
    }
}

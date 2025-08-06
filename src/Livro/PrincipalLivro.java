package Livro;
import java.util.Scanner;

public class PrincipalLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro();

        System.out.println("Digite o nome do Autor: ");
        livro1.setAutor(scanner.nextLine());
        System.out.println("Digite o nome do Livro: ");
        livro1.setTitulo(scanner.nextLine());
        System.out.println("Digite o ano de Lancamento: ");
        livro1.setAnoLancamento(scanner.nextInt());

        livro1.exibeInfoLivro();
        scanner.close();
    }
}

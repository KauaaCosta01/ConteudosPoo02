package Pessoa;

import java.util.Scanner;

public class principalPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        idadePessoa pessoa1 = new idadePessoa();

        System.out.println("Digite seu nome: ");
        pessoa1.setNome(scanner.next());

        System.out.println("Digite sua idade: ");
        pessoa1.setIdade(scanner.nextInt());

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos de idade!");
        pessoa1.verificarIdade();

        idadePessoa pessoa2 = new idadePessoa();

        System.out.println("\nDigite seu nome: ");
        pessoa2.setNome(scanner.next());

        System.out.println("Digite sua idade: ");
        pessoa2.setIdade(scanner.nextInt());

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos de idade!");
        pessoa2.verificarIdade();
    }
}

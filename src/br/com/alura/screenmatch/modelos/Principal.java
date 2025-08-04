package br.com.alura.screenmatch.modelos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme meuFilme = new Filme();
        System.out.println("Digite o nome do filme: ");
        meuFilme.setNome(scanner.nextLine());

        System.out.println("Digite o ano de Lançamento do Filme: ");
        meuFilme.setAnoDeLancamento(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Esta Incluído no Plano? (true/false)");
        meuFilme.setIncluidoNoPlano(scanner.nextBoolean());

        System.out.println("Duração do filme em minutos: ");
        meuFilme.setDuracaoEmMinutos(scanner.nextInt());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Soma das Avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Média total das avaliações: " + meuFilme.pegaMedia());
    }
}
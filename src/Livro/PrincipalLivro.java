package Livro;

public class PrincipalLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo("O poderoso Chefão");
        livro1.setAutor("Kauã Costa");

        livro2.setTitulo("Lógica de Programação");
        livro2.setAutor("Paulo Silveira");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}

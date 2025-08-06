package Livro;

public class Livro {
    private String titulo;
    private String autor;
    private int anoLancamento;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void exibeInfoLivro() {
        System.out.println("=== Informações do Livro ===");
        System.out.println("Nome do Autor: " + getAutor());
        System.out.println("Nome do Livro: " + getTitulo());
        System.out.println("Data de Lancamento: " + getTitulo());
    }
}

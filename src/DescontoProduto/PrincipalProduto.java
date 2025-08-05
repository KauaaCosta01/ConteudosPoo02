package DescontoProduto;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 2580.0);

        System.out.println("Nome do DescontoProduto.Produto: " + produto1.getNome());
        System.out.println("Preço cdo DescontoProduto.Produto: " + produto1.getPreco());

        produto1.aplicarDesconto(10);
        System.out.println("Novo Preço com Desconto: " + produto1.getPreco());
    }
}

package ContaBancaria;

public class ContaBancaria {
    public String Titular;
    private int numeroConta;
    private double Saldo;

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void exibeInfoBancaria() {
        System.out.println("\n=== Informações Bancárias ===");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero Conta: " + getNumeroConta());

    }
}

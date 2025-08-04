package ContaBancaria;

public class ContaBancaria {
    public String Titular;
    private int numeroConta;
    private double Saldo;

    public void exibirInfoContaBancaria(){
        System.out.println("Titular: " + Titular);
        System.out.println("Numero Conta: " + numeroConta);
        System.out.println("Saldo: " + Saldo);
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public void setnumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTitual() {
        return  Titular;
    }

    public int getnumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }
}

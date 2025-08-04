package ContaBancaria;

import java.util.Scanner;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Digite o nome do Titular: ");
        conta1.setTitular(scanner.next());

        System.out.println("Digite o numero da Conta: ");
        conta1.setnumeroConta(scanner.nextInt());

        conta1.setSaldo(1500.90);

        conta1.exibirInfoContaBancaria();

        scanner.close();
    }
}
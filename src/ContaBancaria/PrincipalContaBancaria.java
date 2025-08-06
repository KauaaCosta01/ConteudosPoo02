package ContaBancaria;

import java.util.Scanner;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Digite o nome do Titular: ");
        conta1.setTitular(scanner.nextLine());
        System.out.println("Digite o número da Conta: ");
        conta1.setNumeroConta(scanner.nextInt());
        conta1.setSaldo(1589);
        System.out.println("Saldo Atual: " +  conta1.getSaldo());

        conta1.exibeInfoBancaria();
        System.out.println("\n=== Escolha uma opção ===");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Realizar Transferencia");
        System.out.println("3 - Receber Transferencia");
        System.out.println("4 - Sair");

        int opcao = scanner.nextInt();
        while (opcao != 4) {
            if (opcao == 1) {
                System.out.println("Saldo Atual: " +  conta1.getSaldo());
                return;
            } else if (opcao == 2) {
                System.out.println("Digite o valor da Transferencia: ");
                int valor = scanner.nextInt();
                if (conta1.getSaldo() < valor) {
                    System.out.println("Saldo insuficiente! ");
                } else {
                    System.out.printf("Transferencia de R$ " + valor + " realizada com sucesso!");
                    System.out.println("Saldo Atual: " +  (conta1.getSaldo() - valor));
                    return;
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor da Transferencia que deseja receber: ");
                int valor = scanner.nextInt();
                System.out.println("Valor de R$: " + valor + " recebido com sucesso!");
                System.out.println("Saldo Atual: " +  (conta1.getSaldo() + valor));
                return;
            } else {
                System.out.println("Programa finalizado!");
                break;
            }
        }

    }
}
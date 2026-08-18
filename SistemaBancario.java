import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        // Inicialização do Scanner e das variáveis principais
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean executando = true;
        

        while (executando) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Extrato / Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

       
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        historico.add(String.format("Depósito: +R$ %.2f", valorDeposito));
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido para saque.");
                    } else if (valorSaque > saldo) {
                        System.out.println("Erro: Saldo insuficiente!");
                    } else {
                        saldo -= valorSaque;
                        historico.add(String.format("Saque:    -R$ %.2f", valorSaque));
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- EXTRATO DETALHADO ---");
                    if (historico.isEmpty()) {
                        System.out.println("Nenhuma movimentação realizada até o momento.");
                    } else {
                        for (String registro : historico) {
                            System.out.println(registro);
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
                    break;

                case 4:
                    executando = false;
                    System.out.println("\nObrigado por utilizar nosso sistema bancário. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
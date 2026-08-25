import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 100.0;
        boolean executando = true;

        while (executando) {
            System.out.println("======== BEM VINDO AO BANCO=========");
            System.out.println("Digite 1 para Depositar");
            System.out.println("Digite 2 para Sacar");
            System.out.println("Digite 3 para Extrato");
            System.out.println("Digite 4 para Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Lógica do Depósito
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
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
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 3:
                    
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 4:
                  
                    executando = false;
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

   
        scanner.close();
    }
}
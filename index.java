import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
   
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
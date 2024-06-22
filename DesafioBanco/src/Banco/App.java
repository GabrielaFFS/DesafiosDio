package Banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNome("Gabriela");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        while (true) {
            System.out.println(" Escolha uma opção:");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Sacar da Conta Corrente");
            System.out.println("3. Depositar na Conta poupança");
            System.out.println("4. Extrato Conta Corrente");
            System.out.println("5. Extrato Conta Poupança");
            System.out.println("6. Sair");
            
            try {
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor do depósito:");
                        double valorDeposito = scanner.nextDouble();
                        contaCorrente.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                        break;
                    case 2:

                        System.out.println("Digite o valor que deseja depositar na Conta Poupança:");
                        double valorTransferencia = scanner.nextDouble();
                        contaCorrente.transferir(valorTransferencia, contaPoupanca);
                        System.out.println("Transferência realizada com sucesso!");
                    
                        
                        break;
                    case 3:
                        System.out.println("Digite o valor para sacar da Conta Corrente:");
                        double valorSaque = scanner.nextDouble();
                        contaCorrente.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                        
                        break;
                    case 4:
                        contaCorrente.imprimirExtrato();
                        break;
                    case 5:
                        contaPoupanca.imprimirExtrato();
                        break;
                    case 6:
                        System.out.println("Saindo... Até logo!");
                        scanner.close();
                        return; 
                    default:
                        System.out.println("Opção inválida. Por favor, insira uma das opções citadas.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); 
            }
        }
    }
}
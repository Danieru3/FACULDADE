package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de opções de pagamento requisitado na atividade
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");

        int choice = scanner.nextInt();

        // Solicitação do valor da transação
        System.out.print("Digite o valor da transação: R$ ");
        double amount = scanner.nextDouble();

        // Seleção da estratégia com base na escolha do usuário
        PaymentStrategy paymentStrategy = null;
        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        // Criar o processador de pagamento e processar a transação
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);
    }
}
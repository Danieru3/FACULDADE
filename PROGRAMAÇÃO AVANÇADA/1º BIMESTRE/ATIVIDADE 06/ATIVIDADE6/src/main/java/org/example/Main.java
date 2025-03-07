package org.example;
import java.util.Scanner;

// Classe principal que interage com o usuário e processa o pagamento
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de opções de pagamento
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");

        int option = scanner.nextInt();  // O usuário escolhe a opção de pagamento

        // Solicita o valor da transação
        System.out.print("Digite o valor da transação (R$): ");
        double amount = scanner.nextDouble();

        // Instancia a fábrica correspondente com base na escolha do usuário
        PaymentFactory paymentFactory = null;
        switch (option) {
            case 1:
                paymentFactory = new PixPaymentFactory();
                break;
            case 2:
                paymentFactory = new CreditCardPaymentFactory();
                break;
            case 3:
                paymentFactory = new BoletoPaymentFactory();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        // Cria a estratégia de pagamento utilizando a fábrica
        PaymentStrategy paymentStrategy = paymentFactory.createPaymentMethod();

        // Processa o pagamento com a estratégia escolhida
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);  // Executa o pagamento

        scanner.close();  // Fecha o scanner
    }
}

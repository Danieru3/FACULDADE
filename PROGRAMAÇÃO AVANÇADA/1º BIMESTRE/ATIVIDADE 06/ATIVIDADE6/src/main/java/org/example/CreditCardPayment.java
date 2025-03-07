package org.example;
import java.util.Scanner;

// Código que implementa a estratégia de Cartão de Crédito
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via cartão de crédito processado. Número do cartão: " + cardNumber);
    }
}

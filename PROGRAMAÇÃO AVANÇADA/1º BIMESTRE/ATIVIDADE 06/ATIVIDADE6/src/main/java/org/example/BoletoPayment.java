package org.example;

// Código de implementação da estratégia Boleto para os pagamentos
public class BoletoPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + (int) (Math.random() * 1000000);
        System.out.println("Pagamento via Boleto processado. Código do boleto: " + boletoCode);
    }
}

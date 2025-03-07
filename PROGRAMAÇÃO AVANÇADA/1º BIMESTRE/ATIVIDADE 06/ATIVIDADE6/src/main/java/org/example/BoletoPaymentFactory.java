package org.example;

// Fábrica para criar o método de pagamento via Boleto
public class BoletoPaymentFactory extends PaymentFactory {
    @Override
    public PaymentStrategy createPaymentMethod() {
        return new BoletoPayment();  // Retorna uma instância de BoletoPayment
    }
}

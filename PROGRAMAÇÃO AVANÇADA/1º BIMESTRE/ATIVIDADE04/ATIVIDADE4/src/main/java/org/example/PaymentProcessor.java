package org.example;

// Processador de Pagamento
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // Construtor que aceita uma estratégia de pagamento
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Metodo para processar o pagamento
    public void executePayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}

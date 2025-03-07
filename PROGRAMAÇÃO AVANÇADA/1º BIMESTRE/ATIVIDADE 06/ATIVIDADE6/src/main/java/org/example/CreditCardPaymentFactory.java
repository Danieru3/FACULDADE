package org.example;

// Fábrica para criar o metodo de pagamento via Cartão de Crédito
public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public PaymentStrategy createPaymentMethod() {
        return new CreditCardPayment();  // Retorna uma instância de CreditCardPayment
    }
}

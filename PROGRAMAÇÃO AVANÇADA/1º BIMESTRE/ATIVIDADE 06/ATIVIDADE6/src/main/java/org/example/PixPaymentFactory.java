package org.example;

// Fábrica para criar o metodo de pagamento via Pix
public class PixPaymentFactory extends PaymentFactory {
    @Override
    public PaymentStrategy createPaymentMethod() {
        return new PixPayment();  // Retorna uma instância de PixPayment
    }
}

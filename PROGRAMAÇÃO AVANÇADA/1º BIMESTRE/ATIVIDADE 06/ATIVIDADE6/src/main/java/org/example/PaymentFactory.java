package org.example;

// A Factory Method cria instâncias de PaymentStrategy dinamicamente, como solicitado no exercicio
public abstract class PaymentFactory {
    public abstract PaymentStrategy createPaymentMethod();
}

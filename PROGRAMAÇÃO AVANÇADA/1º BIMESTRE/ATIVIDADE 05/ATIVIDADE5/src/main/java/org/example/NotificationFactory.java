package org.example;

public class NotificationFactory {

    // Metodo estático para criar a notificação correta com base no tipo fornecido
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();  // Retorna a notificação de e-mail
            case "sms":
                return new SMSNotification();    // Retorna a notificação de SMS
            case "push":
                return new PushNotification();   // Retorna a notificação de Push Notification
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido.");
        }
    }
}

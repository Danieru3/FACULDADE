package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibindo as opções para o usuário
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");

        // Lendo a escolha do usuário
        int option = scanner.nextInt();
        scanner.nextLine(); // consumir o newline após o número
        String notificationType = "";

        // recebendo a escolha que o usuário fez para o tipo de notificação
        switch (option) {
            case 1:
                notificationType = "email";
                break;
            case 2:
                notificationType = "sms";
                break;
            case 3:
                notificationType = "push";
                break;
            default:
                System.out.println("Opção inválida.");
                return;  // Encerra o programa caso a opção seja inválida
        }

        // Solicitando a mensagem a ser enviada
        System.out.println("Digite a mensagem a ser enviada:");
        String message = scanner.nextLine();

        // criando a instância correta de notificação utilizando a fábrica
        Notification notification = NotificationFactory.createNotification(notificationType);

        // enviando a mensagem
        notification.send(message);

        scanner.close();
    }
}

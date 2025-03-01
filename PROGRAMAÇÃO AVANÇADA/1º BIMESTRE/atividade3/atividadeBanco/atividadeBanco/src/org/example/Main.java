package org.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente("12345", "João", 5000.0, 1000.0);
        ContaBancaria conta2 = new ContaPoupanca("67890", "Maria", 2000.0);
        ContaBancaria conta3 = new ContaInvestimento("11223", "Carlos", 3000.0);
        ContaBancaria conta4 = new ContaSalario("44556", "Ana", 1500.0, 500.0);
        ContaBancaria conta5 = new ContaInvestimentoAltoRisco("77889", "Fernanda", 20000.0);

        System.out.println("Teste Conta Corrente:");
        conta1.mostrarInformacoes();
        conta1.realizarSaque(5500.0); // Saque que usa o cheque especial
        conta1.mostrarInformacoes();

        System.out.println("\nTeste Conta Poupança:");
        conta2.mostrarInformacoes();
        conta2.realizarSaque(2500.0); // Saque maior que o saldo
        conta2.realizarSaque(1500.0); // Saque permitido
        conta2.mostrarInformacoes();

        System.out.println("\nTeste Conta Investimento:");
        conta3.mostrarInformacoes();
        conta3.realizarSaque(500.0); // Saque com taxa de 2%
        conta3.mostrarInformacoes();

        System.out.println("\nTeste Conta Salário:");
        conta4.mostrarInformacoes();
        conta4.realizarSaque(1000.0); // Primeiro saque grátis
        conta4.realizarSaque(500.0); // Saque com taxa
        conta4.mostrarInformacoes();

        System.out.println("\nTeste Conta Investimento Alto Risco:");
        conta5.mostrarInformacoes();
        conta5.realizarSaque(5000.0); // Saque permitido
        conta5.realizarSaque(500.0); // Saque não permitido, saldo insuficiente
        conta5.mostrarInformacoes();
    }
}


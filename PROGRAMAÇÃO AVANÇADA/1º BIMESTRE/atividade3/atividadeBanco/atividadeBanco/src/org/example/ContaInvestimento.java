package org.example;

class ContaInvestimento extends ContaBancaria {

    public ContaInvestimento(String numeroContaBancaria, String nomeTitular, double saldoConta) {
        super(numeroContaBancaria, nomeTitular, saldoConta);
    }

    @Override
    public boolean realizarSaque(double valor) {
        double valorComTaxa = valor * 1.02;  // Aplica uma taxa de 2% sobre o saque
        if (valorComTaxa <= saldoConta) {
            saldoConta -= valorComTaxa;
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }
}


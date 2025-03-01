package org.example;

class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numeroContaBancaria, String nomeTitular, double saldoConta) {
        super(numeroContaBancaria, nomeTitular, saldoConta);
    }

    @Override
    public boolean realizarSaque(double valor) {
        if (valor <= saldoConta) {
            saldoConta -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }
}


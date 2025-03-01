package org.example;

class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroContaBancaria, String nomeTitular, double saldoConta, double limiteChequeEspecial) {
        super(numeroContaBancaria, nomeTitular, saldoConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean realizarSaque(double valor) {
        if (valor <= saldoConta + limiteChequeEspecial) {
            saldoConta -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }
}


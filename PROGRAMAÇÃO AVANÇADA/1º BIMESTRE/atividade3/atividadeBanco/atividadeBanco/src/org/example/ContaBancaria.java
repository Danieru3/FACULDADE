package org.example;

abstract class ContaBancaria {
    protected String numeroContaBancaria;
    protected String nomeTitular;
    protected double saldoConta;

    public ContaBancaria(String numeroContaBancaria, String nomeTitular, double saldoConta) {
        this.numeroContaBancaria = numeroContaBancaria;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public void realizarDeposito(double valor) {
        saldoConta += valor;
    }

    public abstract boolean realizarSaque(double valor);

    public void mostrarInformacoes() {
        System.out.println("Número da Conta: " + numeroContaBancaria);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: R$ " + saldoConta);
    }
}

package org.example;

class ContaSalario extends ContaCorrente {
    private boolean saqueGratisUtilizado = false;

    public ContaSalario(String numeroContaBancaria, String nomeTitular, double saldoConta, double limiteChequeEspecial) {
        super(numeroContaBancaria, nomeTitular, saldoConta, limiteChequeEspecial);
    }

    @Override
    public boolean realizarSaque(double valor) {
        if (!saqueGratisUtilizado) {
            saqueGratisUtilizado = true;
            saldoConta -= valor;
            return true;
        } else {
            if (valor <= saldoConta + limiteChequeEspecial) {
                saldoConta -= valor + 5;  // Cobrança de taxa de R$ 5 após o primeiro saque
                return true;
            } else {
                System.out.println("Saldo insuficiente para o saque.");
                return false;
            }
        }
    }
}


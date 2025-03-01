package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private static final double SALDO_MINIMO_SAQUE = 10000.0;

    public ContaInvestimentoAltoRisco(String numeroContaBancaria, String nomeTitular, double saldoConta) {
        super(numeroContaBancaria, nomeTitular, saldoConta);
    }

    @Override
    public boolean realizarSaque(double valor) {
        if (valor >= SALDO_MINIMO_SAQUE && valor <= saldoConta) {
            double valorComTaxa = valor * 1.05; // Aplica uma taxa de 5% sobre o saque
            saldoConta -= valorComTaxa;
            return true;
        } else {
            System.out.println("Saque não permitido. O valor mínimo para saque é R$ " + SALDO_MINIMO_SAQUE);
            return false;
        }
    }
}


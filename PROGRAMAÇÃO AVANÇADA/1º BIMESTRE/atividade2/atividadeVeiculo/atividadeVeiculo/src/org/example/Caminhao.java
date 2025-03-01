package org.example;

class Caminhao extends Veiculo {
    private double pesoCarga;

    public Caminhao(String marcaVeiculo, String modeloVeiculo, int anoFabricacao, int numeroPassageiros, String tipoCombustivel, double pesoCarga) {
        super(marcaVeiculo, modeloVeiculo, anoFabricacao, numeroPassageiros, tipoCombustivel);
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularDistanciaMaxima() {
        double capacidadeTanque = 300;
        double consumoPorLitro = 6;
        double descontoConsumo = Math.min(pesoCarga * 1, 25);
        consumoPorLitro *= (1 - descontoConsumo / 100);
        return capacidadeTanque * consumoPorLitro;
    }
}


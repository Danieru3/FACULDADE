package org.example;

class CarroEletrico extends Carro {
    private double capacidadeBateria;

    public CarroEletrico(String marcaVeiculo, String modeloVeiculo, int anoFabricacao, int numeroPassageiros, String tipoCombustivel, String categoriaCarro, double capacidadeBateria) {
        super(marcaVeiculo, modeloVeiculo, anoFabricacao, numeroPassageiros, tipoCombustivel, categoriaCarro);
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularDistanciaMaxima() {
        return capacidadeBateria * 5;
    }
}


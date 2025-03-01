package org.example;

class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaRefrig;

    public CaminhaoRefrigerado(String marcaVeiculo, String modeloVeiculo, int anoFabricacao, int numeroPassageiros, String tipoCombustivel, double pesoCarga, double temperaturaRefrig) {
        super(marcaVeiculo, modeloVeiculo, anoFabricacao, numeroPassageiros, tipoCombustivel, pesoCarga);
        this.temperaturaRefrig = temperaturaRefrig;
    }

    @Override
    public double calcularDistanciaMaxima() {
        double distancia = super.calcularDistanciaMaxima();
        return distancia * 0.9;
    }
}


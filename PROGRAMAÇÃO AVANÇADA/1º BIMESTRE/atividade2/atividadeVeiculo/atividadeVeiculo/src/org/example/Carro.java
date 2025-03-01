package org.example;

class Carro extends Veiculo {
    private String categoriaCarro;

    public Carro(String marcaVeiculo, String modeloVeiculo, int anoFabricacao, int numeroPassageiros, String tipoCombustivel, String categoriaCarro) {
        super(marcaVeiculo, modeloVeiculo, anoFabricacao, numeroPassageiros, tipoCombustivel);
        this.categoriaCarro = categoriaCarro;
    }

    @Override
    public double calcularDistanciaMaxima() {
        double capacidadeTanque = 50;
        double consumoPorLitro = 12;
        return capacidadeTanque * consumoPorLitro;
    }
}


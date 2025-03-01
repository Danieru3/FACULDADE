package org.example;

class Onibus extends Veiculo {
    private int numeroEixos;

    public Onibus(String marcaVeiculo, String modeloVeiculo, int anoFabricacao, int numeroPassageiros, String tipoCombustivel, int numeroEixos) {
        super(marcaVeiculo, modeloVeiculo, anoFabricacao, numeroPassageiros, tipoCombustivel);
        if (numeroEixos < 6 || numeroEixos > 8) {
            throw new IllegalArgumentException("Número de eixos deve ser entre 6 e 8");
        }
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularDistanciaMaxima() {
        double capacidadeTanque = 200;
        double consumoPorLitro = 5;
        return capacidadeTanque * consumoPorLitro;
    }
}

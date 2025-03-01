package org.example;

abstract class Veiculo {
    protected String marcaVeiculo;
    protected String modeloVeiculo;
    protected int anoFabricacao;
    protected int numeroPassageiros;
    protected String tipoCombustivel;

    public Veiculo(String marcaVeiculo, String modeloVeiculo, int anoFabricacao, int numeroPassageiros, String tipoCombustivel) {
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPassageiros = numeroPassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    public abstract double calcularDistanciaMaxima();

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marcaVeiculo);
        System.out.println("Modelo: " + modeloVeiculo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}


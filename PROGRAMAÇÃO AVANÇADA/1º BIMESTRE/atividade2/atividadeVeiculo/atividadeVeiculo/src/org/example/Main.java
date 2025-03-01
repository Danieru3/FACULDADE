package org.example;


public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2025, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2025, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes", "O500", 2025, 50, "Diesel", 7);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2025, 5, "Elétrico", "SUV", 75);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2025, 2, "Diesel", 15, -18);

        System.out.println("Detalhes do Carro:");
        carro.mostrarInformacoes();
        System.out.println("Distância Máxima: " + carro.calcularDistanciaMaxima() + " km");

        System.out.println("\nDetalhes do Caminhão:");
        caminhao.mostrarInformacoes();
        System.out.println("Distância Máxima: " + caminhao.calcularDistanciaMaxima() + " km");

        System.out.println("\nDetalhes do Ônibus:");
        onibus.mostrarInformacoes();
        System.out.println("Distância Máxima: " + onibus.calcularDistanciaMaxima() + " km");

        System.out.println("\nDetalhes do Carro Elétrico:");
        carroEletrico.mostrarInformacoes();
        System.out.println("Distância Máxima: " + carroEletrico.calcularDistanciaMaxima() + " km");

        System.out.println("\nDetalhes do Caminhão Refrigerado:");
        caminhaoRefrigerado.mostrarInformacoes();
        System.out.println("Distância Máxima: " + caminhaoRefrigerado.calcularDistanciaMaxima() + " km");
    }
}


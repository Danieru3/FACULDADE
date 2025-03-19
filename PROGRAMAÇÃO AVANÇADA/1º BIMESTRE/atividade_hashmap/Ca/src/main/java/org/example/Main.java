package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Produto> produtos = new HashMap<>();
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Buscar produto via código");
            System.out.println("3 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Produto ---");
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    if (produtos.containsKey(codigo)) {
                        System.out.println("Erro: Já existe um produto com este código!");
                    } else {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.next();

                        System.out.print("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();

                        Produto produto = new Produto(codigo, nome, preco);
                        produtos.put(codigo, produto);

                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Buscar Produto ---");
                    System.out.print("Digite o código do produto: ");
                    int codigoBusca = scanner.nextInt();

                    if (produtos.containsKey(codigoBusca)) {
                        System.out.println("Produto encontrado:");
                        System.out.println(produtos.get(codigoBusca));
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}

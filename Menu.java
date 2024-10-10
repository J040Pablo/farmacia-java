package farmacia;

import java.util.Scanner;

public class Menu {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Farmacia farmacia = new Farmacia();
	        int opcao;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1) Listar todos os produtos");
	            System.out.println("2) Cadastrar um novo produto");
	            System.out.println("3) Adicionar estoque de um produto");
	            System.out.println("4) Remover um produto do comércio");
	            System.out.println("5) Vender algum produto existente");
	            System.out.println("6) Sair do programa");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    farmacia.listarProdutos();
	                    break;
	                case 2:
	                    System.out.print("Nome do produto: ");
	                    String nome = scanner.nextLine();
	                    System.out.print("Preço do produto: ");
	                    double preco = scanner.nextDouble();
	                    System.out.print("Quantidade do produto: ");
	                    int quantidade = scanner.nextInt();
	                    farmacia.cadastrarProduto(nome, preco, quantidade);
	                    break;
	                case 3:
	                    System.out.print("Nome do produto: ");
	                    nome = scanner.nextLine();
	                    System.out.print("Quantidade a adicionar: ");
	                    quantidade = scanner.nextInt();
	                    farmacia.adicionarEstoque(nome, quantidade);
	                    break;
	                case 4:
	                    System.out.print("Nome do produto a remover: ");
	                    nome = scanner.nextLine();
	                    farmacia.removerProduto(nome);
	                    break;
	                case 5:
	                    System.out.print("Nome do produto a vender: ");
	                    nome = scanner.nextLine();
	                    System.out.print("Quantidade a vender: ");
	                    quantidade = scanner.nextInt();
	                    farmacia.venderProduto(nome, quantidade);
	                    break;
	                case 6:
	                    System.out.println("Saindo do programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        } while (opcao != 6);

	        scanner.close();
	   }
}

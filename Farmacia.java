package farmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private List<Produto> produtos;

    public Farmacia() {
        produtos = new ArrayList<>();
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        Produto novoProduto = new Produto(nome, preco, quantidade);
        produtos.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    public void adicionarEstoque(String nome, int quantidade) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.adicionarEstoque(quantidade);
            System.out.println("Estoque atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void removerProduto(String nome) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void venderProduto(String nome, int quantidade) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.removerEstoque(quantidade);
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}

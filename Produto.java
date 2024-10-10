package farmacia;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void adicionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerEstoque(int quantidade) {
		if (this.quantidade >= quantidade) {
			this.quantidade -= quantidade;
		} else {
			System.out.println("Estoque insuficiente.");
		}
	}
	
	@Override
	public String toString() {
	    return String.format("Produto: %s, Preço: %.2f, Quantidade: %d", nome, preco, quantidade);
	}

}

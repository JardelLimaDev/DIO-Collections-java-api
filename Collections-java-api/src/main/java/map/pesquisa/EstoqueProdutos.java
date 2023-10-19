package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueProdutos() {
		super();
		this.estoqueProdutoMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutoMap);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p : estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto produtoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p : estoqueProdutoMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				} 
			}
		}
		return produtoMaisCaro;
	}

	public static void main(String[] args) {
		EstoqueProdutos produto = new EstoqueProdutos();
		produto.adicionarProduto(1L, "Produto A", 10, 5.0);
		produto.adicionarProduto(2L, "Produto B", 5, 10.0);
		produto.adicionarProduto(3L, "Produto C", 2, 15.0);
		produto.exibirProdutos();
		System.out.println("Valor Total do Estoque R$ " + produto.calcularValorTotalEstoque());
		System.out.println("O produto mais caro é " + produto.produtoMaisCaro());
	}
}

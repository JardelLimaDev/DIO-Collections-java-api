package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	private Set<Produto> produtoSet;
	
	public CadastroProduto() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutoPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto> exibirProdutoPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProduto cadastro = new CadastroProduto();
		
		cadastro.adicionarProduto(1L, "Produto 1", 1.99, 2);
		cadastro.adicionarProduto(3, "Produto 78", 5d, 1);
		cadastro.adicionarProduto(7L, "Produto 3", 6, 5);
//		cadastro.adicionarProduto(1L, "Produto 2", 10.90, 3);
		cadastro.adicionarProduto(8L, "Produto 2", 10.90, 3);
		
		System.out.println(cadastro.produtoSet);
		System.out.println(cadastro.exibirProdutoPorNome());
		System.out.println(cadastro.exibirProdutoPorPreco());
		
	}
}

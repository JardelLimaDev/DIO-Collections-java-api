package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> carrinhoItens;

	public CarrinhoDeCompras() {
		this.carrinhoItens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoItens.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if (!carrinhoItens.isEmpty()) {
			for (Item item : carrinhoItens) {
				if (item.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(item);
				}
			}
			carrinhoItens.removeAll(itensParaRemover);
		} else {
			System.out.println("A lista esta Vazia!");
		}

	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!carrinhoItens.isEmpty()) {
			for (Item item : carrinhoItens) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista esta Vazia");
		}
	}
	
	public void exibirItens() {
		if(!carrinhoItens.isEmpty()) {
			System.out.println(this.carrinhoItens);
		}else {
			System.out.println("A lista esta Vazia!");
		}
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras [carrinhoItens = " + carrinhoItens + "]";
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		System.out.println(carrinho.calcularValorTotal());
		
	}

}

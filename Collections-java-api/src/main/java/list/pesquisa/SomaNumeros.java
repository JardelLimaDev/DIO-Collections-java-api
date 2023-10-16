package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numerosList;

	public SomaNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numerosList.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		if(!numerosList.isEmpty()) {
			for (Integer numeros : numerosList) {
				soma += numeros;
			}
		}
		return soma;
	}
	
	public int encontrarMaiorValor() {
		int maior = 0;
		if(!numerosList.isEmpty()) {
			for (Integer numeros : numerosList) {
				if (numeros > maior) {
					maior = numeros;
				}
			}
		}
		return maior;
	}
	
	public int encontrarMenorValor() {
		int menor = Integer.MAX_VALUE;
		if(!numerosList.isEmpty()) {
			for (Integer numeros : numerosList) {
				if (numeros <= menor) {
					menor = numeros;
				}
			}
		}
		return menor;
	}
	
	public void exibirNumeros() {
		if(!numerosList.isEmpty()) {
			System.out.println(numerosList);
		}
	}
	
	public static void main(String[] args) {
		SomaNumeros numeros = new SomaNumeros();
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(4);
		numeros.adicionarNumero(6);
		numeros.adicionarNumero(8);
		numeros.adicionarNumero(10);
		numeros.adicionarNumero(12);
		
		
		numeros.exibirNumeros();
		System.out.println(numeros.calcularSoma());
		System.out.println(numeros.encontrarMaiorValor());
		System.out.println(numeros.encontrarMenorValor());
		

	}
}

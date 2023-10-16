package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeroOrdem;
	
	public List<Integer> getNumeroOrdem() {
		return numeroOrdem;
	}

	public OrdenacaoNumeros() {
		this.numeroOrdem = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "OrdenacaoNumeros [numeroOrdem = " + numeroOrdem + "]";
	}
	
	public void adicionarNumero(int numero) {
		numeroOrdem.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
	    List<Integer> numerosAscendente = new ArrayList<>(this.numeroOrdem);
	    if (!numeroOrdem.isEmpty()) {
	      Collections.sort(numerosAscendente);
	      return numerosAscendente;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }

	  public List<Integer> ordenarDescendente() {
	    List<Integer> numerosAscendente = new ArrayList<>(this.numeroOrdem);
	    if (!numeroOrdem.isEmpty()) {
	      numerosAscendente.sort(Collections.reverseOrder());
	      return numerosAscendente;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	  
	  public void exibirNumeros() {
		    if (!numeroOrdem.isEmpty()) {
		      System.out.println(this.numeroOrdem);
		    } else {
		      System.out.println("A lista está vazia!");
		    }
		  }
	  
	  public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(4);
		numeros.adicionarNumero(8);
		numeros.adicionarNumero(10);
		numeros.adicionarNumero(1);
		
		System.out.println(numeros.ordenarAscendente());
		numeros.exibirNumeros();
	}
	
}

package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
	private Set<String> palavraSet;

	public ConjuntoPalavras() {
		super();
		this.palavraSet = new HashSet<>();
	}

	@Override
	public String toString() {
		return "ConjuntoPalavras [palavra=" + palavraSet + "]";
	}
	
	public void adicionarPalavra(String palavra) {
		palavraSet.add(new String(palavra)); //ou apenas (palavra)
	}
	
	public void removerPalavra(String palavra) {
//	poderia usar .isEmpty()	com .contains()	
		String palavraParaRemover = null;
		for (String p : palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				palavraParaRemover = p;
				break;
			}
		}
		palavraSet.remove(palavraParaRemover);
	}
	
	public Set<String> verificarPalavra(String palavra){ //poderia ser boolean com .contains()
		Set<String>  verificarPalavra  = new HashSet<>();
		for (String p : palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				verificarPalavra.add(p);
			}
		}
		return verificarPalavra;
	}
	
	public void exibirPalavrasUnicas() {
//		poderia usar .isEmpty()	
		System.out.println(palavraSet);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavras palavras = new ConjuntoPalavras();
		palavras.adicionarPalavra("Pedra");
		palavras.adicionarPalavra("Papel");
		palavras.adicionarPalavra("Tesoura");
//		palavras.adicionarPalavra("Pedra");
		palavras.removerPalavra("papel");
		System.out.println(palavras.verificarPalavra("tesoura"));
		palavras.exibirPalavrasUnicas();
		
	}
}

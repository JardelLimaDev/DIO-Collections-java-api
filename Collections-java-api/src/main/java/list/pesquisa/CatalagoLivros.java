package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
	private List<Livro> livroList;

	public CatalagoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorintervaloDeAnos(int anoInicial, int anoFinal){
		List<Livro> livroPesquisaPorAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livroPesquisaPorAno.add(livro);
				}
			}
		}
		return livroPesquisaPorAno;
	}
	
	public Livro pesquisarLivroPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for (Livro livro : livroList) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalagoLivros catalagoDeLivro = new CatalagoLivros();
		
		catalagoDeLivro.adicionarLivro("Titulo 1", "Autor 1", 1993);
		catalagoDeLivro.adicionarLivro("Titulo 1", "Autor 2", 2000);
		catalagoDeLivro.adicionarLivro("Titulo 3", "Autor 2", 1900);
		catalagoDeLivro.adicionarLivro("Titulo 4", "Autor 4", 1800);
		catalagoDeLivro.adicionarLivro("Titulo 5", "Autor 5", 2020);
		catalagoDeLivro.adicionarLivro("Titulo 6", "Autor 6", 1999);
		
		System.out.println(catalagoDeLivro.pesquisarPorAutor("Autor 2"));
		System.out.println(catalagoDeLivro.pesquisarPorintervaloDeAnos(1800, 2023));
		System.out.println(catalagoDeLivro.pesquisarLivroPorTitulo("Titulo 1"));
	}
	
	
}	

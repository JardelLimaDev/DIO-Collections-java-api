package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	private Set<Contato> contatoSet;
	
	public AgendaContato() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		for (Contato contato : contatoSet) {
			if(contato.getNome().startsWith(nome)) {
				contatoPorNome.add(contato);
			}
		}
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contaroAtualizado = null;
		for (Contato contato : contatoSet) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(novoNumero);
				contaroAtualizado = contato;
				break;
			}
		}
		return contaroAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContato contatos = new AgendaContato();
		
		contatos.exibirContato();
		contatos.adicionarContato("Jardel", 1234);
		contatos.adicionarContato("Jamille", 1235);
		contatos.adicionarContato("Chagas", 987);
		contatos.adicionarContato("Diego", 0);
		contatos.adicionarContato("Diego", 456);
		contatos.exibirContato();
		System.out.println(contatos.pesquisarPorNome("Jardel"));
		System.out.println(contatos.atualizarNumeroContato("diego", 789));
		
	}
}

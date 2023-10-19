package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendasContatos {
	private Map<String, Integer> agendaContatoMap;
	
	public AgendasContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null; 
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendasContatos contatos = new AgendasContatos();
		contatos.adicionarContato("Jardel", 12345);
		contatos.adicionarContato("Jardel", 54321);
		contatos.adicionarContato("Jardel Lima", 111111);
		contatos.adicionarContato("Jamille", 8638);
		contatos.adicionarContato("Luis", 99999);
		contatos.adicionarContato("Victor", 77777);
		contatos.exibirContato();
		contatos.removerContato("Luis");
		contatos.exibirContato();
		System.out.println("O numero é " + contatos.pesquisarPorNome("Jardel Lima"));
	}
}

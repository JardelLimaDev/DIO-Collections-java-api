package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = t;
					break;
				}
			}
			tarefaSet.remove(tarefaParaRemover);
		} else {
			System.out.println("Lista de Tarefas Vazias");
		}
	}

	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}

	public int contarTarefas() {
		return tarefaSet.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefaConcluida = new HashSet<>();
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.isStatus() == true) {
					tarefaConcluida.add(t);
				}
			}
		} else {
			System.out.println("Lista de Tarefas Vazias");
		}
		return tarefaConcluida;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefaPendentes = new HashSet<>();
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.isStatus() == false) {
					tarefaPendentes.add(t);
				}
			}
		} else {
			System.out.println("Lista de Tarefas Vazias");
		}
		return tarefaPendentes;
	}

	public void marcarTarefaComoConcluida(String descricao) {
		for (Tarefa t : tarefaSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setStatus(true);
			}
		}
	}

	public void marcarTarefaComoPedente(String descricao) {
		Tarefa tarefaParaMarcarComoPendente = null;
		for (Tarefa t : tarefaSet) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaMarcarComoPendente = t;
				break;
			}
		}
		if (tarefaParaMarcarComoPendente != null) {
			if (tarefaParaMarcarComoPendente.isStatus()) {
				tarefaParaMarcarComoPendente.setStatus(false);
			}
		} else {
			System.out.println("Tarefa não encontra na lista");
		}
	}
	
	public void limparListaTarefa() {
		if(tarefaSet.isEmpty()) {
			System.out.println("A lista esta vazia");
		}else {
			tarefaSet.clear();
		}
	}
	
	public static void main(String[] args) {
		ListaTarefas notas = new ListaTarefas();
		
		notas.adicionarTarefa("Estudar");
		notas.adicionarTarefa("Trabalhar");
		notas.adicionarTarefa("Descansar");
		notas.adicionarTarefa("Merendar");
		notas.adicionarTarefa("Dormir");
		
		notas.exibirTarefas();
		
		notas.removerTarefa("Descansar");
		notas.exibirTarefas();
		
		System.out.println("Total de tarefas " + notas.contarTarefas());
		
		System.out.println(notas.obterTarefasPendentes());
		
		notas.marcarTarefaComoConcluida("estudar");
		notas.marcarTarefaComoConcluida("TRABALHAR");
		
		System.out.println(notas.obterTarefasPendentes());
		
		notas.exibirTarefas();
		
		notas.marcarTarefaComoPedente("estudar");
		
		notas.exibirTarefas();
		
		notas.limparListaTarefa();
		notas.exibirTarefas();

	}
}

package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefaLista;

	public ListaTarefas() {
		this.tarefaLista = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaLista.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa tarefa : tarefaLista) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		tarefaLista.removeAll(tarefasParaRemover);
	}

	public int numeroTotalTarefas() {
		return tarefaLista.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaLista);
	}

	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();

		System.out.println("Numero total de tarefas " + listaTarefa.numeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println("Numero total de tarefas " + listaTarefa.numeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 3");
		System.out.println("Numero total de tarefas " + listaTarefa.numeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();

	}

}

package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> alunoSet;
	
	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double nota) {
		alunoSet.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(Long matricula) {
		Aluno alunoParaRemover = null;
		if(!alunoSet.isEmpty()) {
			for (Aluno a : alunoSet) {
				if(a.getMatricula() == matricula) {
					alunoParaRemover = a;
					break;
				}
			}
			alunoSet.remove(alunoParaRemover);
		}else {
			System.out.println("Aluno não encontrado.");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
		alunoPorNome.addAll(alunoSet);
		return alunoPorNome;
	}
	
//	public void exibirAlunosPorNota(){
//		Set<Aluno> alunoPorNota = new TreeSet<>(new Com)
//	}
	
	
}

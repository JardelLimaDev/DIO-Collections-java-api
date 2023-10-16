package set.pesquisa;

public class Tarefa {
	private String descricao;
	private boolean status;
	
	public String getDescricao() {
		return descricao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Tarefa(String descricao, boolean status) {
		super();
		this.descricao = descricao;
		this.status = status;
	}
	
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", status=" + status + "]\n";
	}
	
	
}

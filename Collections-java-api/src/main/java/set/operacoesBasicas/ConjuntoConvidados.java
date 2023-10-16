package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		super();
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado convidado : convidadoSet) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = convidado;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidado() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados convidado = new ConjuntoConvidados();
		System.out.println("Existem " + convidado.contarConvidado() + " na lista de convidados");
		
		convidado.adicionarConvidado("Convidado 1", 1231);
		convidado.adicionarConvidado("Convidado 2", 1233);
		convidado.adicionarConvidado("Convidado 3", 1233);
		convidado.adicionarConvidado("Convidado 4", 1234);
		convidado.exibirConvidados();
		System.out.println("Existem " + convidado.contarConvidado() + " na lista de convidados");
		convidado.removerConvidadoPorCodigoConvite(1231);
		System.out.println("Existem " + convidado.contarConvidado() + " na lista de convidados");
		convidado.exibirConvidados();
	}
	
}

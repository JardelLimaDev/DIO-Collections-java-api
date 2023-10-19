package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
//import java.util.Collection;
//import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		super();
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirEventos() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
//		Set<LocalDate> dataSet = eventosMap.keySet();
//		Collection<Evento> values = eventosMap.values();
//		eventosMap.get();
		
//		LocalDate proximaData = null;
//		Evento proximoEvento = null;
		
		LocalDate dataAual = LocalDate.now();
		Map<LocalDate, Evento> eventoTreeMap = new HashMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
			if(entry.getKey().equals(dataAual) || entry.getKey().isAfter(dataAual)) {
				System.out.println("O proximo evento " + entry.getValue() + " acontecera na data " + entry.getKey());
				break;
//				sem o break para imprimir proximas datas
			}
		}
		
	}
	
	public static void main(String[] args) {
		AgendaEventos meusEventos = new AgendaEventos();
		meusEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Atração 1", "Evento 1");
		meusEventos.adicionarEvento(LocalDate.of(2023, 12, 9), "Atração 2", "Evento 2");
		meusEventos.adicionarEvento(LocalDate.of(2023, 10, 18), "Atração 3", "Evento 3");
		meusEventos.exibirEventos();
		meusEventos.obterProximoEvento();
	}
	
}

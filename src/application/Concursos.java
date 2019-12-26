package application;

import javafx.collections.ObservableList;

public class Concursos {
	
	private Integer concurso;
	private ObservableList<Integer> dezenas;
	
	public Concursos(Integer concurso, ObservableList<Integer> dezenas) {
		super();
		this.concurso = concurso;
		this.dezenas = dezenas;
	}
	public Integer getConcurso() {
		return concurso;
	}
	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}
	public ObservableList<Integer> getDezenas() {
		return dezenas;
	}
	public void setDezenas(ObservableList<Integer> dezenas) {
		this.dezenas = dezenas;
	}
	
	@Override
	public String toString() {
		return "Concursos [concurso=" + concurso + ", dezenas=" + dezenas + "]";
	}

	
}

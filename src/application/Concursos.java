package application;

import javafx.collections.ObservableList;

public class Concursos {
	
	private Integer concurso;
	private ObservableList<Integer> dezenas;
	private Integer d1;
	private Integer d2;
	private Integer d3;
	private Integer d4;
	private Integer d5;
	private Integer d6;
	
	public Concursos(Integer concurso, ObservableList<Integer> dezenas) {
		super();
		this.concurso = concurso;
		this.dezenas = dezenas;
		d1 = this.dezenas.get(0);
		d2 = this.dezenas.get(1);
		d3 = this.dezenas.get(2);
		d4 = this.dezenas.get(3);
		d5 = this.dezenas.get(4);
		d6 = this.dezenas.get(5);
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
	
	public Integer getD1() {
		return d1;
	}
	
	public Integer getD2() {
		return d2;
	}
	
	public Integer getD3() {
		return d3;
	}
	
	public Integer getD4() {
		return d4;
	}
	 
	public Integer getD5() {
		return d5;
	}
	
	public Integer getD6() {
		return d6;
	}
	
	@Override
	public String toString() {
		return "Concursos [concurso=" + concurso + ", dezenas=" + dezenas + "]";
	}

	
}

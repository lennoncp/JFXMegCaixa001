package application;

import java.util.List;

public class Apostas {
	
	private Integer codigo;
	private List<Integer> dezenas;
	
	public Apostas(Integer codigo, List<Integer> dezenas) {
		super();
		this.codigo = codigo;
		this.dezenas = dezenas;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public List<Integer> getDezenas() {
		return dezenas;
	}
	public void setDezenas(List<Integer> dezenas) {
		this.dezenas = dezenas;
	}
	
	

}

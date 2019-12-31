package application;

import java.util.List;

import javafx.collections.ObservableList;

public class Dezenas {
	
	private Integer codigo;
	private Integer d1;
	private Integer d2;
	private Integer d3;
	private Integer d4;
	private Integer d5;
	private Integer d6;
	
	public Dezenas(List<Integer> lista) {
		this.d1 = lista.get(0);
		this.d2 = lista.get(1);
		this.d3 = lista.get(2);
		this.d4 = lista.get(3);
		this.d5 = lista.get(4);
		this.d6 = lista.get(5);
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getD1() {
		return d1;
	}
	public void setD1(Integer d1) {
		this.d1 = d1;
	}
	public Integer getD2() {
		return d2;
	}
	public void setD2(Integer d2) {
		this.d2 = d2;
	}
	public Integer getD3() {
		return d3;
	}
	public void setD3(Integer d3) {
		this.d3 = d3;
	}
	public Integer getD4() {
		return d4;
	}
	public void setD4(Integer d4) {
		this.d4 = d4;
	}
	public Integer getD5() {
		return d5;
	}
	public void setD5(Integer d5) {
		this.d5 = d5;
	}
	public Integer getD6() {
		return d6;
	}
	public void setD6(Integer d6) {
		this.d6 = d6;
	}
	@Override
	public String toString() {
		return "Dezenas [codigo=" + codigo + ", d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + ", d4=" + d4 + ", d5=" + d5
				+ ", d6=" + d6 + "]";
	}
	
	
	

}

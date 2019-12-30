package application;

public class Dezena {
	
	private Integer dezena;
	private Integer contagem;
	
	
		
	public Dezena(Integer dezena, Integer contagem) {
		super();
		this.dezena = dezena;
		this.contagem = contagem;
	}
	public Integer getDezena() {
		return dezena;
	}
	public void setDezena(Integer dezena) {
		this.dezena = dezena;
	}
	public Integer getContagem() {
		return contagem;
	}
	public void setContagem(Integer contagem) {
		this.contagem = contagem;
	}
	@Override
	public String toString() {
		return "Dezena [dezena=" + dezena + ", contagem=" + contagem + "]";
	}
	

}

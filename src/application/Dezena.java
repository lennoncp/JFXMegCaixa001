package application;

public class Dezena {
	
	private Integer dezena;
	private Integer contagem;
	private Integer fatorDeMultiplicacao;
		
	public Dezena(Integer dezena, Integer contagem, Integer fatorDeMultiplicacao) {
		super();
		this.dezena = dezena;
		this.contagem = contagem;
		this.fatorDeMultiplicacao = fatorDeMultiplicacao;
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
	
	
	
	public Integer getFatorDeMultiplicacao() {
		return fatorDeMultiplicacao;
	}
	public void setFatorDeMultiplicacao(Integer fatorDeMultiplicacao) {
		this.fatorDeMultiplicacao = fatorDeMultiplicacao;
	}
	@Override
	public String toString() {
		return "Dezena: " + dezena + ", Cont: " + contagem + ", Multiplicador: " + fatorDeMultiplicacao
				+ " ";
	}
	
	
	

}

package application;

public class Contagem {
	
	public void contagemConcursoDezenasGeral() {
		for(int i = 0; i < SLista.contagemGerarl.size(); i++) {
			SLista.contagemGerarl.get(i).setContagem(0);
		}
		for(int i = 0; i < SLista.concursos.size(); i++) {
			for(int j = 0; j < SLista.concursos.get(i).getDezenas().size(); j++) {
				SLista.contagemGerarl.get(SLista.concursos.get(i).getDezenas().get(j)-1).setContagem(SLista.contagemGerarl.get(SLista.concursos.get(i).getDezenas().get(j)-1).getContagem() + 1);;
			}
		}
		
		System.out.println(SLista.contagemGerarl);
	}
	
	public void contagemConcursoDezenasRange() {
		for(int i = 0; i < SLista.contagemRange.size();i++) {
			SLista.contagemRange.get(i).setContagem(0);
		}
		for(int i = 0; i < SLista.concursosRange.size(); i++) {
			for(int j = 0; j < SLista.concursosRange.get(i).getDezenas().size(); j++) {
				SLista.contagemRange.get(SLista.concursosRange.get(i).getDezenas().get(j) - 1).setContagem(SLista.contagemRange.get(SLista.concursosRange.get(i).getDezenas().get(j) - 1).getContagem() + 1);
			}
		}
	}

}

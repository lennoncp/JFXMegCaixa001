package application;

public class Contagem {
	
	public void contagemConcursoDezenasGeral() {
		for(int i = 0; i < SLista.concursos.size(); i++) {
			for(int j = 0; j < SLista.concursos.get(i).getDezenas().size(); j++) {
				SLista._60Dezenas.get(SLista.concursos.get(i).getDezenas().get(j)-1).setContagem(SLista._60Dezenas.get(SLista.concursos.get(i).getDezenas().get(j)-1).getContagem() + 1);;
			}
		}
		
		System.out.println(SLista._60Dezenas);
	}

}

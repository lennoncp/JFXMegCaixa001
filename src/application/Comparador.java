package application;

import javafx.collections.ObservableList;

public class Comparador {
	
	public Integer verificarConcursos(ObservableList<Apostas> apostas) {
		int max = 0;
		for(Concursos c : SLista.concursos) {
			for(Integer i : c.getDezenas()) {
				for(Apostas a : apostas) {
					int cont = 0;
					for(int j = 0; j < a.getDezenas().size(); j++) {
						if(i == a.getDezenas().get(j)) {
							cont++;
						}
					}
					
					if(cont > max) {
						max = cont;
					}
				}
			}
		}
		
		return max;
	}

}

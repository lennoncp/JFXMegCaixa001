package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dao.ConcursosDAO;

public class ContagemNova {
	
	ConcursosDAO concursosDAO = new ConcursosDAO();
	
	public ContagemNova() {
		for(int i = 0; i < 60; i++) {
			SLista.dezenaContagemGeral.add(new Dezena(i + 1, 0));
			SLista.dezenaContagemRange.add(new Dezena(i + 1, 0));
		}
		
		for(int i = 0; i < 6; i++) {
			SLista.dezenaContagemLinhas.add(new Dezena(i + 1, 0));
		}
		
		for(int i = 0; i < 10; i++) {
			SLista.dezenaContagemColunas.add(new Dezena(i + 1, 0));
		}
		
		for(int i = 0; i < 7; i++) {
			SLista.mediaImpar.add(new Dezena(i, 0));
		}
		
		for(int i = 0; i < 2; i++) {
			SLista.quadranteContagem.add(new Dezena(i,0));
		}
	}
	
	public void dezenasContagemGeral() {
		SLista.concursos = concursosDAO.getConcursos();
		
		//ZERANDO CONTAGEM GERAL
		for(int i = 0; i < 60; i++) {
			SLista.dezenaContagemGeral.get(i).setContagem(0);
		}
		
		for(Concursos c :SLista.concursos) {
			for(int d : c.getDezenas()) {
				SLista.dezenaContagemGeral.get(d-1).setContagem(SLista.dezenaContagemGeral.get(d - 1).getContagem() + 1);
			}
		}
	}
	
	public void dezenasContagemRange() {
		SLista.concursosRange = concursosDAO.getConcursosRange();
		
		//ZERANDO A CONTAGEM DO RANGE
		for(int i = 0; i < 60; i++) {
			SLista.dezenaContagemRange.get(i).setContagem(0);;
		}
		
		for(Concursos c : SLista.concursosRange) {
			for(int d : c.getDezenas()) {
				SLista.dezenaContagemRange.get(d - 1).setContagem(SLista.dezenaContagemRange.get(d - 1).getContagem() + 1);
			}
		}
	}
	
	public void dezenasContagemLinhas() {
		
		for(int i = 0; i < 6; i++) {
			SLista.dezenaContagemLinhas.get(i).setContagem(0);
		}
		
		List<Integer> linha1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> linha2 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		List<Integer> linha3 = Arrays.asList(21,22,23,24,25,26,27,28,29,30);
		List<Integer> linha4 = Arrays.asList(31,32,33,34,35,36,37,38,39,40);
		List<Integer> linha5 = Arrays.asList(41,42,43,44,45,46,47,48,49,50);
		List<Integer> linha6 = Arrays.asList(51,52,53,54,55,56,57,58,59,60);
		
		if(SLista.checkRange) {
			
			for(Concursos c : SLista.concursosRange) {
				for(Integer d : c.getDezenas()) {
					
					if(linha1.contains(d))
						SLista.dezenaContagemLinhas.get(0).setContagem(SLista.dezenaContagemLinhas.get(0).getContagem() + 1);
					
					if(linha2.contains(d))
						SLista.dezenaContagemLinhas.get(1).setContagem(SLista.dezenaContagemLinhas.get(1).getContagem() + 1);
					
					if(linha3.contains(d))
						SLista.dezenaContagemLinhas.get(2).setContagem(SLista.dezenaContagemLinhas.get(2).getContagem() + 1);
					
					if(linha4.contains(d))
						SLista.dezenaContagemLinhas.get(3).setContagem(SLista.dezenaContagemLinhas.get(3).getContagem() + 1);
					
					if(linha5.contains(d))
						SLista.dezenaContagemLinhas.get(4).setContagem(SLista.dezenaContagemLinhas.get(4).getContagem() + 1);
					
					if(linha6.contains(d))
						SLista.dezenaContagemLinhas.get(5).setContagem(SLista.dezenaContagemLinhas.get(5).getContagem() + 1);
				}
			}
			
		}else {
			
			for(Concursos c : SLista.concursos) {
				for(Integer d : c.getDezenas()) {
					
					if(linha1.contains(d))
						SLista.dezenaContagemLinhas.get(0).setContagem(SLista.dezenaContagemLinhas.get(0).getContagem() + 1);
					
					if(linha2.contains(d))
						SLista.dezenaContagemLinhas.get(1).setContagem(SLista.dezenaContagemLinhas.get(1).getContagem() + 1);
					
					if(linha3.contains(d))
						SLista.dezenaContagemLinhas.get(2).setContagem(SLista.dezenaContagemLinhas.get(2).getContagem() + 1);
					
					if(linha4.contains(d))
						SLista.dezenaContagemLinhas.get(3).setContagem(SLista.dezenaContagemLinhas.get(3).getContagem() + 1);
					
					if(linha5.contains(d))
						SLista.dezenaContagemLinhas.get(4).setContagem(SLista.dezenaContagemLinhas.get(4).getContagem() + 1);
					
					if(linha6.contains(d))
						SLista.dezenaContagemLinhas.get(5).setContagem(SLista.dezenaContagemLinhas.get(5).getContagem() + 1);
				}
			}
			
		}
	}
	
	
	public void dezenasContagemColunas() {
		
		for(int i = 0; i < 10; i++) {
			SLista.dezenaContagemColunas.get(i).setContagem(0);		
			}
		
		List<Integer> coluna1 = Arrays.asList(1,11,21,31,41,51);
		int i = 2;
		List<Integer> coluna2 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna3 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna4 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna5 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna6 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna7 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna8 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna9 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i); i++;
		List<Integer> coluna10 = Arrays.asList(coluna1.get(0) + i, coluna1.get(1) + i, coluna1.get(2) + i , coluna1.get(3) + i , coluna1.get(4) + i, coluna1.get(5) + i);
		
		
		if(SLista.checkRange) {
			
			for(Concursos c : SLista.concursosRange) {
				for(Integer d : c.getDezenas()) {
					
					int j = 0;
					
					if(coluna1.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
						
					if(coluna2.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
							
					if(coluna3.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
						
					if(coluna4.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
						
					if(coluna5.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
					
					if(coluna6.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
								
					if(coluna7.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
									
					if(coluna8.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
										
					if(coluna9.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
					
					if(coluna10.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
					
					
					
				}
			}
			
		}else {
			
			for(Concursos c : SLista.concursos) {
				for(Integer d : c.getDezenas()) {
					
					int j = 0;
					
					if(coluna1.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
						
					if(coluna2.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
							
					if(coluna3.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
						
					if(coluna4.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
						
					if(coluna5.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
					
					if(coluna6.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
								
					if(coluna7.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
									
					if(coluna8.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
										
					if(coluna9.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
					
					if(coluna10.contains(d))
						SLista.dezenaContagemColunas.get(j).setContagem(SLista.dezenaContagemColunas.get(j).getContagem() + 1); j++;
					
					
					
				}
			}
			
		}
	}
	
	public void mediaImpar() {
		if(SLista.checkRange) {
			for(Concursos c : SLista.concursosRange) {
				int impar = 0;
				for(int d : c.getDezenas()) {
					if(d % 2 != 0)
						impar++;
				}
				
				switch (impar) {
				case 0:
					SLista.mediaImpar.get(0).setContagem(SLista.mediaImpar.get(0).getContagem() + 1);
					break;
				case 1:
					SLista.mediaImpar.get(1).setContagem(SLista.mediaImpar.get(1).getContagem() + 1);
					break;
				case 2:
					SLista.mediaImpar.get(2).setContagem(SLista.mediaImpar.get(2).getContagem() + 1);
					break;	
				case 3:
					SLista.mediaImpar.get(3).setContagem(SLista.mediaImpar.get(3).getContagem() + 1);
					break;
				case 4:
					SLista.mediaImpar.get(4).setContagem(SLista.mediaImpar.get(4).getContagem() + 1);
					break;
				case 5:
					SLista.mediaImpar.get(5).setContagem(SLista.mediaImpar.get(5).getContagem() + 1);
					break;
				case 6:
					SLista.mediaImpar.get(6).setContagem(SLista.mediaImpar.get(6).getContagem() + 1);
					break;

				default:
					break;
				}
			}
		}else {
			for(Concursos c : SLista.concursos) {
				int impar = 0;
				for(int d : c.getDezenas()) {
					if(d % 2 != 0)
						impar++;
				}
				
				switch (impar) {
				case 0:
					SLista.mediaImpar.get(0).setContagem(SLista.mediaImpar.get(0).getContagem() + 1);
					break;
				case 1:
					SLista.mediaImpar.get(1).setContagem(SLista.mediaImpar.get(1).getContagem() + 1);
					break;
				case 2:
					SLista.mediaImpar.get(2).setContagem(SLista.mediaImpar.get(2).getContagem() + 1);
					break;	
				case 3:
					SLista.mediaImpar.get(3).setContagem(SLista.mediaImpar.get(3).getContagem() + 1);
					break;
				case 4:
					SLista.mediaImpar.get(4).setContagem(SLista.mediaImpar.get(4).getContagem() + 1);
					break;
				case 5:
					SLista.mediaImpar.get(5).setContagem(SLista.mediaImpar.get(5).getContagem() + 1);
					break;
				case 6:
					SLista.mediaImpar.get(6).setContagem(SLista.mediaImpar.get(6).getContagem() + 1);
					break;

				default:
					break;
				}
			}
		}
	}
	
	public void dezenaContagemGraduante() {
		List<Integer> menorQ5 = new ArrayList<Integer>();
		int p5 = 0;
		for(int i = 0; i < 60; i++) {
			if(p5>=5) {
				i += 5;
				p5 = 0;
			}
			
			menorQ5.add(i + 1);
			p5++;
			
		}
		
		for(int i = 0; i < 2; i++) {
			SLista.quadranteContagem.get(i).setContagem(i);
		}
			
		if(SLista.checkRange) {
			for(Concursos c: SLista.concursosRange) {
				for(int d: c.getDezenas()) {
					if(menorQ5.contains(d)) {
						SLista.quadranteContagem.get(0).setContagem(SLista.quadranteContagem.get(0).getContagem() + 1);
					}else {
						SLista.quadranteContagem.get(1).setContagem(SLista.quadranteContagem.get(1).getContagem() + 1);
					}
				}
			}
		}else {
			for(Concursos c: SLista.concursos) {
				for(int d: c.getDezenas()) {
					if(menorQ5.contains(d)) {
						SLista.quadranteContagem.get(0).setContagem(SLista.quadranteContagem.get(0).getContagem() + 1);
					}else {
						SLista.quadranteContagem.get(1).setContagem(SLista.quadranteContagem.get(1).getContagem() + 1);
					}
				}
			}
		}
	}

}

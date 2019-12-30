package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FatorDeRepeticao {
	
	public FatorDeRepeticao() {
		fatorDeMultiplicacaoContagemGeral();
		fatorDeMultiplicacaoContagemRange();
		fatorDeMultiplicacaoDeLInhas();
		fatorDeMultiplicacaoColunas();
		fatorDeMultiplicacaoDoQuadrante();
	}
	
	private void fatorDeMultiplicacaoContagemGeral() {
		for(int i = 0; i < 10 ; i++) {
			Dezena d = SLista.dezenaContagemGeral.get(i);
			for(int j = 0; j < 20; j++) {
				SLista.gaiola.add(d);
			}
		}
	}
	
	private void fatorDeMultiplicacaoContagemRange() {
		for(int i = 0; i < 10; i++) {
			Dezena d = SLista.dezenaContagemRange.get(i);
			for(int j = 0; j < 20; j++) {
				SLista.gaiola.add(d);
			}
		}
	}
	
	private void fatorDeMultiplicacaoDeLInhas() {
		List<Integer> linha1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> linha2 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		List<Integer> linha3 = Arrays.asList(21,22,23,24,25,26,27,28,29,30);
		List<Integer> linha4 = Arrays.asList(31,32,33,34,35,36,37,38,39,40);
		List<Integer> linha5 = Arrays.asList(41,42,43,44,45,46,47,48,49,50);
		List<Integer> linha6 = Arrays.asList(51,52,53,54,55,56,57,58,59,60);
		
		for(int i = 0; i < 3; i++) {
			int l = SLista.dezenaContagemLinhas.get(i).getDezena();
			
			switch (l) {
			case 1:
				for(int d : linha1) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 2:
				for(int d : linha2) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 3:
				for(int d : linha3) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 4:
				for(int d : linha4) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 5:
				for(int d : linha5) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 6:
				for(int d : linha6) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;

			default:
				break;
			}
		}
	}
	
	private void fatorDeMultiplicacaoColunas() {
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
	
		for(int k = 0; k < 5; k++) {
			int c = SLista.dezenaContagemColunas.get(k).getDezena();
			
			switch (c) {
			case 1:
				for(int d : coluna1) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 2:
				for(int d : coluna2) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 3:
				for(int d : coluna3) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 4:
				for(int d : coluna4) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 5:
				for(int d : coluna5) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 6:
				for(int d : coluna6) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 7:
				for(int d : coluna7) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 8:
				for(int d : coluna8) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 9:
				for(int d : coluna9) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 10:
				for(int d : coluna10) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;


			default:
				break;
			}
		}
	}
	
	private void fatorDeMultiplicacaoDoQuadrante() {
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
		
		menorQ5.remove(menorQ5.size() - 1);
		
		List<Integer> maiorQ5 = new ArrayList<Integer>();
		p5 = 0;
		for(int i = 5; i < 60; i++) {
			if(p5>=5) {
				i += 5;
				p5 = 0;
			}
			
			maiorQ5.add(i + 1);
			p5++;
			
		}
		
		for(int i = 0; i < 1; i++) {
			int q = SLista.quadranteContagem.get(i).getDezena();
			switch (q) {
			case 0:
				for(int d : menorQ5) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;
			case 1:
				for(int d : maiorQ5) {
					for(int j = 0; j < 20; j++) {
						SLista.gaiola.add(new Dezena(d, 0));
					}
				}
				break;

			default:
				break;
			}
			
		}
	}

}

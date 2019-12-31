package application;


import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;

public class SLista {
	
	public static Random rad = new Random(LocalTime.now().toNanoOfDay());
	
	public static Integer range = 100;
	public static boolean checkRange = false;
	
	public static ObservableList<Dezena> dezenaContagemGeral = FXCollections.observableArrayList();
	public static ObservableList<Dezena> dezenaContagemRange = FXCollections.observableArrayList();
	public static ObservableList<Dezena> dezenaContagemLinhas = FXCollections.observableArrayList();
	public static ObservableList<Dezena> dezenaContagemColunas = FXCollections.observableArrayList();
	public static ObservableList<Dezena> mediaImpar = FXCollections.observableArrayList();
	public static ObservableList<Dezena> quadranteContagem = FXCollections.observableArrayList();
	
	public static ObservableList<Dezena> gaiola = FXCollections.observableArrayList();

	public static ObservableList<Dezena> sortedListDecrescente = FXCollections.observableArrayList();
	
	public static ObservableList<Dezenas> dezenas = FXCollections.observableArrayList();
	public static ObservableList<Concursos> concursos = FXCollections.observableArrayList();
	public static ObservableList<Concursos> concursosRange = FXCollections.observableArrayList();
	
	public static ObservableList<Dezena> apostas = FXCollections.observableArrayList();
	public static ObservableList<Apostas> apostasRepositorio = FXCollections.observableArrayList();
	
	
	public static SortedList<Dezena> sortedListDecrecente(ObservableList<Dezena> dezenas){
		SortedList<Dezena> sortedList = new SortedList<Dezena>(dezenas, (d1,d2)->{
			if( d2.getContagem() < d1.getContagem() ) {
	            return -1;
	        } else if( d2.getContagem() > d1.getContagem() ) {
	            return 1;
	        } else {
	            return 0;
	        }
		});
		return sortedList;
	}
	
	public static void removerDaListaDezena(Dezena D) {
		for(int i = 0; i < SLista.gaiola.size(); i++) {
			
			if(SLista.gaiola.get(i).getDezena() == D.getDezena()) {
				SLista.gaiola.remove(SLista.gaiola.get(i));
			}
			
		}
	}
	
	public static void removeNovamenteDaListaDezena(Integer i) {
		for(Dezena d : SLista.gaiola) {
			Dezena dez = new Dezena(i, 0);
			SLista.gaiola.remove(dez);
		}
	}
	
	public static void removerDaListaImpar() {
		for(int i = 0; i < SLista.gaiola.size(); i++) {
			if(SLista.gaiola.get(i).getDezena() % 2 != 0)
				SLista.gaiola.remove(SLista.gaiola.get(i));
		}
	}
	
	public static void removerDaListaPar() {
		for(int i = 0; i < SLista.gaiola.size(); i++) {
			if(SLista.gaiola.get(i).getDezena() % 2 == 0)
				SLista.gaiola.remove(SLista.gaiola.get(i));
		}
	}
	
	public static Integer verificaLinhas() {
		int qtd1 = 0;
		int qtd2 = 0;
		int qtd3 = 0;
		int qtd4 = 0;
		int qtd5 = 0;
		int qtd6 = 0;
		
		List<Integer> linha1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> linha2 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		List<Integer> linha3 = Arrays.asList(21,22,23,24,25,26,27,28,29,30);
		List<Integer> linha4 = Arrays.asList(31,32,33,34,35,36,37,38,39,40);
		List<Integer> linha5 = Arrays.asList(41,42,43,44,45,46,47,48,49,50);
		List<Integer> linha6 = Arrays.asList(51,52,53,54,55,56,57,58,59,60);
		
		for(Dezena d : SLista.apostas) {
			if(linha1.contains(d)) {
				qtd1++;
				
				if(qtd1 > 2) {
					return qtd1;
				}
			}
			
			if(linha2.contains(d)) {
				qtd2++;
				
				if(qtd2 > 2) {
					return qtd2;
				}
			}
			
			if(linha3.contains(d)) {
				qtd3++;
				
				if(qtd3 > 2) {
					return qtd3;
				}
			}
			
			if(linha4.contains(d)) {
				qtd4++;
				
				if(qtd4 > 2) {
					return qtd4;
				}
			}
			
			if(linha5.contains(d)) {
				qtd5++;
				
				if(qtd5 > 2) {
					return qtd5;
				}
			}
			
			if(linha6.contains(d)) {
				qtd6++;
				
				if(qtd6 > 2) {
					return qtd6;
				}
			}
		}
		
		return 0;
	}
	
	
}

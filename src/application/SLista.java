package application;


import java.time.LocalTime;
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
}

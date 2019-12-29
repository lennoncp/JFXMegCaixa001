package application;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Random;

import javax.crypto.spec.DESedeKeySpec;

import org.apache.xmlbeans.impl.regex.REUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;

public class SLista {
	
	public static Random rad = new Random(LocalTime.now().toNanoOfDay());
	public static ObservableList<Dezena> contagemGerarl = FXCollections.observableArrayList();
	public static ObservableList<Dezena> contagemRange = FXCollections.observableArrayList();
	public static ObservableList<Dezena> sortedListDecrescente = FXCollections.observableArrayList();
	
	public static ObservableList<Dezenas> dezenas = FXCollections.observableArrayList();
	public static ObservableList<Dezena> replicadas = FXCollections.observableArrayList();
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

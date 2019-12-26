package application;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SLista {
	
	public static Random rad = new Random(LocalTime.now().toNanoOfDay());
	public static ObservableList<Dezena> _60Dezenas = FXCollections.observableArrayList();
	public static ObservableList<Dezenas> dezenas = FXCollections.observableArrayList();
	public static ObservableList<Dezena> replicadas = FXCollections.observableArrayList();
	public static ObservableList<Concursos> concursos = FXCollections.observableArrayList();
}

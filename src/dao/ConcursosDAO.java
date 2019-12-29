package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.Concursos;
import config.DBConfig;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ConcursosDAO {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ObservableList<Concursos> getConcursos(){
		ObservableList<Concursos> concursos = FXCollections.observableArrayList();
		
		con = DBConfig.getConnection();
		
		String q = "SELECT concurso, d1, d2, d3, d4, d5, d6 FROM concursos_mega;";
		
		try {
			ps = con.prepareStatement(q);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ObservableList<Integer> dezenas = FXCollections.observableArrayList();
				dezenas.add(rs.getInt("d1"));
				dezenas.add(rs.getInt("d2"));
				dezenas.add(rs.getInt("d3"));
				dezenas.add(rs.getInt("d4"));
				dezenas.add(rs.getInt("d5"));
				dezenas.add(rs.getInt("d6"));
				Concursos cs = new Concursos(rs.getInt("concurso"), dezenas);
				
				//TODO ConcursosDAO
				System.out.println(cs);
				
				concursos.add(cs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConfig.closeConnection();
		return concursos;
	}
	
	public ObservableList<Concursos> getConcursosRange(int range){
		ObservableList<Concursos> concursos = FXCollections.observableArrayList();
		
		con = DBConfig.getConnection();
		
		String q = "SELECT concurso, d1, d2, d3, d4, d5, d6 FROM concursos_mega ORDER BY concurso desc LIMIT " + range + "; ";
		
		try {
			ps = con.prepareStatement(q);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ObservableList<Integer> dezenas = FXCollections.observableArrayList();
				dezenas.add(rs.getInt("d1"));
				dezenas.add(rs.getInt("d2"));
				dezenas.add(rs.getInt("d3"));
				dezenas.add(rs.getInt("d4"));
				dezenas.add(rs.getInt("d5"));
				dezenas.add(rs.getInt("d6"));
				Concursos cs = new Concursos(rs.getInt("concurso"), dezenas);
				//TODO ConcursosDAO
				System.out.println(cs);
				
				concursos.add(cs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConfig.closeConnection();
		return concursos;
	}

}

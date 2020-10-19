package ar.edu.unlam.pb2.smartWatch;

import java.util.HashSet;

public class SmartWatch {
	
	private HashSet <Deporte> deportes;
	private String marca;
	
	public SmartWatch(String marca) {
		
		this.marca=marca;
		this.deportes = new HashSet <Deporte> ();
	}
	
}

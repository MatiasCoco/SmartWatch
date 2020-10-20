package ar.edu.unlam.pb2.smartWatch;

import java.util.HashSet;

public class Carrera extends Deporte {

	private Double ritmo; //(minutos que tarda en completar un km)
	//private Double valoresDescanso [] = new Double [] {10.0,20.0};
	private HashSet <ZonaDeFrecuencia> zonas; 
	
	public Carrera(Integer id, String nombre) {
		super (id, nombre);
		this.zonas  = new HashSet <ZonaDeFrecuencia>();
	}

	public void calcularRitmo() {
		Double tiempoEnMinutos = this.tiempoTranscurrido /60.0;
		
		this.pasarDistanciaAKM();
		this.ritmo = this.distanciaRecorrida / tiempoEnMinutos;
	}
	
	private void pasarDistanciaAKM() {
		this.distanciaRecorrida = this.distanciaRecorrida/1000.0;
	}

	public Double getRitmo() {
		return ritmo;
	}

	public void agregarZonaDeFrecuencia(ZonaDeFrecuencia zona) {
		this.zonas.add(zona);
	}
	
	public String getZonaActual(Double frecuenciaCardiaca) {
		
		for(ZonaDeFrecuencia zona : this.zonas) {
			
			if(frecuenciaCardiaca<zona.getMaxima() && frecuenciaCardiaca>=zona.getMinima()) {
				
				return zona.getNombreDeLaZona();
			}
		}
		
		return null;
	}
	
	public ZonaDeFrecuencia buscarZona (Integer idZona) {
		
		for (ZonaDeFrecuencia zonaDeFrecuencia : zonas) {
			if (zonaDeFrecuencia.getId().equals(idZona))
				return zonaDeFrecuencia;
		}
		return null;
	}

}

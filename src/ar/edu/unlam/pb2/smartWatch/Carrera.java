package ar.edu.unlam.pb2.smartWatch;

import java.util.HashSet;

public class Carrera extends Deporte {

	private Double ritmo; //(minutos que tarda en completar un km)
	private ZonaDeFrecuencia zonaDeFrecuencia; //zonaDeFrecuenciaCardiacaActual
	//private Double valoresDescanso [] = new Double [] {10.0,20.0};
	private HashSet <ZonaDeFrecuencia> zonas; 
	public Carrera() {
		
	}

	public void calcularRitmo() {
		Double tiempoEnMinutos = this.tiempoTranscurrido /60.0;
		
		this.pasarDistanciaAKM();
		this.zonas  = new HashSet <ZonaDeFrecuencia>();
		this.ritmo = this.distanciaRecorrida / tiempoEnMinutos;
	}
	
	private void pasarDistanciaAKM() {
		this.distanciaRecorrida = this.distanciaRecorrida/1000.0;
	}

	public Double getRitmo() {
		return ritmo;
	}

	public ZonaDeFrecuencia getZonaDeFrecuencia() {
		return zonaDeFrecuencia;
	}
	
	public void definirParametrosDeFrecuencia(ZonaDeFrecuencia zona) {
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

}

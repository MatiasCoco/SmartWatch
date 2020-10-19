package ar.edu.unlam.pb2.smartWatch;

import java.util.HashSet;

public class Ciclismo extends Deporte {

	// CICLISMO
		// DISTANCIARECORRIDA en km / TIEMPOTRANSCURRIDO en segundos /
		// Velocidad expresada en km/h / zonaDeFrecuenciaCardiacaActual / 
		//Cadencia en RPM /
	
	private Double velocidad;
	private HashSet <ZonaDeFrecuencia> zonas; 
	
	public Ciclismo() {
		
		zonas = new HashSet();
		
	}
	
	public void calcularVelocidad() {
		Double tiempo = this.pasarDeSegundosAHoras();
		Double distancia = this.pasarDistanciaDeMetrosAKilometros();
		this.velocidad = distancia/tiempo;
	}
	
	private Double pasarDistanciaDeMetrosAKilometros() {
		Double distanciaEnKM = this.distanciaRecorrida /1000.0;
		return distanciaEnKM;
	}
	
	private Double pasarDeSegundosAHoras() {
		Double tiempoEnHoras = ((this.tiempoTranscurrido/60.0)/60.0);
		return tiempoEnHoras;
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
	
	//comentario de prueba 
}

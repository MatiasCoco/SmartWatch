package ar.edu.unlam.pb2.smartWatch;

public class Ciclismo extends Deporte {

	// CICLISMO
		// DISTANCIARECORRIDA en km / TIEMPOTRANSCURRIDO en segundos /
		// Velocidad expresada en km/h / zonaDeFrecuenciaCardiacaActual / 
		//Cadencia en RPM /
	
	private Double velocidad;
	
	public Ciclismo() {
		
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
}

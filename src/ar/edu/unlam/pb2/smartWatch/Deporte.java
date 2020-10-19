package ar.edu.unlam.pb2.smartWatch;

public abstract class Deporte {

	// CICLISMO
	// DISTANCIARECORRIDA en km / TIEMPOTRANSCURRIDO en minutos /
	// Velocidad expresada en km/h / zonaDeFrecuenciaCardiacaActual / 
	//Cadencia en RPM /

	// NATACION
	// DISTANCIARECORRIDA en metros / TIEMPOTRANSCURRIDO en minutos y segundos /
	// Ritmo en minutos y segundos que tarda en recorrer 100m /

	// CAMINATA
	// Tiempo en minutos / distancia en metros /

	protected Double distanciaRecorrida;
	protected Integer tiempoTranscurrido;
	
	public void aumentoDeDistancia() {
		this.distanciaRecorrida++;
	}
	
	public Double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public Integer getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}

	public void aumentoDelTiempo() {
		this.tiempoTranscurrido++;
	}
	
}

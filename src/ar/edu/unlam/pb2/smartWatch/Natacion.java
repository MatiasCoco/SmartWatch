package ar.edu.unlam.pb2.smartWatch;

/*
 * Los nadadores desean contar con esta información:
 Distancia recorrida (en metros)
 Tiempo (en minutos y segundos)
 Ritmo (tiempo, en minutos y segundos que demora en recorrer 100 metros)
 */
public class Natacion extends Deporte {

	private Double ritmo;

	public Natacion() {
		super();
	}
	
	public void calcularRitmo() {
		
		ritmo = (100 * tiempoTranscurrido)/distanciaRecorrida; //verificar si la formula corresponde
		
	}
	
	public Double getRitmo() {
		return ritmo;
	}

}

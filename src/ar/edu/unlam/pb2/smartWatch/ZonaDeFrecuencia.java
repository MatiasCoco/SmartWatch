package ar.edu.unlam.pb2.smartWatch;

public class ZonaDeFrecuencia {

	private String nombreDeLaZona;
	private Double minima;
	private Double maxima;
	
//	public ZonaDeFrecuencia(Double frecuencia) {
//		
//		if(frecuencia >= 10.0 && frecuencia <= 20.0) {
//			
//			this.frecuencia = "Descanso";
//		}
//		
//		else if(frecuencia > 20.0 && frecuencia <= 30.0) {
//			
//			this.frecuencia = "Calentamiento";
//		}
//		
//		else if(frecuencia > 30.0 && frecuencia <= 40.0) {
//			this.frecuencia = "Aerobico";
//		}
//		
//		else if(frecuencia > 40.0 && frecuencia <= 50.0) {
//			this.frecuencia = "Umbral";
//		}
//		
//		else if(frecuencia > 50.0 && frecuencia <= 60.0) {
//			this.frecuencia = "Maximo";
//		}
//	}
	
	public ZonaDeFrecuencia(Double minima, Double maxima, String nombreDeLaZona) {
		this.minima=minima;
		this.maxima=maxima;
		this.nombreDeLaZona=nombreDeLaZona;
	}

	public String getNombreDeLaZona() {
		return nombreDeLaZona;
	}

	public Double getMinima() {
		return minima;
	}

	public Double getMaxima() {
		return maxima;
	}
	
}

package ar.edu.unlam.pb2.smartWatch;

public class Deportista {

	private String nombre;
	private Integer edadActual;
	private Double pesoActual;
	private Double alturaActual;
	private Integer pasosDiarios;

	public Deportista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		
		this.nombre=nombre;
		this.edadActual=edadActual;
		this.pesoActual=pesoActual;
		this.alturaActual=alturaActual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(Integer edadActual) {
		this.edadActual = edadActual;
	}

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public Double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}
	
	public void aumentarCantidadDePasos() {
		this.pasosDiarios++;
	}

	public Integer getPasosDiarios() {
		return pasosDiarios;
	}
	
}

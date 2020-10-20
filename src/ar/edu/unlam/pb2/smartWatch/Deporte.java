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
	protected Integer id;
	protected String nombre;
	
	public Deporte (Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
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

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deporte other = (Deporte) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

package ar.edu.unlam.pb2.smartWatch;

public class ZonaDeFrecuencia {

	private String nombreDeLaZona;
	private Double minima;
	private Double maxima;
	private Integer id;

	
	public ZonaDeFrecuencia(Integer id, Double minima, Double maxima, String nombreDeLaZona) {
		this.id = id;
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

	public Integer getId() {
		return id;
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
		ZonaDeFrecuencia other = (ZonaDeFrecuencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}

package uniandes.isis2304.parranderos.negocio;

public class PlanesDisponibles implements VOPlanesDisponibles {
	
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	private Double costoTotal;
	
	private Integer diasTotales;

	public PlanesDisponibles(Long id, String nombre, String descripcion, Double costoTotal, Integer diasTotales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoTotal = costoTotal;
		this.diasTotales = diasTotales;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(Double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Integer getDiasTotales() {
		return diasTotales;
	}

	public void setDiasTotales(Integer diasTotales) {
		this.diasTotales = diasTotales;
	}

	@Override
	public String toString() {
		return "PlanesDisponibles [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", costoTotal="
				+ costoTotal + ", diasTotales=" + diasTotales + "]";
	}
	
	


	
	

}

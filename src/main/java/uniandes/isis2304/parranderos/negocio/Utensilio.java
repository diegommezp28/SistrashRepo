package uniandes.isis2304.parranderos.negocio;

public class Utensilio implements VOUtensilio{
	
	private Long id;
	
	private String nombre;
	
	public Double costoReparacion;


	public Utensilio() {
		super();
		id = 0L;
		nombre = "";
		costoReparacion = 0.0;
	}

	public Utensilio(Long id, String nombre, Double costoReparacion) {
		this.id = id;
		this.nombre = nombre;
		this.costoReparacion = costoReparacion;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCostoReparacion() {
		return costoReparacion;
	}

	public void setCostoReparacion(Double costoReparacion) {
		this.costoReparacion = costoReparacion;
	}

	@Override
	public String toString() {
		return "Utensilio [id=" + id + ", nombre=" + nombre + ", costoReparacion=" + costoReparacion + "]";
	}

}

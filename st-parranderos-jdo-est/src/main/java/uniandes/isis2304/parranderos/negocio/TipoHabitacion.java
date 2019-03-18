package uniandes.isis2304.parranderos.negocio;

public class TipoHabitacion implements VOTipoHabitacion{

	private String nombre;
	
	private Double costoNoche;
	
	private String descripcion;


	public TipoHabitacion(String nombre, Double costoNoche, String descripcion) {
		super();
		this.nombre = nombre;
		this.costoNoche = costoNoche;
		this.descripcion = descripcion;
	}
	
	public TipoHabitacion() {
		super();
		this.nombre = " ";
		this.costoNoche = 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCostoNoche() {
		return costoNoche;
	}

	public void setCostoNoche(Double costoNoche) {
		this.costoNoche = costoNoche;
	}	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoHabitacion [nombre=" + nombre + ", costoNoche=" + costoNoche + ", descripcion=" + descripcion + "]";
	}
	
}

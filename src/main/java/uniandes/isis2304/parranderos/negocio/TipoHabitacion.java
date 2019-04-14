package uniandes.isis2304.parranderos.negocio;

public class TipoHabitacion implements VOTipoHabitacion{

	private String nombre;
	
	private Double costoNoche;
	
	private String descripcion;
	
	private Long idHotel;
	
	public TipoHabitacion(String nombre, Double costoNoche, String descripcion, Long idHotel) {
		this.nombre = nombre;
		this.costoNoche = costoNoche;
		this.descripcion = descripcion;
		this.idHotel = idHotel;
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
	
	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	@Override
	public String toString() {
		return "TipoHabitacion [nombre=" + nombre + ", costoNoche=" + costoNoche + ", descripcion=" + descripcion
				+ ", idHotel=" + idHotel + "]";
	}
	
}

package uniandes.isis2304.parranderos.negocio;

/**
 * @author Diego Gómez
 *
 */
public class Servicio implements VOServicio{

	
	private String nombre;
	
	private Integer capacidad;
	
	private String descripcion;
	
	private Long idHotel;
	
	private Double costo;
	
	public Long id;
	


	public Servicio(String nombre, Integer capacidad, String descripcion, Long idHotel, Double costo, Long id) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.descripcion = descripcion;
		this.idHotel = idHotel;
		this.costo = costo;
		this.id = id;
	}

	public Servicio() {
		super();
		nombre ="";
		capacidad = 0; 
		descripcion = "";
		idHotel = 0L;
		costo = 0.0;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}



	public Integer getCapacidad() {
		return capacidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}  

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", capacidad=" + capacidad + ", descripcion=" + descripcion + ", idHotel="
				+ idHotel + ", costo=" + costo + ", id=" + id + "]";
	}

}

package uniandes.isis2304.parranderos.negocio;

/**
 * @author Diego Gómez
 *
 */
public class Servicio implements VOServicio{

	
	public String nombre;
	
	private Integer capacidad;
	
	private String descripcion;
	
	public Servicio( String nombre, Integer capacidad, String descripcion) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.descripcion = descripcion;
	}
	
	public Servicio() {
		super();
		nombre ="";
		capacidad = 0; 
		descripcion = "";
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



	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", capacidad=" + capacidad + ", descripcion=" + descripcion + "]";
	}

}

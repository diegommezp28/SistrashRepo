package uniandes.isis2304.parranderos.negocio;


/**
 * @author Diego Gómez
 * TODO Contructor vacío y atributos de tablas
 */
public class Hotel implements VOHotel {

	private String nombre;
	

	private String ciudad;
	
	private Integer numeroHabitaciones;
	
	
	public Hotel(String nombre, String ciudad, Integer numeroHabitaciones) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	public Hotel() {
		super();
		this.nombre = " ";
		this.ciudad = " ";
		this.numeroHabitaciones = 0;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setNumeroHabitaciones(Integer numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getCiudad() {
		// TODO Auto-generated method stub
		return ciudad;
	}

	@Override
	public Integer getNumeroHabitaciones() {
		// TODO Auto-generated method stub
		return numeroHabitaciones;
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", ciudad=" + ciudad + ", numeroHabitaciones=" + numeroHabitaciones + "]";
	}
	
	

}

package uniandes.isis2304.parranderos.negocio;

public class TipoHabitacion implements VOTipoHabitacion{

	private String nombre;
	
	private Double costoNoche;

	public TipoHabitacion(String nombre, Double costoNoche) {
		super();
		this.nombre = nombre;
		this.costoNoche = costoNoche;
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

	@Override
	public String toString() {
		return "TipoHabitacion [nombre=" + nombre + ", costoNoche=" + costoNoche + "]";
	}
	
}

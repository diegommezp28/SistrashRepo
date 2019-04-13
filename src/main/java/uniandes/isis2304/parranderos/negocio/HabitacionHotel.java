package uniandes.isis2304.parranderos.negocio;

public class HabitacionHotel implements VOHabitacionHotel {

	private String nombreHotel;
	
	private String codigoHabitacion;

	public HabitacionHotel(String nombreHotel, String codigoHabitacion) {
		super();
		this.nombreHotel = nombreHotel;
		this.codigoHabitacion = codigoHabitacion;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getCodigoHabitacion() {
		return codigoHabitacion;
	}

	public void setCodigoHabitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
	}

	@Override
	public String toString() {
		return "HabitacionHotel [nombreHotel=" + nombreHotel + ", codigoHabitacion=" + codigoHabitacion + "]";
	}
	
	
}

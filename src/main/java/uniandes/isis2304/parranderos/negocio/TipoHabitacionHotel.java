package uniandes.isis2304.parranderos.negocio;

public class TipoHabitacionHotel implements VOTipoHabitacionHotel {

	private String nombreTipo;
	
	private String nombreHotel;

	public TipoHabitacionHotel(String nombreTipo, String nombreHotel) {
		super();
		this.nombreTipo = nombreTipo;
		this.nombreHotel = nombreHotel;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	@Override
	public String toString() {
		return "TipoHabitacionHotel [nombreTipo=" + nombreTipo + ", nombreHotel=" + nombreHotel + "]";
	}
	
}

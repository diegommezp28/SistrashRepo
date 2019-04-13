package uniandes.isis2304.parranderos.negocio;

public class Habitacion implements VOHabitacion{

	private String codigo;
	
	private String nombreHotel;
	
	private String nombreTipoHabitacion;

	public Habitacion(String codigo, String nombreHotel, String nombreTipoHabitacion) {
		super();
		this.codigo = codigo;
		this.nombreHotel = nombreHotel;
		this.nombreTipoHabitacion = nombreTipoHabitacion;
	}

	public Habitacion() {
		super();
		this.codigo = " ";
		this.nombreHotel = " ";
		this.nombreTipoHabitacion = " ";
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getNombreTipoHabitacion() {
		return nombreTipoHabitacion;
	}

	public void setNombreTipoHabitacion(String nombreTipoHabitacion) {
		this.nombreTipoHabitacion = nombreTipoHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [codigo=" + codigo + ", nombreHotel=" + nombreHotel + ", nombreTipoHabitacion="
				+ nombreTipoHabitacion + "]";
	}
	
}

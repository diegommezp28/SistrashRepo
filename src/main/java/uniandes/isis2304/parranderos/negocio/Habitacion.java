package uniandes.isis2304.parranderos.negocio;

public class Habitacion implements VOHabitacion{

	private String codigo;
	
	private Long idHotel;
	
	private String nombreTipoHabitacion;

	public Habitacion(String codigo, Long idHotel, String nombreTipoHabitacion) {
		this.codigo = codigo;
		this.idHotel = idHotel;
		this.nombreTipoHabitacion = nombreTipoHabitacion;
	}
	public Habitacion() {
		super();
		this.codigo = " ";
		this.idHotel = 0L;
		this.nombreTipoHabitacion = " ";
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Long getIdHotel() {
		return idHotel;
	}
	
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public String getNombreTipoHabitacion() {
		return nombreTipoHabitacion;
	}

	public void setNombreTipoHabitacion(String nombreTipoHabitacion) {
		this.nombreTipoHabitacion = nombreTipoHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [codigo=" + codigo + ", idHotel=" + idHotel + ", nombreTipoHabitacion="
				+ nombreTipoHabitacion + "]";
	}
	
}

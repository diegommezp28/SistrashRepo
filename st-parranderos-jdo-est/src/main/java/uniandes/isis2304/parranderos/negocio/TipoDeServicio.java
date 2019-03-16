package uniandes.isis2304.parranderos.negocio;

public class TipoDeServicio implements VOTipoServicio {

	private String nombre;
	
	private Boolean reserva;

	public TipoDeServicio(String nombre, Boolean reserva) {
		super();
		this.nombre = nombre;
		this.reserva = reserva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getReserva() {
		return reserva;
	}

	public void setReserva(Boolean reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "TipoDeServicio [nombre=" + nombre + ", reserva=" + reserva + "]";
	}
}

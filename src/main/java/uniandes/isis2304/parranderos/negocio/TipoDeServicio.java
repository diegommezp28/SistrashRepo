package uniandes.isis2304.parranderos.negocio;

public class TipoDeServicio implements VOTipoServicio {
	
	private Long id;

	private String nombre;
	
	private Boolean reserva;

	public TipoDeServicio(Long id, String nombre, Boolean reserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.reserva = reserva;
	}

	public TipoDeServicio() {
		super();
		this.nombre = "";
		this.reserva =  false;
		id = 0L;
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
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TipoDeServicio [id=" + id + ", nombre=" + nombre + ", reserva=" + reserva + "]";
	}
}

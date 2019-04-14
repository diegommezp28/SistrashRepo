package uniandes.isis2304.parranderos.negocio;

public class Factura implements VOFactura {
	
	private Long idReserva;
	
	private Long idUsuario;
	
	private Double totalAPagar;
	
	private Long id;


	public Factura(Long idReserva, Long idUsuario, Double totalAPagar, Long id) {
		this.idReserva = idReserva;
		this.idUsuario = idUsuario;
		this.totalAPagar = totalAPagar;
		this.id = id;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Double getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(Double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Factura [idReserva=" + idReserva + ", idUsuario=" + idUsuario + ", totalAPagar=" + totalAPagar + ", id="
				+ id + "]";
	}
	
	



}

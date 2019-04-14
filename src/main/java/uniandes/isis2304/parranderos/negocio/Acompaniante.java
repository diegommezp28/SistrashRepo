package uniandes.isis2304.parranderos.negocio;

public class Acompaniante implements VOAcompaniante {
	
	private Long idReserva;
	
	private Integer documento;
	
	private String tipoDocumento;
	
	private String nombre;
	
	private Boolean acompaniante;

	public Acompaniante(Long idReserva, Integer documento, String tipoDocumento, String nombre, Boolean acompaniante) {
		this.idReserva = idReserva;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.nombre = nombre;
		this.acompaniante = acompaniante;
	}

	public Acompaniante() {
		super();
		idReserva = 0L;
		this.documento = 0;
		this.tipoDocumento = " ";
		this.nombre = " ";
		this.acompaniante = false;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getAcompaniante() {
		return acompaniante;
	}

	public void setAcompaniante(Boolean acompaniante) {
		this.acompaniante = acompaniante;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	@Override
	public String toString() {
		return "Acompaniante [idReserva=" + idReserva + ", documento=" + documento + ", tipoDocumento=" + tipoDocumento
				+ ", nombre=" + nombre + ", acompaniante=" + acompaniante + "]";
	}

}

package uniandes.isis2304.parranderos.negocio;

public class AcompanianteReserva implements VOAcompanianteReserva{
	
	private Integer documentoAcompaniante;
	
	private Long idReserva;

	public AcompanianteReserva(Integer documentoAcompaniante, Long idReserva) {
		super();
		this.documentoAcompaniante = documentoAcompaniante;
		this.idReserva = idReserva;
	}

	public Integer getDocumentoAcompaniante() {
		return documentoAcompaniante;
	}

	public void setDocumentoAcompaniante(Integer documentoAcompaniante) {
		this.documentoAcompaniante = documentoAcompaniante;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	@Override
	public String toString() {
		return "AcompanianteReserva [documentoAcompaniante=" + documentoAcompaniante + ", idReserva=" + idReserva + "]";
	}

}

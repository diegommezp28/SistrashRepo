package uniandes.isis2304.parranderos.negocio;

public class Factura implements VOFactura {
	
	private Long idReserva;
	
	private Integer documentoUsuario;
	
	private String tipoDocumentoUsuario;
	
	private Double totalAPagar;
	
	private Long id;

	public Factura(Long idReserva, Integer documentoUsuario, String tipoDocumentoUsuario, Double totalAPagar, Long id) {
		this.idReserva = idReserva;
		this.documentoUsuario = documentoUsuario;
		this.tipoDocumentoUsuario = tipoDocumentoUsuario;
		this.totalAPagar = totalAPagar;
		this.id = id;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getDocumentoUsuario() {
		return documentoUsuario;
	}

	public void setDocumentoUsuario(Integer documentoUsuario) {
		this.documentoUsuario = documentoUsuario;
	}

	public String getTipoDocumentoUsuario() {
		return tipoDocumentoUsuario;
	}

	public void setTipoDocumentoUsuario(String tipoDocumentoUsuario) {
		this.tipoDocumentoUsuario = tipoDocumentoUsuario;
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
		return "Factura [idReserva=" + idReserva + ", documentoUsuario=" + documentoUsuario + ", tipoDocumentoUsuario="
				+ tipoDocumentoUsuario + ", totalAPagar=" + totalAPagar + ", id=" + id + "]";
	}
	
	



}

package uniandes.isis2304.parranderos.negocio;

public interface VOFactura {

	public Long getId();
	
	public Double getTotalAPagar();
	
	public String getTipoDocumentoUsuario();
	
	public Integer getDocumentoUsuario();
	
	public Long getIdReserva();
}

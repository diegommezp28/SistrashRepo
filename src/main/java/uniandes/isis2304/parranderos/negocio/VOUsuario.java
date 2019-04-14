package uniandes.isis2304.parranderos.negocio;

public interface VOUsuario {
	
	public Long getId();
	
	public String getTipoDocumento();
	
	public Integer getNumDocumento();
	
	public String getNombre();
	
	public String getCorreo();
	
	public String getNombreRolUsuario();
	
	public Long getIdHotel();
	
	public Long getIdTipoServicio();
	
	@Override
	public String toString();
	
	

}

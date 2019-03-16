package uniandes.isis2304.parranderos.negocio;

public interface VOUsuario {
	
	public String getTipoDocumento();
	
	public Integer getNumDocumento();
	
	public String getNombre();
	
	public String getCorreo();
	
	public String getNombreRolUsuario();
	
	public String getNombreHotel();
	
	@Override
	public String toString();
	
	

}

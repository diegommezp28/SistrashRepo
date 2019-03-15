package uniandes.isis2304.parranderos.negocio;

public interface VOUsuario {
	
	public String getTipoDocumento();
	
	public Integer getNumDocumento();
	
	public String getNombre();
	
	public String getCorreo();
	
	@Override
	public String toString();
	
	

}

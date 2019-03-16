package uniandes.isis2304.parranderos.negocio;


//TODO terminar resto de atributos de las tablas relacionales
//TODO constructor vacío
/**
 * @author Diego Gómez
 */
public class Usuario implements VOUsuario {
	

	private String tipoDocumento;
	
	private Integer numDocumento;
	
	private String nombre;
	
	private String correo;
	
	public Usuario(String tipoDocumento, Integer numDocumento, String nombre, String correo) {
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public void setNumDocumento(Integer numDocumento) {
		this.numDocumento = numDocumento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	@Override
	public Integer getNumDocumento() {
		return numDocumento;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getCorreo() { 
		return correo;
	}

	@Override
	public String toString() {
		return "Usuario [tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", nombre=" + nombre
				+ ", correo=" + correo + "]";
	}

}

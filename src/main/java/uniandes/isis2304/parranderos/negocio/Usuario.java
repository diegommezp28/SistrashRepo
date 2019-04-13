package uniandes.isis2304.parranderos.negocio;


/**
 * @author Diego Gómez
 */
public class Usuario implements VOUsuario {
	

	private String tipoDocumento;
	
	private Integer numDocumento;
	
	private String nombre;
	
	private String correo;
	
	public String nombreRolUsuario;
	
	public String nombreHotel;
	
	public Usuario(String tipoDocumento, Integer numDocumento, String nombre, String correo, String nombreRolUsuario,
			String nombreHotel) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.correo = correo;
		this.nombreRolUsuario = nombreRolUsuario;
		this.nombreHotel = nombreHotel;
	}

	public Usuario() {
		super();
		this.tipoDocumento = " ";
		this.numDocumento = 0;
		this.nombre = " ";
		this.correo = " ";
		this.nombreRolUsuario = "";
		this.nombreHotel = " ";
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

	public String getNombreRolUsuario() {
		return nombreRolUsuario;
	}

	public void setNombreRolUsuario(String nombreRolUsuario) {
		this.nombreRolUsuario = nombreRolUsuario;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public Integer getNumDocumento() {
		return numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	@Override
	public String toString() {
		return "Usuario [tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", nombre=" + nombre
				+ ", correo=" + correo + ", nombreRolUsuario=" + nombreRolUsuario + ", nombreHotel=" + nombreHotel
				+ "]";
	}

}

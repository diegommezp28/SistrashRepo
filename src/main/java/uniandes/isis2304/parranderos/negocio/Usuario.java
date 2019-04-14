package uniandes.isis2304.parranderos.negocio;


/**
 * @author Diego Gómez
 */
public class Usuario implements VOUsuario {
	
	
	private Long id;

	private String tipoDocumento;
	
	private Integer numDocumento;
	
	private String nombre;
	
	private String correo;
	
	public String nombreRolUsuario;
	
	public Long idHotel;
	
	public Long idTipoServicio;
	


	public Usuario(Long id, String tipoDocumento, Integer numDocumento, String nombre, String correo,
			String nombreRolUsuario, Long idHotel, Long idTipoServicio) {
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.correo = correo;
		this.nombreRolUsuario = nombreRolUsuario;
		this.idHotel = idHotel;
		this.idTipoServicio = idTipoServicio;
	}

	public Usuario() {
		super();
		this.tipoDocumento = " ";
		this.numDocumento = 0;
		this.nombre = " ";
		this.correo = " ";
		this.nombreRolUsuario = "";
		this.idHotel = 0L;
		this.idTipoServicio = 0L;
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

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTipoServicio() {
		return idTipoServicio;
	}

	public void setIdTipoServicio(Long idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", nombre="
				+ nombre + ", correo=" + correo + ", nombreRolUsuario=" + nombreRolUsuario + ", idHotel=" + idHotel
				+ ", idTipoServicio=" + idTipoServicio + "]";
	}

}

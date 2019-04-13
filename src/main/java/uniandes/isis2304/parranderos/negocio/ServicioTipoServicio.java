package uniandes.isis2304.parranderos.negocio;

public class ServicioTipoServicio implements VOServicioTipoServicio{
	
	private String nombreServicio;
	
	private Long idTipoServicio;

	public ServicioTipoServicio(String nombreServicio, Long idTipoServicio) {
		super();
		this.nombreServicio = nombreServicio;
		this.idTipoServicio = idTipoServicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Long getIdTipoServicio() {
		return idTipoServicio;
	}

	public void setIdTipoServicio(Long idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}

	@Override
	public String toString() {
		return "ServicioTipoServicio [nombreServicio=" + nombreServicio + ", idTipoServicio=" + idTipoServicio + "]";
	}
	
	

}

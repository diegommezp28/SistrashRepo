package uniandes.isis2304.parranderos.negocio;

public class Acompaniante implements VOAcompaniante {
	
	private Integer documento;
	
	private String tipoDocumento;
	
	private String nombre;
	
	private Boolean acompaniante;

	public Acompaniante(Integer documento, String tipoDocumento, String nombre, Boolean acompaniante) {
		super();
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.nombre = nombre;
		this.acompaniante = acompaniante;
	}

	public Acompaniante() {
		super();
		this.documento = 0;
		this.tipoDocumento = " ";
		this.nombre = " ";
		this.acompaniante = false;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getAcompaniante() {
		return acompaniante;
	}

	public void setAcompaniante(Boolean acompaniante) {
		this.acompaniante = acompaniante;
	}

	@Override
	public String toString() {
		return "Acompaniante [documento=" + documento + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre
				+ ", acompaniante=" + acompaniante + "]";
	}

}

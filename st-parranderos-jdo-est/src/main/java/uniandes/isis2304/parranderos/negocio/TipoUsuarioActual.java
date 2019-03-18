package uniandes.isis2304.parranderos.negocio;

public enum TipoUsuarioActual {
	CLIENTE,
	GERENTE,
	RECEPCIONISTA,
	ADMINISTRADORDEDATOS,
	EMPLEADO;
	private Integer documento;
	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}


}

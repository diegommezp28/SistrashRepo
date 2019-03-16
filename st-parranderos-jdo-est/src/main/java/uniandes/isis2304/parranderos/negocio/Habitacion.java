package uniandes.isis2304.parranderos.negocio;

public class Habitacion {

	private String codigo;

	public Habitacion(String codigo) {
		super();
		this.setCodigo(codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Habitacion [codigo=" + codigo + "]";
	}
	
}

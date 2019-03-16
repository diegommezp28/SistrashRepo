package uniandes.isis2304.parranderos.negocio;

public class RolUsuario implements VORolUsuario {

	private String nombre;
	
	private String descripcion;

	public RolUsuario(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "RolUsuario [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}

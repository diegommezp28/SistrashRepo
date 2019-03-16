package uniandes.isis2304.parranderos.negocio;

public class Producto implements VOProducto{

	private String nombre;
	
	private Double costo;

	public Producto(String nombre, Double costo) {
		super();
		this.nombre = nombre;
		this.costo = costo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", costo=" + costo + "]";
	}
}

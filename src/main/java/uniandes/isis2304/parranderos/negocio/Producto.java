package uniandes.isis2304.parranderos.negocio;

public class Producto implements VOProducto{

	private String nombre;
	
	private Double costo;
	
	private String nombreServicio;



	public Producto() {
		super();
		nombre = "";
		
		costo = 0.0;
		
		nombreServicio = "";
	}

	public Producto(String nombre, Double costo, String nombreServicio) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.nombreServicio = nombreServicio;
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

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", costo=" + costo + ", nombreServicio=" + nombreServicio + "]";
	}


}

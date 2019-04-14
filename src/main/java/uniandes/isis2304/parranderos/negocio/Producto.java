package uniandes.isis2304.parranderos.negocio;

public class Producto implements VOProducto{

	private Long id;
	
	private String nombre;

	private Double costo;

	private Long idServicio;



	public Producto() {
		super();
		nombre = "";

		costo = 0.0;

		idServicio = 0L;
		
		id = 0l;
	}


	public Producto(Long id, String nombre, Double costo, Long idServicio) {
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
		this.idServicio = idServicio;
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


	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", costo=" + costo + ", idServicio=" + idServicio + "]";
	}


}

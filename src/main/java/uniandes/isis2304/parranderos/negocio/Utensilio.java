package uniandes.isis2304.parranderos.negocio;

public class Utensilio implements VOUtensilio{
	
	private Long id;
	
	private String nombre;
	
	private Boolean buenEstado;
	
	private Boolean prestado;



	public Utensilio() {
		super();
		id = 0L;
		nombre = "";
		buenEstado = true;
		prestado = false;
		
	}

	public Utensilio(Long id, String nombre, Boolean buenEstado, Boolean prestado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.buenEstado = buenEstado;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getBuenEstado() {
		return buenEstado;
	}

	public void setBuenEstado(Boolean buenEstado) {
		this.buenEstado = buenEstado;
	}

	public Boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(Boolean prestado) {
		this.prestado = prestado;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Utensilio [id=" + id + ", nombre=" + nombre + ", buenEstado=" + buenEstado + ", prestado=" + prestado
				+ "]";
	}


}

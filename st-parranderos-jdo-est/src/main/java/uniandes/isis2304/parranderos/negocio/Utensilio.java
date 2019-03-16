package uniandes.isis2304.parranderos.negocio;

public class Utensilio implements VOUtensilio{
	
	private String nombre;
	
	private Boolean buenEstado;
	
	private Boolean prestado;

	public Utensilio(String nombre, Boolean buenEstado, Boolean prestado) {
		super();
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

	@Override
	public String toString() {
		return "Utensilio [nombre=" + nombre + ", buenEstado=" + buenEstado + ", prestado=" + prestado + "]";
	}

}

package uniandes.isis2304.parranderos.negocio;

public class PlanesDisponibles implements VOPlanesDisponibles {
	
	private String nombre;
	
	private String descripcion;
	
	private Double costoTotal;
	
	private Integer diasTotales;
	
	private String nombreHotel;

	public PlanesDisponibles( ) {
		super();
		this.nombre = " ";
		this.descripcion = " ";
		this.costoTotal = 0.0;
		this.diasTotales = 0;
		nombreHotel = " ";
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

	public Double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(Double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Integer getDiasTotales() {
		return diasTotales;
	}

	public void setDiasTotales(Integer diasTotales) {
		this.diasTotales = diasTotales;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}


	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}


	@Override
	public String toString() {
		return "PlanesDisponibles [nombre=" + nombre + ", descripcion=" + descripcion + ", costoTotal=" + costoTotal
				+ ", diasTotales=" + diasTotales + ", nombreHotel=" + nombreHotel + "]";
	}
	
	


	
	

}

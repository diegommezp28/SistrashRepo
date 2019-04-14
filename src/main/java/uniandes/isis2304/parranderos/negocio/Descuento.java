package uniandes.isis2304.parranderos.negocio;

public class Descuento implements VODescuento{
	
	private Integer porcentaje;
	
	private Integer maximoProductos;
	
	private String nombrePlan;
	
	private Long idProducto;

	public Descuento() {
		super();
		porcentaje = 0;
		maximoProductos = 0;
		nombrePlan = "";
		idProducto = 0l;
	}


	public Descuento(Integer porcentaje, Integer maximoProductos, String nombrePlan, Long idProducto, Long idServicio) {
		this.porcentaje = porcentaje;
		this.maximoProductos = maximoProductos;
		this.nombrePlan = nombrePlan;
		this.idProducto = idProducto;
	}


	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Integer getMaximoProductos() {
		return maximoProductos;
	}

	public void setMaximoProductos(Integer maximoProductos) {
		this.maximoProductos = maximoProductos;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}


	public Long getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "Descuento [porcentaje=" + porcentaje + ", maximoProductos=" + maximoProductos + ", nombrePlan="
				+ nombrePlan + ", idProducto=" + idProducto + "]";
	}


	

}

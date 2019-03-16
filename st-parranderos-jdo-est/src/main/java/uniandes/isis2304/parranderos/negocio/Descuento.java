package uniandes.isis2304.parranderos.negocio;

public class Descuento implements VODescuento{
	
	private Integer porcentaje;
	
	private Integer maximoProductos;
	
	private String nombrePlan;
	
	private String nombreProducto;
	
	private String nombreServicio;

	public Descuento() {
		super();
		porcentaje = 0;
		maximoProductos = 0;
		nombrePlan = "";
		nombreProducto = "";
		nombreServicio = "";
	}

	public Descuento(Integer porcentaje, Integer maximoProductos, String nombrePlan, String nombreProducto, String nombreServicio) {
		super();
		this.porcentaje = porcentaje;
		this.maximoProductos = maximoProductos;
		this.nombrePlan = nombrePlan;
		this.nombreProducto = nombreProducto;
		this.nombreServicio = nombreServicio;
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

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	@Override
	public String toString() {
		return "Descuento [porcentaje=" + porcentaje + ", maximoProductos=" + maximoProductos + ", nombrePlan="
				+ nombrePlan + ", nombreProducto=" + nombreProducto + ", nombreServicio=" + nombreServicio + "]";
	}


	

}

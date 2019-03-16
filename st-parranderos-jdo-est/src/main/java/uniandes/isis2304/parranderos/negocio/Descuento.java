package uniandes.isis2304.parranderos.negocio;

public class Descuento implements VODescuento{
	
	private Integer porcentaje;
	
	private Integer maximoProducto;

	public Descuento(Integer porcentaje, Integer maximoProducto) {
		super();
		this.porcentaje = porcentaje;
		this.maximoProducto = maximoProducto;
	}

	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Integer getMaximoProducto() {
		return maximoProducto;
	}

	public void setMaximoProducto(Integer maximoProducto) {
		this.maximoProducto = maximoProducto;
	}

	@Override
	public String toString() {
		return "Descuento [porcentaje=" + porcentaje + ", maximoProducto=" + maximoProducto + "]";
	}
	

}

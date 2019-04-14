package uniandes.isis2304.parranderos.negocio;

public class ProductosConsumidos implements VOProductosConsumidos{
	
	public Long id;
	
	private Long idConsumo;
	
	private Long idProducto;
	
	private Integer cantidad;
	

	public ProductosConsumidos(Long id, Long idConsumo, Long idProducto, Integer cantidad) {
		this.id = id;
		this.idConsumo = idConsumo;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	public ProductosConsumidos() {
		super();
		id =0l;
		this.idConsumo = 0L;
		this.idProducto =0l;
		cantidad =0;
	}
	public Long getIdConsumo() {
		return idConsumo;
	}

	public void setIdConsumo(Long idConsumo) {
		this.idConsumo = idConsumo;
	}


	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	
	
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ProductosConsumidos [id=" + id + ", idConsumo=" + idConsumo + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + "]";
	}
	
	

}

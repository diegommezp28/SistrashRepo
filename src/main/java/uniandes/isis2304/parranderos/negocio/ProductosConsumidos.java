package uniandes.isis2304.parranderos.negocio;

public class ProductosConsumidos implements VOProductosConsumidos{
	
	private Long idConsumo;
	
	private String nombreProducto;
	
	private String nombreServicio;

	public ProductosConsumidos(Long idConsumo, String nombreProducto, String nombreServicio) {
		super();
		this.idConsumo = idConsumo;
		this.nombreProducto = nombreProducto;
		this.nombreServicio = nombreServicio;
	}

	public ProductosConsumidos() {
		super();
		this.idConsumo = 0L;
		this.nombreProducto = "";
		this.nombreServicio = "";
	}
	public Long getIdConsumo() {
		return idConsumo;
	}

	public void setIdConsumo(Long idConsumo) {
		this.idConsumo = idConsumo;
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
		return "ProductosConsumidos [idConsumo=" + idConsumo + ", nombreProducto=" + nombreProducto
				+ ", nombreServicio=" + nombreServicio + "]";
	}
	
	

}

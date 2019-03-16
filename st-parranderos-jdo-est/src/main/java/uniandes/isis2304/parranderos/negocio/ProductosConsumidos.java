package uniandes.isis2304.parranderos.negocio;

public class ProductosConsumidos implements VOProductosConsumidos{
	
	private Long idConsumo;
	
	private String nombreProducto;

	public ProductosConsumidos(Long idConsumo, String nombreProducto) {
		super();
		this.idConsumo = idConsumo;
		this.nombreProducto = nombreProducto;
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

	@Override
	public String toString() {
		return "ProductosConsumidos [idConsumo=" + idConsumo + ", nombreProducto=" + nombreProducto + "]";
	}
	
	

}

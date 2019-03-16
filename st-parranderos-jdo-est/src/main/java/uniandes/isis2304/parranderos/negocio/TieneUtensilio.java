package uniandes.isis2304.parranderos.negocio;

public class TieneUtensilio implements VOTieneUtensilio {
	
	private Integer cantidad;
	
	private Boolean buenEstado;
	
	private Double costo;

	public TieneUtensilio(Integer cantidad, Boolean buenEstado, Double costo) {
		super();
		this.cantidad = cantidad;
		this.buenEstado = buenEstado;
		this.costo = costo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getBuenEstado() {
		return buenEstado;
	}

	public void setBuenEstado(Boolean buenEstado) {
		this.buenEstado = buenEstado;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "TieneUtensilio [cantidad=" + cantidad + ", buenEstado=" + buenEstado + ", costo=" + costo + "]";
	}

}

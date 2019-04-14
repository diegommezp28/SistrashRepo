package uniandes.isis2304.parranderos.negocio;

public class TieneUtensilio implements VOTieneUtensilio {
	
	private Long id;
	
	private Long idReserva;
	
	private Long idUtensilio;
	
	private Boolean buenEstado;
	
	private Double costo;


	public TieneUtensilio(Long id, Long idReserva, Long idUtensilio, Boolean buenEstado, Double costo) {
		this.id = id;
		this.idReserva = idReserva;
		this.idUtensilio = idUtensilio;
		this.buenEstado = buenEstado;
		this.costo = costo;
	}


	public TieneUtensilio() {
		super();
		buenEstado = true;
		costo = 0.0;
		idReserva = 0L;
		idUtensilio = 0L;
		id = 0l;
		
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


	public Long getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}


	public Long getIdUtensilio() {
		return idUtensilio;
	}


	public void setIdUtensilio(Long idUtensilio) {
		this.idUtensilio = idUtensilio;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TieneUtensilio [id=" + id + ", idReserva=" + idReserva + ", idUtensilio=" + idUtensilio
				+ ", buenEstado=" + buenEstado + ", costo=" + costo + "]";
	}



}

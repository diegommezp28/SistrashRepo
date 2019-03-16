package uniandes.isis2304.parranderos.negocio;

public class Consumo implements VOConsumo{
	
	private Long id;
	
	private Double totalConsumo;
	
	private Long idReserva;
	
	private String nombreServicio;    



	public Consumo() {
		super();
		id = 0L;
		totalConsumo =0.0;
		idReserva = 0L;
		nombreServicio= "";
		
	}

	public Consumo(Long id, Double totalConsumo, Long idReserva, String nombreServicio) {
		super();
		this.id = id;
		this.totalConsumo = totalConsumo;
		this.idReserva = idReserva;
		this.nombreServicio = nombreServicio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalConsumo() {
		return totalConsumo;
	}

	public void setTotalConsumo(Double totalConsumo) {
		this.totalConsumo = totalConsumo;
	}
	
	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	@Override
	public String toString() {
		return "Consumo [id=" + id + ", totalConsumo=" + totalConsumo + ", idReserva=" + idReserva + ", nombreServicio="
				+ nombreServicio + "]";
	}

	
	

}

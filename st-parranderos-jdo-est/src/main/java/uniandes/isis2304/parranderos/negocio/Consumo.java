package uniandes.isis2304.parranderos.negocio;

public class Consumo {
	
	private Long id;
	
	private Double totalConsumo;

	public Consumo(Long id, Double totalConsumo) {
		super();
		this.id = id;
		this.totalConsumo = totalConsumo;
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

	@Override
	public String toString() {
		return "Consumo [id=" + id + ", totalConsumo=" + totalConsumo + "]";
	}
	
	

}

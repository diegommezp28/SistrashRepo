package uniandes.isis2304.parranderos.negocio;

public class DescuentoServicio {

	private Long idServicio;
	
	private String nombrePlan;
	
	private Double porcentaje;

	public DescuentoServicio(Long idServicio, String nombrePlan, Double porcentaje) {
		this.idServicio = idServicio;
		this.nombrePlan = nombrePlan;
		this.porcentaje = porcentaje;
	}

	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "DescuentoServicio [idServicio=" + idServicio + ", nombrePlan=" + nombrePlan + ", porcentaje="
				+ porcentaje + "]";
	}
	
	
}

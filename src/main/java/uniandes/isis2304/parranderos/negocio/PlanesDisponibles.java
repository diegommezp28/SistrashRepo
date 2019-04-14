package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class PlanesDisponibles implements VOPlanesDisponibles {

	private String nombre;

	private String descripcion;

	private Double costoTotal;

	private Integer diasTotales;

	private Long idHotel;

	private Date fechaLimite;

	private String tipoPlan;

	public PlanesDisponibles(String nombre, String descripcion, Double costoTotal, Integer diasTotales, Long idHotel,
			Date fechaLimite, String tipoPlan) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoTotal = costoTotal;
		this.diasTotales = diasTotales;
		this.idHotel = idHotel;
		this.fechaLimite = fechaLimite;
		this.tipoPlan = tipoPlan;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(Double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public Integer getDiasTotales() {
		return diasTotales;
	}

	public void setDiasTotales(Integer diasTotales) {
		this.diasTotales = diasTotales;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public String getTipoPlan() {
		return tipoPlan;
	}

	public void setTipoPlan(String tipoPlan) {
		this.tipoPlan = tipoPlan;
	}

	@Override
	public String toString() {
		return "PlanesDisponibles [nombre=" + nombre + ", descripcion=" + descripcion + ", costoTotal=" + costoTotal
				+ ", diasTotales=" + diasTotales + ", idHotel=" + idHotel + ", fechaLimite=" + fechaLimite
				+ ", tipoPlan=" + tipoPlan + "]";
	}







}

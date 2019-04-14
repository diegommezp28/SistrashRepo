package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class Mantenimiento implements VOMantenimiento {
	
	private Long id;
	
	private Date fecha;
	
	private  String codigoHabitacion;
	
	private Long idServicio;
	
	private String tipoMantenimiento;

	

	public Mantenimiento(Long id, Date fecha, String codigoHabitacion, Long idServicio, String tipoMantenimiento) {
		this.id = id;
		this.fecha = fecha;
		this.codigoHabitacion = codigoHabitacion;
		this.idServicio = idServicio;
		this.tipoMantenimiento = tipoMantenimiento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}  

	public String getCodigoHabitacion() {
		return codigoHabitacion;
	}

	public void setCodigoHabitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
	}

	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public String getTipoMantenimiento() {
		return tipoMantenimiento;
	}

	public void setTipoMantenimiento(String tipoMantenimiento) {
		this.tipoMantenimiento = tipoMantenimiento;
	}

	@Override
	public String toString() {
		return "Mantenimiento [id=" + id + ", fecha=" + fecha + ", codigoHabitacion=" + codigoHabitacion
				+ ", idServicio=" + idServicio + ", tipoMantenimiento=" + tipoMantenimiento + "]";
	}
	
	

}

package uniandes.isis2304.parranderos.negocio;

import java.util.Date;


//TODO otros atributos de las tablas y constructor vacío
/**
 * @author Diego Gómez
 */
public class ReservaHabitacion implements VOReservaHabitacion {

	public Long id;
	
	private Date fechaLlegada;
	
	private Date fechaSalida;
	
	public ReservaHabitacion(Long id, Date fechaLlegada, Date fechaSalida, Integer numeroPersonas, String planPago) {
		super();
		this.id = id;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.numeroPersonas = numeroPersonas;
		this.planPago = planPago;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public void setNumeroPersonas(Integer numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public void setPlanPago(String planPago) {
		this.planPago = planPago;
	}

	private Integer numeroPersonas;
	
	private String planPago;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Date getFechaLlegada() {
		// TODO Auto-generated method stub
		return fechaLlegada;
	}

	@Override
	public Date getFechaSalida() {
		// TODO Auto-generated method stub
		return fechaSalida;
	}

	@Override
	public Integer getNumeroPersonas() {
		// TODO Auto-generated method stub
		return numeroPersonas;
	}

	@Override
	public String getPlanPago() {
		// TODO Auto-generated method stub
		return planPago;
	}

}

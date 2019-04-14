package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

/**
 * @author Diego Gómez
 */
public class Reserva implements VOReserva {

	public Long id;
	
	private Date fechaLlegada;
	
	private Date fechaSalida;
	
	private Integer numeroPersonas;
	
	private String planPago;
	
	public Double totalPago;
	
	public Integer checkIn;
	
	public Integer checkOut;
	
	public Long idCliente;
	
	public String codigoHabitacion;
	
	private Double valHabitacion;

	public Reserva() {
		super();
		this.id = 0L;
		this.fechaLlegada = new Date();
		this.fechaSalida = new Date();
		this.numeroPersonas = 0;
		this.planPago = "";
		this.totalPago = 0.0;
		this.checkIn = 0;
		this.checkOut = 0;
		this.idCliente = 0L;
		this.codigoHabitacion = "";
		this.valHabitacion = 0.0;
	}

	public Reserva(Long id, Date fechaLlegada, Date fechaSalida, Integer numeroPersonas, String planPago,
			Double totalPago, Integer checkIn, Integer checkOut, Long idCliente, String codigoHabitacion,
			Double valHabitacion) {
		this.id = id;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.numeroPersonas = numeroPersonas;
		this.planPago = planPago;
		this.totalPago = totalPago;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.idCliente = idCliente;
		this.codigoHabitacion = codigoHabitacion;
		this.valHabitacion = valHabitacion;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	public void setCheckIn(Integer checkIn) {
		this.checkIn = checkIn;
	}

	public void setCheckOut(Integer checkOut) {
		this.checkOut = checkOut;
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

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCodigoHabitacion() {
		return codigoHabitacion;
	}

	public void setCodigoHabitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
	}

	public Long getId() {
		return id;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public Integer getNumeroPersonas() {
		return numeroPersonas;
	}

	public String getPlanPago() {
		return planPago;
	}

	public Double getTotalPago() {
		return totalPago;
	}

	public Integer getCheckIn() {
		return checkIn;
	}

	public Integer getCheckOut() {
		return checkOut;
	}

	public Double getValHabitacion() {
		return valHabitacion;
	}

	public void setValHabitacion(Double valHabitacion) {
		this.valHabitacion = valHabitacion;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fechaLlegada=" + fechaLlegada + ", fechaSalida=" + fechaSalida
				+ ", numeroPersonas=" + numeroPersonas + ", planPago=" + planPago + ", totalPago=" + totalPago
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", idCliente=" + idCliente + ", codigoHabitacion="
				+ codigoHabitacion + ", valHabitacion=" + valHabitacion + "]";
	}

}

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
	
	public Integer documentoCliente;
	
	public String codigoHabitacion;

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
		this.documentoCliente = 0;
		this.codigoHabitacion = "";
	}

	public Reserva(Long id, Date fechaLlegada, Date fechaSalida, Integer numeroPersonas, String planPago,
			Double totalPago, Integer checkIn, Integer checkOut, Integer documentoCliente, String codigoHabitacion) {
		super();
		this.id = id;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.numeroPersonas = numeroPersonas;
		this.planPago = planPago;
		this.totalPago = totalPago;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.documentoCliente = documentoCliente;
		this.codigoHabitacion = codigoHabitacion;
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

	public Integer getDocumentoCliente() {
		return documentoCliente;
	}

	public void setDocumentoCliente(Integer documentoCliente) {
		this.documentoCliente = documentoCliente;
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

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fechaLlegada=" + fechaLlegada + ", fechaSalida=" + fechaSalida
				+ ", numeroPersonas=" + numeroPersonas + ", planPago=" + planPago + ", totalPago=" + totalPago
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", documentoCliente=" + documentoCliente
				+ ", codigoHabitacion=" + codigoHabitacion + "]";
	}

}

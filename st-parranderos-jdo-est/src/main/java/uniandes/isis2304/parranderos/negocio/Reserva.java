package uniandes.isis2304.parranderos.negocio;

import java.util.Date;


//TODO otros atributos de las tablas y constructor vacío
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
	
	public Reserva(Long id, Date fechaLlegada, Date fechaSalida, Integer numeroPersonas, String planPago,
			Double totalPago, Integer checkIn, Integer checkOut) {
		super();
		this.id = id;
		this.fechaLlegada = fechaLlegada;
		this.fechaSalida = fechaSalida;
		this.numeroPersonas = numeroPersonas;
		this.planPago = planPago;
		this.totalPago = totalPago;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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

	@Override
	public Double getTotalPago() {
		// TODO Auto-generated method stub
		return totalPago;
	}

	@Override
	public Integer getCheckIn() {
		// TODO Auto-generated method stub
		return checkIn;
	}

	@Override
	public Integer getCheckOut() {
		// TODO Auto-generated method stub
		return checkOut;
	}



	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fechaLlegada=" + fechaLlegada + ", fechaSalida=" + fechaSalida
				+ ", numeroPersonas=" + numeroPersonas + ", planPago=" + planPago + ", totalPago=" + totalPago
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}

}

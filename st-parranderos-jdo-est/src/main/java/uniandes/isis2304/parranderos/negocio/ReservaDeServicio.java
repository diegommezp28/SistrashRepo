package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class ReservaDeServicio implements VOReservaDeServicio {
	
	private Date Reserva;
	
	private Integer tiempoReserva;

	public ReservaDeServicio(Date reserva, Integer tiempoReserva) {
		super();
		Reserva = reserva;
		this.tiempoReserva = tiempoReserva;
	}

	public Date getReserva() {
		return Reserva;
	}

	public void setReserva(Date reserva) {
		Reserva = reserva;
	}

	public Integer getTiempoReserva() {
		return tiempoReserva;
	}

	public void setTiempoReserva(Integer tiempoReserva) {
		this.tiempoReserva = tiempoReserva;
	}

	@Override
	public String toString() {
		return "ReservaDeServicio [Reserva=" + Reserva + ", tiempoReserva=" + tiempoReserva + "]";
	}

}

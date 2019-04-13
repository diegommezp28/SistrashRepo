package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class ReservaDeServicio implements VOReservaDeServicio {

	private Date reserva;

	private Integer tiempoReserva;

	private String nombreServicio;

	private Long idReserva;


	public ReservaDeServicio() {
		super();
		reserva = new Date();
		tiempoReserva = 0;
		nombreServicio = "";
		idReserva = 0L;
	}

	public ReservaDeServicio(Date reserva, Integer tiempoReserva, String nombreServicio, Long idReserva) {
		super();
		reserva = reserva;
		this.tiempoReserva = tiempoReserva;
		this.nombreServicio = nombreServicio;
		this.idReserva = idReserva;
	}

	public Date getReserva() {
		return reserva;
	}

	public void setReserva(Date reserva) {
		reserva = reserva;
	}

	public Integer getTiempoReserva() {
		return tiempoReserva;
	}

	public void setTiempoReserva(Integer tiempoReserva) {
		this.tiempoReserva = tiempoReserva;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	@Override
	public String toString() {
		return "ReservaDeServicio [reserva=" + reserva + ", tiempoReserva=" + tiempoReserva + ", nombreServicio="
				+ nombreServicio + ", idReserva=" + idReserva + "]";
	}

}

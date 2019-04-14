package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class ReservaDeServicio implements VOReservaDeServicio {
	
	private Long id;

	private Date reserva;

	private Integer tiempoReserva;

	private Long idServicio;

	private Long idReserva;


	public ReservaDeServicio() {
		super();
		reserva = new Date();
		tiempoReserva = 0;
		idServicio = 0L;
		idReserva = 0L;
		id =0l;
	}

	public ReservaDeServicio(Long id, Date reserva, Integer tiempoReserva, Long idServicio, Long idReserva) {
		this.id = id;
		this.reserva = reserva;
		this.tiempoReserva = tiempoReserva;
		this.idServicio = idServicio;
		this.idReserva = idReserva;
	}



	public Date getReserva() {
		return reserva;
	}

	public void setReserva(Date reserva) {
		this.reserva = reserva;
	}

	public Integer getTiempoReserva() {
		return tiempoReserva;
	}

	public void setTiempoReserva(Integer tiempoReserva) {
		this.tiempoReserva = tiempoReserva;
	}

	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ReservaDeServicio [id=" + id + ", reserva=" + reserva + ", tiempoReserva=" + tiempoReserva
				+ ", idServicio=" + idServicio + ", idReserva=" + idReserva + "]";
	}

}

package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class Consumo implements VOConsumo{
	
	private Long id;
	
	private Double totalConsumo;
	
	private Long idReserva;
	
	private Long idServicio;    
	
	private Date fecha;



	public Consumo() {
		super();
		id = 0L;
		totalConsumo =0.0;
		idReserva = 0L;
		idServicio =0L;
		fecha = new Date();
		
	}

	public Consumo(Long id, Double totalConsumo, Long idReserva, Long idServicio, Date fecha) {
		this.id = id;
		this.totalConsumo = totalConsumo;
		this.idReserva = idReserva;
		this.idServicio = idServicio;
		this.fecha = fecha;
	}


	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalConsumo() {
		return totalConsumo;
	}

	public void setTotalConsumo(Double totalConsumo) {
		this.totalConsumo = totalConsumo;
	}
	
	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Consumo [id=" + id + ", totalConsumo=" + totalConsumo + ", idReserva=" + idReserva + ", idServicio="
				+ idServicio + ", fecha=" + fecha + "]";
	}

	
	

}

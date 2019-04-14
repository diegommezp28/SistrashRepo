package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public interface VOReserva {

	
	public Long getId();
	
	public Date getFechaLlegada();
	
	public Date getFechaSalida();
	
	public Integer getNumeroPersonas();
	
	public String getPlanPago();	
	
	public Double getTotalPago();
	
	public Integer getCheckIn();
	
	public Integer getCheckOut();
	
	public Long getIdCliente();
	
	public String getCodigoHabitacion();
	
	public Double getValHabitacion();
}

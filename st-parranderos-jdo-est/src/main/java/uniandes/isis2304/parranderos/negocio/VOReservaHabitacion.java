package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public interface VOReservaHabitacion {

	
	public Long getId();
	
	public Date getFechaLlegada();
	
	public Date getFechaSalida();
	
	public Integer getNumeroPersonas();
	
	public String getPlanPago();	
}

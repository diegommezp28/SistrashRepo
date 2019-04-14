package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public interface VOMantenimiento {
	
	public Long getId();
	
	public Date getFecha();
	
	public String getCodigoHabitacion();
	
	public Long getIdServicio();
	
	public String getTipoMantenimiento();
	
	

}

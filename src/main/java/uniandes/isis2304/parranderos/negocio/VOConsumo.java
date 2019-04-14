package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public interface VOConsumo {

	
	public Long getId();
	
	public Double getTotalConsumo();
	
	public Long getIdReserva();
	
	public Long getIdServicio();
	
	public Date getFecha();
}

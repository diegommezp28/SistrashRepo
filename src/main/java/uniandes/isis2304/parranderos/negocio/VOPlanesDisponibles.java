	package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public interface VOPlanesDisponibles {
	
	public String getNombre();
	
	public String getDescripcion();
	
	public Integer getDiasTotales();
	
	public Double getCostoTotal();
	
	public Long getIdHotel();
	
	public Date getFechaLimite();
	
	public String getTipoPlan();

}

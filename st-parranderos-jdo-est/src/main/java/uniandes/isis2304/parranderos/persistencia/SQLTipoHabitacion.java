package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Hotel;
import uniandes.isis2304.parranderos.negocio.TipoHabitacion;

public class SQLTipoHabitacion {
	/**
	 * Cadena que representa el tipo de consulta que se va a realizar en las sentencias de acceso a la base de datos
	 * Se renombra acá para facilitar la escritura de las sentencias
	 */
	private final static String SQL = PersistenciaHoteles.SQL;

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia general de la aplicación
	 */
	private PersistenciaHoteles pp;

	public SQLTipoHabitacion(PersistenciaHoteles pp) {
		this.pp = pp;
	}
	
	public List<TipoHabitacion> listarTiposHabitaciones(PersistenceManager pm){
		Query q = pm.newQuery(SQL, "SELECT * FROM TIPO_HABITACION");
		q.setResultClass(TipoHabitacion.class);
		return (List<TipoHabitacion>) q.executeList();
	}
}

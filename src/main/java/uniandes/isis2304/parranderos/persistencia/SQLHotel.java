package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Bebida;
import uniandes.isis2304.parranderos.negocio.Hotel;

public class SQLHotel {
	
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

	public SQLHotel(PersistenciaHoteles pp) {
		this.pp = pp;
	}
	
	public List<Hotel> listarHoteles(PersistenceManager pm){
		Query q = pm.newQuery(SQL, "SELECT * FROM HOTEL");
		q.setResultClass(Hotel.class);
		return (List<Hotel>) q.executeList();
	}

}

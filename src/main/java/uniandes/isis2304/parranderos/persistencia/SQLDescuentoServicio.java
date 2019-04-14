package uniandes.isis2304.parranderos.persistencia;

public class SQLDescuentoServicio {
	
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

	public SQLDescuentoServicio(PersistenciaHoteles pp) {
		this.pp = pp;
	}

}

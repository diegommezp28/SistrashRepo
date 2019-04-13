package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Reserva;

public class SQLReserva {
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

	public SQLReserva(PersistenciaHoteles pp) {
		this.pp = pp;
	}
	
	public void registrarReservaHabitacion(PersistenceManager pm, Reserva reserva) {
		System.out.println("entro");
        Query q = pm.newQuery(SQL, "INSERT INTO RESERVA" + " values (?, ?, ?, ?,?,?,?,?,?,?)");
        q.setParameters(reserva.getId().intValue(), new java.sql.Date(reserva.getFechaLlegada().getTime()),
        		new java.sql.Date(reserva.getFechaSalida().getTime()), reserva.getNumeroPersonas(), reserva.getPlanPago(),
        		reserva.getTotalPago(), reserva.getCheckIn(), reserva.getCheckOut(), reserva.getDocumentoCliente(),
        		reserva.getCodigoHabitacion());
        System.out.println(q.toString());
         q.execute();      
         System.out.println("ejecuto");
	}
	
	public List listarReservas(PersistenceManager pm) {
		Query q = pm.newQuery("SELECT * FROM RESERVA");
		return q.executeResultList();
	}
	
	public List reservaPorId(PersistenceManager pm, Long id) {
		Query q = pm.newQuery("SELECT * FROM RESERVA"
				+ "WHERE id = "+id.intValue());
		return q.executeList();
		
	}
	
	public Long eliminarPorDocumento(PersistenceManager pm, int documento) {
		Query q = pm.newQuery("DELETE * FROM RESERVA"
				+ "WHERE documento_cliente = "+documento);
		return (Long) q.executeUnique();
	}
	
	public Long eliminarPorId(PersistenceManager pm, Long id) {
		Query q = pm.newQuery("DELETE * FROM RESERVA"
				+ "WHERE id = "+id.intValue());
		return (Long) q.executeUnique();
	}
}

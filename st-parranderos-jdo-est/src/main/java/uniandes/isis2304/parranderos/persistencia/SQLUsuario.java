package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.TipoBebida;
import uniandes.isis2304.parranderos.negocio.Usuario;

public class SQLUsuario {
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

	public SQLUsuario(PersistenciaHoteles pp) {
		this.pp = pp;
	}
	
	public Boolean existeCedula(PersistenceManager pm, Integer cedula) throws Exception{
		Query q = pm.newQuery(SQL, "SELECT * FROM USUARIO" + " WHERE documento = ?");
		q.setResultClass(Usuario.class);
		q.setParameters(cedula);
		Usuario respuesta = (Usuario) q.executeUnique();
		if(respuesta != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean existeCedulaGerente(PersistenceManager pm, Integer cedula) throws Exception{
		Query q = pm.newQuery(SQL, "SELECT * FROM USUARIO" + " WHERE documento = ? AND nombre_rol_usuario = ?");
		q.setResultClass(Usuario.class);
		q.setParameters(cedula, "gerente");
		Usuario respuesta = (Usuario) q.executeUnique();
		if(respuesta != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean existeCedulaEmpleado(PersistenceManager pm, Integer cedula) throws Exception{
		Query q = pm.newQuery(SQL, "SELECT * FROM USUARIO" + " WHERE documento = ? AND nombre_rol_usuario = ?");
		q.setResultClass(Usuario.class);
		q.setParameters(cedula, "empleado");
		Usuario respuesta = (Usuario) q.executeUnique();
		if(respuesta != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean existeCedulaRecepcionista(PersistenceManager pm, Integer cedula) throws Exception{
		Query q = pm.newQuery(SQL, "SELECT * FROM USUARIO" + " WHERE documento = ? AND nombre_rol_usuario = ?");
		q.setResultClass(Usuario.class);
		q.setParameters(cedula, "recepcionista");
		Usuario respuesta = (Usuario) q.executeUnique();
		if(respuesta != null) {
			return true;
		}
		else {
			return false;
		}
	}
		
		public Boolean existeCedulaAdminDatos(PersistenceManager pm, Integer cedula) throws Exception{
			Query q = pm.newQuery(SQL, "SELECT * FROM USUARIO" + " WHERE documento = ? AND nombre_rol_usuario = ?");
			q.setResultClass(Usuario.class);
			q.setParameters(cedula, "administrador de datos");
			Usuario respuesta = (Usuario) q.executeUnique();
			if(respuesta != null) {
				return true;
			}
			else {
				return false;
			}
		}
	
	/**
	 * Crea y ejecuta la sentencia SQL para adicionar una BEBIDA a la base de datos de Parranderos
	 * @param pm - El manejador de persistencia
	 * @param idBebida - El identificador de la bebida
	 * @param nombre - El nombre de la bebida
	 * @param idTipoBebida - El identificador del tipo de bebida de la bebida
	 * @param gradoAlcohol - El grado de alcohol de la bebida (Mayor que 0)
	 * @return EL número de tuplas insertadas
	 */
	public Long agregarUsuario (PersistenceManager pm, Usuario usuario) 
	{
		try {
        Query q = pm.newQuery(SQL, "INSERT INTO USUARIO" + "(documento, tipo_documento, nombre	, correo, nombre_rol_usuario, nombre_hotel) values (?, ?, ?, ?,?,?)");
        q.setParameters(usuario.getNumDocumento(), usuario.getTipoDocumento(), usuario.getNombre(),usuario.getCorreo() ,usuario.getNombreRolUsuario(), usuario.getNombreHotel());
        return (Long) q.executeUnique();            
		}
		catch(Exception e) {
			return 0L;
		}
	}
	
}

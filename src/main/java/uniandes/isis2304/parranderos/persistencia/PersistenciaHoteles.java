package uniandes.isis2304.parranderos.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import uniandes.isis2304.parranderos.negocio.Bebida;
import uniandes.isis2304.parranderos.negocio.Hotel;
import uniandes.isis2304.parranderos.negocio.Reserva;
import uniandes.isis2304.parranderos.negocio.TipoHabitacion;
import uniandes.isis2304.parranderos.negocio.Usuario;

public class PersistenciaHoteles {

	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	private static PersistenciaHoteles instance;

	/**
	 * Fábrica de Manejadores de persistencia, para el manejo correcto de las transacciones
	 */
	private PersistenceManagerFactory pmf;

	/**
	 * Arreglo de cadenas con los nombres de las tablas de la base de datos, en su orden:
	 * Secuenciador, tipoBebida, bebida, bar, bebedor, gustan, sirven y visitan
	 */
	private List <String> tablas;

	private SQLAcompaniante sqlAcompaniante;

	private SQLConsumo sqlConsumo;

	private SQLDescuento sqlDescuento;

	private SQLHabitacion sqlHabitacion;

	private SQLPlanesDisponibles sqlPlanesDisponibles;

	private SQLProducto sqlProducto;

	private SQLProductosConsumidos sqlProductosConsumidos;

	private SQLReserva sqlReserva;

	private SQLReservaDeServicio sqlReservaDeServicio;

	private SQLRolUsuario sqlRolUsuario;

	private SQLServicio sqlServicio;

	private SQLTieneUtensilio sqlTieneUtensilio;

	private SQLTipoHabitacion sqlTipoHabitacion;

	private SQLTipoServicio sqlTipoServicio;

	private SQLUsuario sqlUsuario;

	private SQLUtensilio sqlUtensilio;

	private SQLHotel sqlHotel;

	private SQLHoteles sqlHoteles;

	private SQLFactura sqlFactura;
	
	private SQLDescuentoServicio sqlDescuentoServicio;
	
	private SQLMantenimiento sqlMantenimiento;

	private PersistenciaHoteles() {
		pmf = JDOHelper.getPersistenceManagerFactory("Hoteles");		
		crearClasesSQL();

		tablas = new LinkedList<String> ();

		tablas.add("HOTELES_SEQUENCE");
		tablas.add ("HOTEL");
		tablas.add ("DESCUENTO");
		tablas.add ("PRODUCTO");
		tablas.add ("CONSUMO");
		tablas.add ("TIENE_UTENSILIO ");
		tablas.add ("UTENSILIO");
		tablas.add ("RESERVA");
		tablas.add ("SERVICIO ");
		tablas.add ("RESERVA_DE_SERVICIO");
		tablas.add ("TIPO_SERVICIO");
		tablas.add ("PLANES_DISPONIBLES");
		tablas.add ("ACOMPANIANTE");
		tablas.add ("TIPO_HABITACION");
		tablas.add ("HABITACION");
		tablas.add ("USUARIO");
		tablas.add ("ROL_USUARIO");
		tablas.add ("PRODUCTOS_CONSUMIDOS");
		tablas.add("FACTURA");
		tablas.add("DESCUENTO_SERVICIO");
		tablas.add("MANTENIMIENTO");

	}
	
	/**
	 * Constructor privado, que recibe los nombres de las tablas en un objeto Json - Patrón SINGLETON
	 * @param tableConfig - Objeto Json que contiene los nombres de las tablas y de la unidad de persistencia a manejar
	 */
	private PersistenciaHoteles (JsonObject tableConfig)
	{
		crearClasesSQL ();
		tablas = leerNombresTablas (tableConfig);
		
		String unidadPersistencia = tableConfig.get ("unidadPersistencia").getAsString ();
		pmf = JDOHelper.getPersistenceManagerFactory (unidadPersistencia);
	}

	/**
	 * Crea los atributos de clases de apoyo SQL
	 */
	private void crearClasesSQL ()
	{
		sqlAcompaniante = new SQLAcompaniante(this);

		sqlConsumo = new SQLConsumo(this);

		sqlDescuento = new SQLDescuento(this);

		sqlHabitacion = new SQLHabitacion(this);

		sqlPlanesDisponibles = new SQLPlanesDisponibles(this);

		sqlProducto = new SQLProducto(this);

		sqlProductosConsumidos = new SQLProductosConsumidos(this);

		sqlReserva = new SQLReserva(this);

		sqlReservaDeServicio = new SQLReservaDeServicio(this);

		sqlRolUsuario = new SQLRolUsuario(this);

		sqlServicio = new SQLServicio(this);

		sqlTieneUtensilio = new SQLTieneUtensilio(this);

		sqlTipoHabitacion = new SQLTipoHabitacion(this);

		sqlTipoServicio = new SQLTipoServicio(this);

		sqlUsuario = new SQLUsuario(this);

		sqlUtensilio = new SQLUtensilio(this);

		sqlHotel = new SQLHotel(this);
		
		sqlHoteles = new SQLHoteles(this);
		
		sqlFactura = new SQLFactura(this);
		
		sqlDescuentoServicio = new SQLDescuentoServicio(this);
		
		sqlMantenimiento = new SQLMantenimiento(this);
		
		
	}

	/**
	 * Cierra la conexión con la base de datos
	 */
	public void cerrarUnidadPersistencia ()
	{
		pmf.close ();
		instance = null;
	}
	
	/**
	 * Genera una lista con los nombres de las tablas de la base de datos
	 * @param tableConfig - El objeto Json con los nombres de las tablas
	 * @return La lista con los nombres del secuenciador y de las tablas
	 */
	private List <String> leerNombresTablas (JsonObject tableConfig)
	{
		JsonArray nombres = tableConfig.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <String> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}
		
		return resp;
	}
	
	public static PersistenciaHoteles getInstance(JsonObject tableConfig) {
		if(instance==null) {
			instance = new PersistenciaHoteles(tableConfig);
		}
		return instance;
	}
	
	public static PersistenciaHoteles getInstance() {
		if(instance==null) {
			instance = new PersistenciaHoteles();
		}
		return instance;
	}

	public Boolean existeCedulaUsuario(Integer documento)  {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			return sqlUsuario.existeCedula(pm, documento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return true;
		}
	}
	
	public Boolean existeCedulaGerente(Integer documento)  {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			return sqlUsuario.existeCedulaGerente(pm, documento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return true;
		}
	}
	
	public Boolean existeCedulaEmpleado(Integer documento)  {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			return sqlUsuario.existeCedulaEmpleado(pm, documento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return true;
		}
	}
	
	public Boolean existeCedulaRecepcionista(Integer documento)  {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			return sqlUsuario.existeCedulaRecepcionista(pm, documento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return true;
		}
	}
	
	public Boolean existeCedulaAdminDatos(Integer documento)  {
		PersistenceManager pm = pmf.getPersistenceManager();
		try {
			return sqlUsuario.existeCedulaAdminDatos(pm, documento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return true;
		}
	}
	
	public Long agregarUsuario(Usuario usuario) {
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlUsuario.agregarUsuario(pm, usuario);
	}
	
	public Boolean disponibilidadHabitaciones(java.sql.Date llegada, java.sql.Date salida, String nombreHotel, String tipoHabitacion) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Query q = pm.newQuery(SQL, 
				"SELECT HABITACION.codigo"
				+ " FROM HABITACION LEFT JOIN RESERVA "
				+ "ON HABITACION.codigo = RESERVA.codigo_habitacion"
				+ " WHERE RESERVA.fecha_llegada NOT BETWEEN '"+ llegada +"' AND '"+salida+"'");
		List lista = q.executeList();
		System.out.println(lista);
		if(!lista.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void registrarReserva(Reserva reserva) {
		PersistenceManager pm = pmf.getPersistenceManager();
		sqlReserva.registrarReservaHabitacion(pm, reserva);
	}
	
	public List<Hotel> listarHoteles(){
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlHotel.listarHoteles(pm);
	}
	
	public List<TipoHabitacion> listarTiposHabitaciones(){
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlTipoHabitacion.listarTiposHabitaciones(pm);
	}
	
	public List listarReservas() {
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlReserva.listarReservas(pm);
	}
	
	public List reservasPorId(Long id) {
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlReserva.reservaPorId(pm, id);
	}
	
	public Long eliminarReservaPorId(Long id) {
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlReserva.eliminarPorId(pm, id);
	}
	
	public Long eliminarReservaPorDocumento(int documento) {
		PersistenceManager pm = pmf.getPersistenceManager();
		return sqlReserva.eliminarPorDocumento(pm, documento);
	}

}

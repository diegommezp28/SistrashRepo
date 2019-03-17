package uniandes.isis2304.parranderos.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

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

	private SQLAcompanianteReserva sqlAcompanianteReserva;

	private SQLConsumo sqlConsumo;

	private SQLDescuento sqlDescuento;

	private SQLHabitacion sqlHabitacion;

	private SQLHabitacionHotel sqlHabitacionHotel;

	private SQLPlanesDisponibles sqlPlanesDisponibles;

	private SQLProducto sqlProducto;

	private SQLProductosConsumidos sqlProductosConsumidos;

	private SQLReserva sqlReserva;

	private SQLReservaDeServicio sqlReservaDeServicio;

	private SQLRolUsuario sqlRolUsuario;

	private SQLServicio sqlServicio;

	private SQLServicioTipoServicio sqlServicioTipoServicio;

	private SQLTieneUtensilio sqlTieneUtensilio;

	private SQLTipoHabitacion sqlTipoHabitacion;

	private SQLTipoHabitacionHotel sqlTipoHabitacionHotel;

	private SQLTipoServicio sqlTipoServicio;

	private SQLUsuario sqlUsuario;

	private SQLUtensilio sqlUtensilio;

	private SQLHotel sqlHotel;

	private PersistenciaHoteles() {
		pmf = JDOHelper.getPersistenceManagerFactory("Hoteles");		
		crearClasesSQL();

		tablas = new LinkedList<String> ();

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
		tablas.add ("HABITACION_HOTEL");
		tablas.add ("ACOMPANIANTE_RESERVA");
		tablas.add ("PRODUCTOS_CONSUMIDOS");
		tablas.add ("SERVICIO_TIPO_SERVICIO");
		tablas.add ("TIPO_HABITACION_HOTEL");

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

		sqlAcompanianteReserva = new SQLAcompanianteReserva(this);

		sqlConsumo = new SQLConsumo(this);

		sqlDescuento = new SQLDescuento(this);

		sqlHabitacion = new SQLHabitacion(this);

		sqlHabitacionHotel = new SQLHabitacionHotel(this);

		sqlPlanesDisponibles = new SQLPlanesDisponibles(this);

		sqlProducto = new SQLProducto(this);

		sqlProductosConsumidos = new SQLProductosConsumidos(this);

		sqlReserva = new SQLReserva(this);

		sqlReservaDeServicio = new SQLReservaDeServicio(this);

		sqlRolUsuario = new SQLRolUsuario(this);

		sqlServicio = new SQLServicio(this);

		sqlServicioTipoServicio = new SQLServicioTipoServicio(this);

		sqlTieneUtensilio = new SQLTieneUtensilio(this);

		sqlTipoHabitacion = new SQLTipoHabitacion(this);

		sqlTipoHabitacionHotel = new SQLTipoHabitacionHotel(this);

		sqlTipoServicio = new SQLTipoServicio(this);

		sqlUsuario = new SQLUsuario(this);

		sqlUtensilio = new SQLUtensilio(this);

		sqlHotel = new SQLHotel(this);
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


}

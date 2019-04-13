package uniandes.isis2304.interfazHoteles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jdo.JDODataStoreException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import uniandes.isis2304.parranderos.interfazApp.InterfazParranderosApp;
import uniandes.isis2304.parranderos.interfazApp.PanelDatos;
import uniandes.isis2304.parranderos.negocio.Hoteles;
import uniandes.isis2304.parranderos.negocio.Reserva;
import uniandes.isis2304.parranderos.negocio.TipoUsuarioActual;
import uniandes.isis2304.parranderos.negocio.Usuario;
import uniandes.isis2304.parranderos.negocio.VOBebedor;
import uniandes.isis2304.parranderos.negocio.Hotel;

public class InterfazHoteles extends JFrame implements ActionListener{

	private static final String CONFIG_INTERFAZ = "./src/main/resources/config/interfaceHotelesConfig.json"; 

	private static final String CONFIG_TABLAS = "./src/main/resources/config/TablasHoteles.json"; 

	/**
	 * Objeto JSON con los nombres de las tablas de la base de datos que se quieren utilizar
	 */
	private JsonObject tableConfig;

	private Hoteles hoteles;

	/**
	 * Objeto JSON con la configuración de interfaz de la app.
	 */
	private JsonObject guiConfig;

	/**
	 * Panel de despliegue de interacción para los requerimientos
	 */
	private PanelDatos panelDatos;

	/**
	 * Menú de la aplicación
	 */
	private JMenuBar menuBar;

	private TipoUsuarioActual tipoUsuarioActual = null;

	private SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

	private Integer contadorId;

	/**
	 * Construye la ventana principal de la aplicación. <br>
	 * <b>post:</b> Todos los componentes de la interfaz fueron inicializados.
	 */
	public InterfazHoteles( )
	{
		contadorId =88871888;
		// Carga la configuración de la interfaz desde un archivo JSON
		guiConfig = openConfig ("Interfaz", CONFIG_INTERFAZ);

		// Configura la apariencia del frame que contiene la interfaz gráfica
		configurarFrame ( );
		if (guiConfig != null) 	   
		{
			crearMenu( guiConfig.getAsJsonArray("menuBar") );
		}

		tableConfig = openConfig ("Tablas BD", CONFIG_TABLAS);
		hoteles = new Hoteles (tableConfig);

		String path = guiConfig.get("bannerPath").getAsString();
		panelDatos = new PanelDatos ( );

		setLayout (new BorderLayout());
		add (new JLabel (new ImageIcon (path)), BorderLayout.NORTH );          
		add( panelDatos, BorderLayout.CENTER );        
	}

	/* ****************************************************************
	 * 			Métodos de configuración de la interfaz
	 *****************************************************************/
	/**
	 * Lee datos de configuración para la aplicació, a partir de un archivo JSON o con valores por defecto si hay errores.
	 * @param tipo - El tipo de configuración deseada
	 * @param archConfig - Archivo Json que contiene la configuración
	 * @return Un objeto JSON con la configuración del tipo especificado
	 * 			NULL si hay un error en el archivo.
	 */
	private JsonObject openConfig (String tipo, String archConfig)
	{
		JsonObject config = null;
		try 
		{
			Gson gson = new Gson( );
			FileReader file = new FileReader (archConfig);
			JsonReader reader = new JsonReader ( file );
			config = gson.fromJson(reader, JsonObject.class);
			//log.info ("Se encontró un archivo de configuración válido: " + tipo);
		} 
		catch (Exception e)
		{
			//			e.printStackTrace ();
			//log.info ("NO se encontró un archivo de configuración válido");			
			JOptionPane.showMessageDialog(null, "No se encontró un archivo de configuración de interfaz válido: " + tipo, "Parranderos App", JOptionPane.ERROR_MESSAGE);
		}	
		return config;
	}

	/**
	 * Método para configurar el frame principal de la aplicación
	 */
	private void configurarFrame(  )
	{
		int alto = 0;
		int ancho = 0;
		String titulo = "";	

		if ( guiConfig == null )
		{
			//log.info ( "Se aplica configuración por defecto" );			
			titulo = "Parranderos APP Default";
			alto = 300;
			ancho = 500;
		}
		else
		{
			//log.info ( "Se aplica configuración indicada en el archivo de configuración" );
			titulo = guiConfig.get("title").getAsString();
			alto= guiConfig.get("frameH").getAsInt();
			ancho = guiConfig.get("frameW").getAsInt();
		}

		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocation (50,50);
		setResizable( true );
		setBackground( Color.WHITE );

		setTitle( titulo );
		setSize ( ancho, alto);        
	}

	/**
	 * Método para crear el menú de la aplicación con base em el objeto JSON leído
	 * Genera una barra de menú y los menús con sus respectivas opciones
	 * @param jsonMenu - Arreglo Json con los menùs deseados
	 */
	private void crearMenu(  JsonArray jsonMenu )
	{    	
		// Creación de la barra de menús
		menuBar = new JMenuBar();       
		for (JsonElement men : jsonMenu)
		{
			// Creación de cada uno de los menús
			JsonObject jom = men.getAsJsonObject(); 

			String menuTitle = jom.get("menuTitle").getAsString();        	
			JsonArray opciones = jom.getAsJsonArray("options");

			JMenu menu = new JMenu( menuTitle);

			for (JsonElement op : opciones)
			{       	
				// Creación de cada una de las opciones del menú
				JsonObject jo = op.getAsJsonObject(); 
				String lb =   jo.get("label").getAsString();
				String event = jo.get("event").getAsString();

				JMenuItem mItem = new JMenuItem( lb );
				mItem.addActionListener( this );
				mItem.setActionCommand(event);

				menu.add(mItem);
			}       
			menuBar.add( menu );
		}        
		setJMenuBar ( menuBar );	
	}

	/**
	 * Genera una cadena para indicar al usuario que hubo un error en la aplicación
	 * @param e - La excepción generada
	 * @return La cadena con la información de la excepción y detalles adicionales
	 */
	private String generarMensajeError(Exception e) 
	{
		String resultado = "************ Error en la ejecución\n";
		resultado += e.getLocalizedMessage() + ", " + darDetalleException(e);
		resultado += "\n\nRevise datanucleus.log y parranderos.log para más detalles";
		return resultado;
	}

	/**
	 * Genera una cadena de caracteres con la descripción de la excepcion e, haciendo énfasis en las excepcionsde JDO
	 * @param e - La excepción recibida
	 * @return La descripción de la excepción, cuando es javax.jdo.JDODataStoreException, "" de lo contrario
	 */
	private String darDetalleException(Exception e) 
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}

	/* ****************************************************************
	 * 			Métodos de la Interacción
	 *****************************************************************/
	/**
	 * Método para la ejecución de los eventos que enlazan el menú con los métodos de negocio
	 * Invoca al método correspondiente según el evento recibido
	 * @param pEvento - El evento del usuario
	 */
	@Override
	public void actionPerformed(ActionEvent pEvento)
	{
		String evento = pEvento.getActionCommand( );		
		try 
		{
			Method req = InterfazHoteles.class.getMethod ( evento );			
			req.invoke ( this );
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}

	/**
	 * Este método ejecuta la aplicación, creando una nueva interfaz
	 * @param args Arreglo de argumentos que se recibe por línea de comandos
	 */
	public static void main( String[] args )
	{
		try
		{

			// Unifica la interfaz para Mac y para Windows.
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
			InterfazHoteles interfaz = new InterfazHoteles( );
			interfaz.setVisible( true );
		}
		catch( Exception e )
		{
			e.printStackTrace( );
		}
	}

	public void seleccionarCliente() {
		Integer result = JOptionPane.showConfirmDialog(null, "Confirme para registrar nuevo cliente. Si quiere usar uno existente deniegue.",null, JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del nuevo Cliente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(hoteles.existeCedulaUsuario(cedula)) {
					String resultado = "Ya existe un usuario con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					String nombre = JOptionPane.showInputDialog (this, "Nombre del nuevo Cliente", "Nombre", JOptionPane.QUESTION_MESSAGE);
					System.out.println(nombre + cedula);
					String correo = JOptionPane.showInputDialog (this, "Correo del nuevo Cliente", "Correo", JOptionPane.QUESTION_MESSAGE);
					String tipoDocumento = "CC";
					String rolUsuario = "cliente";
					String nombreHotel = "hotelDePrueba";
					tipoUsuarioActual = TipoUsuarioActual.CLIENTE;
					tipoUsuarioActual.setDocumento(cedula);
					Usuario nuevoUsuario = new Usuario(tipoDocumento, cedula, nombre, correo, rolUsuario, nombreHotel);
					Long numAgregados = hoteles.agregarUsuario(nuevoUsuario);
					String resultado = "Se agreegaron "+numAgregados + "usuarios";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}

		}
		else {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del Cliente existente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(!hoteles.existeCedulaUsuario(cedula)) {
					String resultado = "No existe un usuario con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {

					tipoUsuarioActual = TipoUsuarioActual.CLIENTE;
					tipoUsuarioActual.setDocumento(cedula);
					String resultado = "Se seleccionó el usuario con la cédula mencionada";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}
		}

	}

	public void seleccionarRecepcionista() {
		Integer result = JOptionPane.showConfirmDialog(null, "Confirme para registrar nuevo Recepcionista. Si quiere usar uno existente deniegue.",null, JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del nuevo Recepcionista", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(hoteles.existeCedulaUsuario(cedula)) {
					String resultado = "Ya existe un usuario con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					String nombre = JOptionPane.showInputDialog (this, "Nombre del nuevo Recepcionista", "Nombre", JOptionPane.QUESTION_MESSAGE);
					System.out.println(nombre + cedula);
					String correo = JOptionPane.showInputDialog (this, "Correo del nuevo rcepcionista", "Correo", JOptionPane.QUESTION_MESSAGE);
					String tipoDocumento = "CC";
					String rolUsuario = "recepcionista";
					String nombreHotel = "hotelDePrueba";
					tipoUsuarioActual = TipoUsuarioActual.RECEPCIONISTA;
					tipoUsuarioActual.setDocumento(cedula);
					Usuario nuevoUsuario = new Usuario(tipoDocumento, cedula, nombre, correo, rolUsuario, nombreHotel);
					Long numAgregados = hoteles.agregarUsuario(nuevoUsuario);
					String resultado = "Se agreegaron "+numAgregados + "recepcionistas";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}

		}
		else {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del Recepcionista existente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(!hoteles.existeCedulaRecepcionista(cedula)) {
					String resultado = "No existe un Recepcionista con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					tipoUsuarioActual = TipoUsuarioActual.RECEPCIONISTA;
					tipoUsuarioActual.setDocumento(cedula);
					String resultado = "Se seleccionó el Recepcionista con la cédula mencionada";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}
		}

	}

	public void seleccionarGerente() {
		Integer result = JOptionPane.showConfirmDialog(null, "Confirme para registrar nuevo Gerente. Si quiere usar uno existente deniegue.",null, JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del nuevo Gerente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(hoteles.existeCedulaUsuario(cedula)) {
					String resultado = "Ya existe un Gerente con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					String nombre = JOptionPane.showInputDialog (this, "Nombre del nuevo Gerente", "Nombre", JOptionPane.QUESTION_MESSAGE);
					System.out.println(nombre + cedula);
					String correo = JOptionPane.showInputDialog (this, "Correo del nuevo Gerente", "Correo", JOptionPane.QUESTION_MESSAGE);
					String tipoDocumento = "CC";
					String rolUsuario = "gerente";
					String nombreHotel = "hotelDePrueba";
					tipoUsuarioActual = TipoUsuarioActual.GERENTE;
					tipoUsuarioActual.setDocumento(cedula);
					Usuario nuevoUsuario = new Usuario(tipoDocumento, cedula, nombre, correo, rolUsuario, nombreHotel);
					Long numAgregados = hoteles.agregarUsuario(nuevoUsuario);
					String resultado = "Se agreegaron "+numAgregados + "Gerente";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}

		}
		else {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del Gerente existente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(!hoteles.existeCedulaGerente(cedula)) {
					String resultado = "No existe un Gerente con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					tipoUsuarioActual = TipoUsuarioActual.GERENTE;
					tipoUsuarioActual.setDocumento(cedula);
					String resultado = "Se seleccionó el Gerente con la cédula mencionada";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}
		}

	}

	public void seleccionarEmpleado() {
		Integer result = JOptionPane.showConfirmDialog(null, "Confirme para registrar nuevo Empleado. Si quiere usar uno existente deniegue.",null, JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del nuevo Empleado", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(hoteles.existeCedulaUsuario(cedula)) {
					String resultado = "Ya existe un empleado con esta documento, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					String nombre = JOptionPane.showInputDialog (this, "Nombre del nuevo Empleado", "Nombre", JOptionPane.QUESTION_MESSAGE);
					System.out.println(nombre + cedula);
					String correo = JOptionPane.showInputDialog (this, "Correo del nuevo Empleado", "Correo", JOptionPane.QUESTION_MESSAGE);
					String tipoDocumento = "CC";
					String rolUsuario = "empleado";
					String nombreHotel = "hotelDePrueba";
					tipoUsuarioActual = TipoUsuarioActual.EMPLEADO;
					tipoUsuarioActual.setDocumento(cedula);
					Usuario nuevoUsuario = new Usuario(tipoDocumento, cedula, nombre, correo, rolUsuario, nombreHotel);
					Long numAgregados = hoteles.agregarUsuario(nuevoUsuario);
					String resultado = "Se agreegaron "+numAgregados + "Empleado";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}

		}
		else {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del Empleado existente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(!hoteles.existeCedulaEmpleado(cedula)) {
					String resultado = "No existe un Empleado con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					tipoUsuarioActual = TipoUsuarioActual.EMPLEADO;
					tipoUsuarioActual.setDocumento(cedula);
					String resultado = "Se seleccionó el Empleado con la cédula mencionada";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}
		}

	}

	public void seleccionarAdminDatos() {
		Integer result = JOptionPane.showConfirmDialog(null, "Confirme para registrar nuevo AdminDatos. Si quiere usar uno existente deniegue.",null, JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.YES_OPTION) {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del nuevo AdminDatos", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(hoteles.existeCedulaUsuario(cedula)) {
					String resultado = "Ya existe un AdminDatos con esta documento, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					String nombre = JOptionPane.showInputDialog (this, "Nombre del nuevo AdminDatos", "Nombre", JOptionPane.QUESTION_MESSAGE);
					System.out.println(nombre + cedula);
					String correo = JOptionPane.showInputDialog (this, "Correo del nuevo AdminDatos", "Correo", JOptionPane.QUESTION_MESSAGE);
					String tipoDocumento = "CC";
					String rolUsuario = "administrador de datos";
					String nombreHotel = "hotelDePrueba";
					tipoUsuarioActual = TipoUsuarioActual.ADMINISTRADORDEDATOS;
					tipoUsuarioActual.setDocumento(cedula);
					Usuario nuevoUsuario = new Usuario(tipoDocumento, cedula, nombre, correo, rolUsuario, nombreHotel);
					Long numAgregados = hoteles.agregarUsuario(nuevoUsuario);
					String resultado = "Se agreegaron "+numAgregados + "AdminDatos";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}

		}
		else {
			String cedulaString = JOptionPane.showInputDialog (this, "Cédula del AdminDatos existente", "Cédula", JOptionPane.QUESTION_MESSAGE);
			Integer cedula = Integer.valueOf(cedulaString);
			try {
				if(!hoteles.existeCedulaAdminDatos(cedula)) {
					String resultado = "No existe un AdminDatos con esta cédula, intente de nuevo";
					panelDatos.actualizarInterfaz(resultado);
				}
				else {
					tipoUsuarioActual = TipoUsuarioActual.ADMINISTRADORDEDATOS;
					tipoUsuarioActual.setDocumento(cedula);
					String resultado = "Se seleccionó el AdminDatos con la cédula mencionada";
					panelDatos.actualizarInterfaz(resultado);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				String resultado = generarMensajeError(e);
				panelDatos.actualizarInterfaz(resultado);
			}
		}

	}

	/**
	 * @throws ParseException
	 */
	public void registrarReservaAlojamiento() throws ParseException {


		try 

		{
			// Ejecución de la demo y recolección de los resultados
			// ATENCIÓN: En una aplicación real, los datos JAMÁS están en el código
			Reserva rsrv1 = new Reserva(13333L, format.parse("2019-01-01"),format.parse("2019-01-08"), 1, "Todo incluido", 0.0, 0, 0, 1007126816, "301" );
			Reserva rsrv2 = new Reserva(13334L, format.parse("2019-01-01"),format.parse("2019-01-08"), 1, "Todo incluido", 0.0, 0, 0, 1007126816, "302" );
			Reserva rsrv3 = new Reserva(13335L, format.parse("2019-02-01"),format.parse("2019-02-08"), 1, "Todo incluido", 0.0, 0, 0, 30775201, "301" );
			System.out.println(-1);
			hoteles.registrarReserva(rsrv1);
			hoteles.registrarReserva(rsrv2);
			hoteles.registrarReserva(rsrv3);
			System.out.println(0);
			List reservas = hoteles.listarReservas();
			System.out.println(1);
			System.out.println(reservas);

			List reser1Id = hoteles.reservaPorId(13333L);
			List reser2Id = hoteles.reservaPorId(13334L);
			List reser3Id = hoteles.reservaPorId(13335L);

			Long doc1Eliminados = hoteles.eliminarReservaPorDocumento(1007126816);
			Long doc2Eliminados = hoteles.eliminarReservaPorDocumento(30775201);

			// Generación de la cadena de caracteres con la traza de la ejecución de la demo
			String resultado = "Demo de creación y listado de Bebedores\n\n";
			resultado += "\n\n************ Generando datos de prueba ************ \n";
			resultado += "\n" + reservas;
			resultado += "\n\n************ Ejecutando la demo ************ \n";			
			resultado += "\n\n************ Limpiando la base de datos ************ \n";
			resultado += doc1Eliminados + "reservas con documetno 1 eliminadas\n";
			resultado += doc2Eliminados + " reservas con documento 2 eliminadas\n";
			resultado += "\n Demo terminada";

			panelDatos.actualizarInterfaz(resultado);
		} 
		catch (Exception e) 
		{
			//			e.printStackTrace();
			String resultado = generarMensajeError(e);
			panelDatos.actualizarInterfaz(resultado);



		}
	}
}

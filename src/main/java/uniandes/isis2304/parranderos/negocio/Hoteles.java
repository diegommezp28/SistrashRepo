package uniandes.isis2304.parranderos.negocio;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.google.gson.JsonObject;

import uniandes.isis2304.parranderos.persistencia.PersistenciaHoteles;

public class Hoteles {

	
	/**
	 * El manejador de persistencia
	 */
	private PersistenciaHoteles pp;
	
	public Hoteles() {
		pp = PersistenciaHoteles.getInstance();
		
	}
	
	public Hoteles(JsonObject tableConfig) {
		pp = PersistenciaHoteles.getInstance(tableConfig);
		
	}
	
	/**
	 * Cierra la conexión con la base de datos (Unidad de persistencia)
	 */
	public void cerrarUnidadPersistencia ()
	{
		pp.cerrarUnidadPersistencia ();
	}
	
	public Boolean existeCedulaGerente(Integer cedula) throws Exception {
		return pp.existeCedulaGerente(cedula);
	}
	
	public Boolean existeCedulaRecepcionista(Integer cedula) throws Exception {
		return pp.existeCedulaRecepcionista(cedula);
	}
	public Boolean existeCedulaEmpleado(Integer cedula) throws Exception {
		return pp.existeCedulaEmpleado(cedula);
	}
	public Boolean existeCedulaAdminDatos(Integer cedula) throws Exception {
		return pp.existeCedulaAdminDatos(cedula);
	}
	public Boolean existeCedulaUsuario(Integer cedula) throws Exception {
		return pp.existeCedulaUsuario(cedula);
	}
	
	public Long agregarUsuario(Usuario usuario) {
		return pp.agregarUsuario(usuario);
	}
	
	public Boolean disponibilidadHabitaciones(java.sql.Date llegada, java.sql.Date salida, String nombreHotel, String tipoHabitacion) {
		return pp.disponibilidadHabitaciones(llegada, salida, nombreHotel, tipoHabitacion);
	}
	
	public List<Hotel> listarHoteles(){
		return pp.listarHoteles();
	}
	
	public List<TipoHabitacion> listarTiposHabitaciones(){
		return pp.listarTiposHabitaciones();
	}
	
	public void registrarReserva(Reserva reserva) {
		pp.registrarReserva(reserva);
	}
	
	public List listarReservas() {
		return pp.listarReservas();
	}
	
	public List reservaPorId(Long id) {
		return pp.reservasPorId(id);
	}
	
	public Long eliminarReservaPorId(Long id) {
		return pp.eliminarReservaPorId(id);
	}
	
	public Long eliminarReservaPorDocumento(int doc) {
		return pp.eliminarReservaPorDocumento(doc);
	}
}

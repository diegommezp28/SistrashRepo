package uniandes.isis2304.parranderos.negocio;

/**
 *TODO atributos del modelo relacional y constructor vacío
 * @author Diego Gómez
 *
 */
public class Servicio implements VOServicio{

	private Long id;
	
	public String nombre;
	
	private Integer capacidad;
	
	public Servicio(Long id, String nombre, Integer capacidad, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.descripcion = descripcion;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private String descripcion;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public Integer getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}

}

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

/**
 * Historial de los clientes
 */
public class Historico_cliente {
	public Historico_cliente() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_HISTORICO_CLIENTE_CLIENTE) {
			this.cliente = (orm.Cliente) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_HISTORICO_CLIENTE_LOGIN) {
			this.login = (orm.Login) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String rut;
	
	private String nombre;
	
	private String apellido_p;
	
	private String apellido_m;
	
	private String celular;
	
	private String correo;
	
	private String direccion;
	
	private orm.Cliente cliente;
	
	private orm.Login login;
	
	/**
	 * identificador historial
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * identificador historial
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * rut historico cliente
	 */
	public void setRut(String value) {
		this.rut = value;
	}
	
	/**
	 * rut historico cliente
	 */
	public String getRut() {
		return rut;
	}
	
	/**
	 * nombre cliente
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * nombre cliente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * apellido paterno cliente
	 */
	public void setApellido_p(String value) {
		this.apellido_p = value;
	}
	
	/**
	 * apellido paterno cliente
	 */
	public String getApellido_p() {
		return apellido_p;
	}
	
	/**
	 * apellido materno cliente
	 */
	public void setApellido_m(String value) {
		this.apellido_m = value;
	}
	
	/**
	 * apellido materno cliente
	 */
	public String getApellido_m() {
		return apellido_m;
	}
	
	/**
	 * celular cliente
	 */
	public void setCelular(String value) {
		this.celular = value;
	}
	
	/**
	 * celular cliente
	 */
	public String getCelular() {
		return celular;
	}
	
	/**
	 * correo del cliente
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	/**
	 * correo del cliente
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * correo cliente
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	/**
	 * correo cliente
	 */
	public String getDireccion() {
		return direccion;
	}
	
	public void setCliente(orm.Cliente value) {
		if (cliente != null) {
			cliente.historico_cliente.remove(this);
		}
		if (value != null) {
			value.historico_cliente.add(this);
		}
	}
	
	public orm.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(orm.Cliente value) {
		this.cliente = value;
	}
	
	private orm.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public void setLogin(orm.Login value) {
		if (login != null) {
			login.historico_cliente.remove(this);
		}
		if (value != null) {
			value.historico_cliente.add(this);
		}
	}
	
	public orm.Login getLogin() {
		return login;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Login(orm.Login value) {
		this.login = value;
	}
	
	private orm.Login getORM_Login() {
		return login;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

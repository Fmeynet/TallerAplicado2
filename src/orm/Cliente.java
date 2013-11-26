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
 * Almacena datos del cliente
 */
public class Cliente {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CLIENTE_HISTORICO_CLIENTE) {
			return ORM_historico_cliente;
		}
		else if (key == orm.ORMConstants.KEY_CLIENTE_CUENTA) {
			return ORM_cuenta;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CLIENTE_LOGIN) {
			this.login = (orm.Login) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
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
	
	private orm.Login login;
	
	private java.util.Set ORM_historico_cliente = new java.util.HashSet();
	
	private java.util.Set ORM_cuenta = new java.util.HashSet();
	
	/**
	 * identificador cliente
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * identificador cliente
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * rut cliente
	 */
	public void setRut(String value) {
		this.rut = value;
	}
	
	/**
	 * rut cliente
	 */
	public String getRut() {
		return rut;
	}
	
	/**
	 * nombre del cliente
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * apellido paterno
	 */
	public void setApellido_p(String value) {
		this.apellido_p = value;
	}
	
	/**
	 * apellido paterno
	 */
	public String getApellido_p() {
		return apellido_p;
	}
	
	/**
	 * apellido materno
	 */
	public void setApellido_m(String value) {
		this.apellido_m = value;
	}
	
	/**
	 * apellido materno
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
	 * correo  cliente
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	/**
	 * correo  cliente
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * direccion cliente
	 */
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	/**
	 * direccion cliente
	 */
	public String getDireccion() {
		return direccion;
	}
	
	public void setLogin(orm.Login value) {
		if (login != null) {
			login.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
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
	
	private void setORM_Historico_cliente(java.util.Set value) {
		this.ORM_historico_cliente = value;
	}
	
	private java.util.Set getORM_Historico_cliente() {
		return ORM_historico_cliente;
	}
	
	public final orm.Historico_clienteSetCollection historico_cliente = new orm.Historico_clienteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_HISTORICO_CLIENTE, orm.ORMConstants.KEY_HISTORICO_CLIENTE_CLIENTE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cuenta(java.util.Set value) {
		this.ORM_cuenta = value;
	}
	
	private java.util.Set getORM_Cuenta() {
		return ORM_cuenta;
	}
	
	public final orm.CuentaSetCollection cuenta = new orm.CuentaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CLIENTE_CUENTA, orm.ORMConstants.KEY_CUENTA_CLIENTE, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

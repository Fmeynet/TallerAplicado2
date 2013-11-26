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
 * Almacena las cuentas de los clientes
 */
public class Cuenta {
	public Cuenta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CUENTA_CONSUMO) {
			return ORM_consumo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CUENTA_SERVICIO) {
			this.servicio = (orm.Servicio) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CUENTA_CLIENTE) {
			this.cliente = (orm.Cliente) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CUENTA_LOGIN) {
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
	
	private boolean activo;
	
	private orm.Servicio servicio;
	
	private orm.Cliente cliente;
	
	private orm.Login login;
	
	private java.util.Set ORM_consumo = new java.util.HashSet();
	
	/**
	 * identificador cuenta cliente
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * identificador cuenta cliente
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Cuenta activa o no activa
	 */
	public void setActivo(boolean value) {
		this.activo = value;
	}
	
	/**
	 * Cuenta activa o no activa
	 */
	public boolean getActivo() {
		return activo;
	}
	
	public void setServicio(orm.Servicio value) {
		if (servicio != null) {
			servicio.cuenta.remove(this);
		}
		if (value != null) {
			value.cuenta.add(this);
		}
	}
	
	public orm.Servicio getServicio() {
		return servicio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Servicio(orm.Servicio value) {
		this.servicio = value;
	}
	
	private orm.Servicio getORM_Servicio() {
		return servicio;
	}
	
	public void setCliente(orm.Cliente value) {
		if (cliente != null) {
			cliente.cuenta.remove(this);
		}
		if (value != null) {
			value.cuenta.add(this);
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
			login.cuenta.remove(this);
		}
		if (value != null) {
			value.cuenta.add(this);
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
	
	private void setORM_Consumo(java.util.Set value) {
		this.ORM_consumo = value;
	}
	
	private java.util.Set getORM_Consumo() {
		return ORM_consumo;
	}
	
	public final orm.ConsumoSetCollection consumo = new orm.ConsumoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CUENTA_CONSUMO, orm.ORMConstants.KEY_CONSUMO_CUENTA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

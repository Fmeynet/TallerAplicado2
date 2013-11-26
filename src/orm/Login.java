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
 * Tabla almacena la fecha y un token cuando el administrador logea
 */
public class Login {
	public Login() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_LOGIN_CONSUMO) {
			return ORM_consumo;
		}
		else if (key == orm.ORMConstants.KEY_LOGIN_CUENTA) {
			return ORM_cuenta;
		}
		else if (key == orm.ORMConstants.KEY_LOGIN_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == orm.ORMConstants.KEY_LOGIN_HISTORICO_CLIENTE) {
			return ORM_historico_cliente;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_LOGIN_ADMINISTRADOR) {
			this.administrador = (orm.Administrador) owner;
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
	
	private String token;
	
	private String fecha_ini;
	
	private String fecha_fin;
	
	private orm.Administrador administrador;
	
	private java.util.Set ORM_consumo = new java.util.HashSet();
	
	private java.util.Set ORM_cuenta = new java.util.HashSet();
	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	private java.util.Set ORM_historico_cliente = new java.util.HashSet();
	
	/**
	 * identificador login usuario
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * identificador login usuario
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * token login del usuario
	 */
	public void setToken(String value) {
		this.token = value;
	}
	
	/**
	 * token login del usuario
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * fecha inicio del login
	 */
	public void setFecha_ini(String value) {
		this.fecha_ini = value;
	}
	
	/**
	 * fecha inicio del login
	 */
	public String getFecha_ini() {
		return fecha_ini;
	}
	
	/**
	 * fin del token
	 */
	public void setFecha_fin(String value) {
		this.fecha_fin = value;
	}
	
	/**
	 * fin del token
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}
	
	public void setAdministrador(orm.Administrador value) {
		if (administrador != null) {
			administrador.login.remove(this);
		}
		if (value != null) {
			value.login.add(this);
		}
	}
	
	public orm.Administrador getAdministrador() {
		return administrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrador(orm.Administrador value) {
		this.administrador = value;
	}
	
	private orm.Administrador getORM_Administrador() {
		return administrador;
	}
	
	private void setORM_Consumo(java.util.Set value) {
		this.ORM_consumo = value;
	}
	
	private java.util.Set getORM_Consumo() {
		return ORM_consumo;
	}
	
	public final orm.ConsumoSetCollection consumo = new orm.ConsumoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LOGIN_CONSUMO, orm.ORMConstants.KEY_CONSUMO_LOGIN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cuenta(java.util.Set value) {
		this.ORM_cuenta = value;
	}
	
	private java.util.Set getORM_Cuenta() {
		return ORM_cuenta;
	}
	
	public final orm.CuentaSetCollection cuenta = new orm.CuentaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LOGIN_CUENTA, orm.ORMConstants.KEY_CUENTA_LOGIN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	public final orm.ClienteSetCollection cliente = new orm.ClienteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LOGIN_CLIENTE, orm.ORMConstants.KEY_CLIENTE_LOGIN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Historico_cliente(java.util.Set value) {
		this.ORM_historico_cliente = value;
	}
	
	private java.util.Set getORM_Historico_cliente() {
		return ORM_historico_cliente;
	}
	
	public final orm.Historico_clienteSetCollection historico_cliente = new orm.Historico_clienteSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_LOGIN_HISTORICO_CLIENTE, orm.ORMConstants.KEY_HISTORICO_CLIENTE_LOGIN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

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
 * Almacena los servicios
 */
public class Servicio {
	public Servicio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_SERVICIO_CUENTA) {
			return ORM_cuenta;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String tipo_servicio;
	
	private int valor_fijo;
	
	private int valor_unitario;
	
	private java.util.Set ORM_cuenta = new java.util.HashSet();
	
	/**
	 * identificador servicio
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * identificador servicio
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	/**
	 * Tipo del servicio
	 */
	public void setTipo_servicio(String value) {
		this.tipo_servicio = value;
	}
	
	/**
	 * Tipo del servicio
	 */
	public String getTipo_servicio() {
		return tipo_servicio;
	}
	
	/**
	 * monto fijo del consumo
	 */
	public void setValor_fijo(int value) {
		this.valor_fijo = value;
	}
	
	/**
	 * monto fijo del consumo
	 */
	public int getValor_fijo() {
		return valor_fijo;
	}
	
	/**
	 * monto total consumo
	 */
	public void setValor_unitario(int value) {
		this.valor_unitario = value;
	}
	
	/**
	 * monto total consumo
	 */
	public int getValor_unitario() {
		return valor_unitario;
	}
	
	private void setORM_Cuenta(java.util.Set value) {
		this.ORM_cuenta = value;
	}
	
	private java.util.Set getORM_Cuenta() {
		return ORM_cuenta;
	}
	
	public final orm.CuentaSetCollection cuenta = new orm.CuentaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_SERVICIO_CUENTA, orm.ORMConstants.KEY_CUENTA_SERVICIO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

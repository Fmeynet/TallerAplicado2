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
 * Almacena consumo de las cuentas del cliente
 */
public class Consumo {
	public Consumo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CONSUMO_LOGIN) {
			this.login = (orm.Login) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CONSUMO_CUENTA) {
			this.cuenta = (orm.Cuenta) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private int consumo;
	
	private int monto;
	
	private boolean morosidad;
	
	private String fecha_vencimiento;
	
	private orm.Login login;
	
	private orm.Cuenta cuenta;
	
	/**
	 * id consumo
	 */
	private void setId(int value) {
		this.id = value;
	}
	
	/**
	 * id consumo
	 */
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setConsumo(int value) {
		this.consumo = value;
	}
	
	public int getConsumo() {
		return consumo;
	}
	
	/**
	 * Monto totaal
	 */
	public void setMonto(int value) {
		this.monto = value;
	}
	
	/**
	 * Monto totaal
	 */
	public int getMonto() {
		return monto;
	}
	
	/**
	 * Debe o no debe
	 */
	public void setMorosidad(boolean value) {
		this.morosidad = value;
	}
	
	/**
	 * Debe o no debe
	 */
	public boolean getMorosidad() {
		return morosidad;
	}
	
	/**
	 * fecha vencimiento
	 */
	public void setFecha_vencimiento(String value) {
		this.fecha_vencimiento = value;
	}
	
	/**
	 * fecha vencimiento
	 */
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	
	public void setLogin(orm.Login value) {
		if (login != null) {
			login.consumo.remove(this);
		}
		if (value != null) {
			value.consumo.add(this);
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
	
	public void setCuenta(orm.Cuenta value) {
		if (cuenta != null) {
			cuenta.consumo.remove(this);
		}
		if (value != null) {
			value.consumo.add(this);
		}
	}
	
	public orm.Cuenta getCuenta() {
		return cuenta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cuenta(orm.Cuenta value) {
		this.cuenta = value;
	}
	
	private orm.Cuenta getORM_Cuenta() {
		return cuenta;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}

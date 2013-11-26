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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LoginDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final StringExpression fecha_ini;
	public final StringExpression fecha_fin;
	
	public LoginDetachedCriteria() {
		super(orm.Login.class, orm.LoginCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		token = new StringExpression("token", this.getDetachedCriteria());
		fecha_ini = new StringExpression("fecha_ini", this.getDetachedCriteria());
		fecha_fin = new StringExpression("fecha_fin", this.getDetachedCriteria());
	}
	
	public LoginDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.LoginCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		token = new StringExpression("token", this.getDetachedCriteria());
		fecha_ini = new StringExpression("fecha_ini", this.getDetachedCriteria());
		fecha_fin = new StringExpression("fecha_fin", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public ConsumoDetachedCriteria createConsumoCriteria() {
		return new ConsumoDetachedCriteria(createCriteria("ORM_Consumo"));
	}
	
	public CuentaDetachedCriteria createCuentaCriteria() {
		return new CuentaDetachedCriteria(createCriteria("ORM_Cuenta"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_Cliente"));
	}
	
	public Historico_clienteDetachedCriteria createHistorico_clienteCriteria() {
		return new Historico_clienteDetachedCriteria(createCriteria("ORM_Historico_cliente"));
	}
	
	public Login uniqueLogin(PersistentSession session) {
		return (Login) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Login[] listLogin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}


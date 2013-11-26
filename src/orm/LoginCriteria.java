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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LoginCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression token;
	public final StringExpression fecha_ini;
	public final StringExpression fecha_fin;
	
	public LoginCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		token = new StringExpression("token", this);
		fecha_ini = new StringExpression("fecha_ini", this);
		fecha_fin = new StringExpression("fecha_fin", this);
	}
	
	public LoginCriteria(PersistentSession session) {
		this(session.createCriteria(Login.class));
	}
	
	public LoginCriteria() throws PersistentException {
		this(orm.TallerAp1PersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public ConsumoCriteria createConsumoCriteria() {
		return new ConsumoCriteria(createCriteria("ORM_Consumo"));
	}
	
	public CuentaCriteria createCuentaCriteria() {
		return new CuentaCriteria(createCriteria("ORM_Cuenta"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
	public Historico_clienteCriteria createHistorico_clienteCriteria() {
		return new Historico_clienteCriteria(createCriteria("ORM_Historico_cliente"));
	}
	
	public Login uniqueLogin() {
		return (Login) super.uniqueResult();
	}
	
	public Login[] listLogin() {
		java.util.List list = super.list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}


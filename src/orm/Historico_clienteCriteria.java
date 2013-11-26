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

public class Historico_clienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression rut;
	public final StringExpression nombre;
	public final StringExpression apellido_p;
	public final StringExpression apellido_m;
	public final StringExpression celular;
	public final StringExpression correo;
	public final StringExpression direccion;
	
	public Historico_clienteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		rut = new StringExpression("rut", this);
		nombre = new StringExpression("nombre", this);
		apellido_p = new StringExpression("apellido_p", this);
		apellido_m = new StringExpression("apellido_m", this);
		celular = new StringExpression("celular", this);
		correo = new StringExpression("correo", this);
		direccion = new StringExpression("direccion", this);
	}
	
	public Historico_clienteCriteria(PersistentSession session) {
		this(session.createCriteria(Historico_cliente.class));
	}
	
	public Historico_clienteCriteria() throws PersistentException {
		this(orm.TallerAp1PersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public LoginCriteria createLoginCriteria() {
		return new LoginCriteria(createCriteria("login"));
	}
	
	public Historico_cliente uniqueHistorico_cliente() {
		return (Historico_cliente) super.uniqueResult();
	}
	
	public Historico_cliente[] listHistorico_cliente() {
		java.util.List list = super.list();
		return (Historico_cliente[]) list.toArray(new Historico_cliente[list.size()]);
	}
}


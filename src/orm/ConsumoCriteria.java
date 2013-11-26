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

public class ConsumoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression consumo;
	public final IntegerExpression monto;
	public final BooleanExpression morosidad;
	public final StringExpression fecha_vencimiento;
	
	public ConsumoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		consumo = new IntegerExpression("consumo", this);
		monto = new IntegerExpression("monto", this);
		morosidad = new BooleanExpression("morosidad", this);
		fecha_vencimiento = new StringExpression("fecha_vencimiento", this);
	}
	
	public ConsumoCriteria(PersistentSession session) {
		this(session.createCriteria(Consumo.class));
	}
	
	public ConsumoCriteria() throws PersistentException {
		this(orm.TallerAp1PersistentManager.instance().getSession());
	}
	
	public LoginCriteria createLoginCriteria() {
		return new LoginCriteria(createCriteria("login"));
	}
	
	public CuentaCriteria createCuentaCriteria() {
		return new CuentaCriteria(createCriteria("cuenta"));
	}
	
	public Consumo uniqueConsumo() {
		return (Consumo) super.uniqueResult();
	}
	
	public Consumo[] listConsumo() {
		java.util.List list = super.list();
		return (Consumo[]) list.toArray(new Consumo[list.size()]);
	}
}


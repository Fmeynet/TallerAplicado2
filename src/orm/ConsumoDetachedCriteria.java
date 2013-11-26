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

public class ConsumoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression consumo;
	public final IntegerExpression monto;
	public final BooleanExpression morosidad;
	public final StringExpression fecha_vencimiento;
	
	public ConsumoDetachedCriteria() {
		super(orm.Consumo.class, orm.ConsumoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		consumo = new IntegerExpression("consumo", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
		morosidad = new BooleanExpression("morosidad", this.getDetachedCriteria());
		fecha_vencimiento = new StringExpression("fecha_vencimiento", this.getDetachedCriteria());
	}
	
	public ConsumoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ConsumoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		consumo = new IntegerExpression("consumo", this.getDetachedCriteria());
		monto = new IntegerExpression("monto", this.getDetachedCriteria());
		morosidad = new BooleanExpression("morosidad", this.getDetachedCriteria());
		fecha_vencimiento = new StringExpression("fecha_vencimiento", this.getDetachedCriteria());
	}
	
	public LoginDetachedCriteria createLoginCriteria() {
		return new LoginDetachedCriteria(createCriteria("login"));
	}
	
	public CuentaDetachedCriteria createCuentaCriteria() {
		return new CuentaDetachedCriteria(createCriteria("cuenta"));
	}
	
	public Consumo uniqueConsumo(PersistentSession session) {
		return (Consumo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Consumo[] listConsumo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Consumo[]) list.toArray(new Consumo[list.size()]);
	}
}


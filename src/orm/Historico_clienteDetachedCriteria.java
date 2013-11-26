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

public class Historico_clienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression rut;
	public final StringExpression nombre;
	public final StringExpression apellido_p;
	public final StringExpression apellido_m;
	public final StringExpression celular;
	public final StringExpression correo;
	public final StringExpression direccion;
	
	public Historico_clienteDetachedCriteria() {
		super(orm.Historico_cliente.class, orm.Historico_clienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_p = new StringExpression("apellido_p", this.getDetachedCriteria());
		apellido_m = new StringExpression("apellido_m", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
	}
	
	public Historico_clienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Historico_clienteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido_p = new StringExpression("apellido_p", this.getDetachedCriteria());
		apellido_m = new StringExpression("apellido_m", this.getDetachedCriteria());
		celular = new StringExpression("celular", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public LoginDetachedCriteria createLoginCriteria() {
		return new LoginDetachedCriteria(createCriteria("login"));
	}
	
	public Historico_cliente uniqueHistorico_cliente(PersistentSession session) {
		return (Historico_cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Historico_cliente[] listHistorico_cliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Historico_cliente[]) list.toArray(new Historico_cliente[list.size()]);
	}
}


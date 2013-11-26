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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Historico_clienteDAO {
	public static Historico_cliente loadHistorico_clienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return loadHistorico_clienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente getHistorico_clienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return getHistorico_clienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return loadHistorico_clienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente getHistorico_clienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return getHistorico_clienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Historico_cliente) session.load(orm.Historico_cliente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente getHistorico_clienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Historico_cliente) session.get(orm.Historico_cliente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historico_cliente) session.load(orm.Historico_cliente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente getHistorico_clienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historico_cliente) session.get(orm.Historico_cliente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_cliente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return queryHistorico_cliente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_cliente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return queryHistorico_cliente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente[] listHistorico_clienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return listHistorico_clienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente[] listHistorico_clienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return listHistorico_clienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_cliente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Historico_cliente as Historico_cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorico_cliente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Historico_cliente as Historico_cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Historico_cliente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente[] listHistorico_clienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHistorico_cliente(session, condition, orderBy);
			return (Historico_cliente[]) list.toArray(new Historico_cliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente[] listHistorico_clienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHistorico_cliente(session, condition, orderBy, lockMode);
			return (Historico_cliente[]) list.toArray(new Historico_cliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return loadHistorico_clienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return loadHistorico_clienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Historico_cliente[] historico_clientes = listHistorico_clienteByQuery(session, condition, orderBy);
		if (historico_clientes != null && historico_clientes.length > 0)
			return historico_clientes[0];
		else
			return null;
	}
	
	public static Historico_cliente loadHistorico_clienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Historico_cliente[] historico_clientes = listHistorico_clienteByQuery(session, condition, orderBy, lockMode);
		if (historico_clientes != null && historico_clientes.length > 0)
			return historico_clientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHistorico_clienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return iterateHistorico_clienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorico_clienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerAp1PersistentManager.instance().getSession();
			return iterateHistorico_clienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorico_clienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Historico_cliente as Historico_cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorico_clienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Historico_cliente as Historico_cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Historico_cliente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente createHistorico_cliente() {
		return new orm.Historico_cliente();
	}
	
	public static boolean save(orm.Historico_cliente historico_cliente) throws PersistentException {
		try {
			orm.TallerAp1PersistentManager.instance().saveObject(historico_cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Historico_cliente historico_cliente) throws PersistentException {
		try {
			orm.TallerAp1PersistentManager.instance().deleteObject(historico_cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Historico_cliente historico_cliente)throws PersistentException {
		try {
			if(historico_cliente.getCliente() != null) {
				historico_cliente.getCliente().historico_cliente.remove(historico_cliente);
			}
			
			if(historico_cliente.getLogin() != null) {
				historico_cliente.getLogin().historico_cliente.remove(historico_cliente);
			}
			
			return delete(historico_cliente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Historico_cliente historico_cliente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(historico_cliente.getCliente() != null) {
				historico_cliente.getCliente().historico_cliente.remove(historico_cliente);
			}
			
			if(historico_cliente.getLogin() != null) {
				historico_cliente.getLogin().historico_cliente.remove(historico_cliente);
			}
			
			try {
				session.delete(historico_cliente);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Historico_cliente historico_cliente) throws PersistentException {
		try {
			orm.TallerAp1PersistentManager.instance().getSession().refresh(historico_cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Historico_cliente historico_cliente) throws PersistentException {
		try {
			orm.TallerAp1PersistentManager.instance().getSession().evict(historico_cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historico_cliente loadHistorico_clienteByCriteria(Historico_clienteCriteria historico_clienteCriteria) {
		Historico_cliente[] historico_clientes = listHistorico_clienteByCriteria(historico_clienteCriteria);
		if(historico_clientes == null || historico_clientes.length == 0) {
			return null;
		}
		return historico_clientes[0];
	}
	
	public static Historico_cliente[] listHistorico_clienteByCriteria(Historico_clienteCriteria historico_clienteCriteria) {
		return historico_clienteCriteria.listHistorico_cliente();
	}
}

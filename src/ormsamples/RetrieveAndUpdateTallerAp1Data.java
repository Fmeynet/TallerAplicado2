/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTallerAp1Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerAp1PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Administrador lormAdministrador = orm.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			orm.AdministradorDAO.save(lormAdministrador);
			orm.Cliente lormCliente = orm.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			orm.ClienteDAO.save(lormCliente);
			orm.Login lormLogin = orm.LoginDAO.loadLoginByQuery(null, null);
			// Update the properties of the persistent object
			orm.LoginDAO.save(lormLogin);
			orm.Historico_cliente lormHistorico_cliente = orm.Historico_clienteDAO.loadHistorico_clienteByQuery(null, null);
			// Update the properties of the persistent object
			orm.Historico_clienteDAO.save(lormHistorico_cliente);
			orm.Servicio lormServicio = orm.ServicioDAO.loadServicioByQuery(null, null);
			// Update the properties of the persistent object
			orm.ServicioDAO.save(lormServicio);
			orm.Cuenta lormCuenta = orm.CuentaDAO.loadCuentaByQuery(null, null);
			// Update the properties of the persistent object
			orm.CuentaDAO.save(lormCuenta);
			orm.Consumo lormConsumo = orm.ConsumoDAO.loadConsumoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ConsumoDAO.save(lormConsumo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		orm.AdministradorCriteria lormAdministradorCriteria = new orm.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAdministradorCriteria.id.eq();
		System.out.println(lormAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		orm.ClienteCriteria lormClienteCriteria = new orm.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormClienteCriteria.id.eq();
		System.out.println(lormClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Login by LoginCriteria");
		orm.LoginCriteria lormLoginCriteria = new orm.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormLoginCriteria.id.eq();
		System.out.println(lormLoginCriteria.uniqueLogin());
		
		System.out.println("Retrieving Historico_cliente by Historico_clienteCriteria");
		orm.Historico_clienteCriteria lormHistorico_clienteCriteria = new orm.Historico_clienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormHistorico_clienteCriteria.id.eq();
		System.out.println(lormHistorico_clienteCriteria.uniqueHistorico_cliente());
		
		System.out.println("Retrieving Servicio by ServicioCriteria");
		orm.ServicioCriteria lormServicioCriteria = new orm.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormServicioCriteria.id.eq();
		System.out.println(lormServicioCriteria.uniqueServicio());
		
		System.out.println("Retrieving Cuenta by CuentaCriteria");
		orm.CuentaCriteria lormCuentaCriteria = new orm.CuentaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormCuentaCriteria.id.eq();
		System.out.println(lormCuentaCriteria.uniqueCuenta());
		
		System.out.println("Retrieving Consumo by ConsumoCriteria");
		orm.ConsumoCriteria lormConsumoCriteria = new orm.ConsumoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormConsumoCriteria.id.eq();
		System.out.println(lormConsumoCriteria.uniqueConsumo());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTallerAp1Data retrieveAndUpdateTallerAp1Data = new RetrieveAndUpdateTallerAp1Data();
			try {
				retrieveAndUpdateTallerAp1Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateTallerAp1Data.retrieveByCriteria();
			}
			finally {
				orm.TallerAp1PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

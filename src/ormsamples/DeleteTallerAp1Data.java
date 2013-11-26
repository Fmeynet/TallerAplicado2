/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteTallerAp1Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerAp1PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Administrador lormAdministrador = orm.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			orm.AdministradorDAO.delete(lormAdministrador);
			orm.Cliente lormCliente = orm.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			orm.ClienteDAO.delete(lormCliente);
			orm.Login lormLogin = orm.LoginDAO.loadLoginByQuery(null, null);
			// Delete the persistent object
			orm.LoginDAO.delete(lormLogin);
			orm.Historico_cliente lormHistorico_cliente = orm.Historico_clienteDAO.loadHistorico_clienteByQuery(null, null);
			// Delete the persistent object
			orm.Historico_clienteDAO.delete(lormHistorico_cliente);
			orm.Servicio lormServicio = orm.ServicioDAO.loadServicioByQuery(null, null);
			// Delete the persistent object
			orm.ServicioDAO.delete(lormServicio);
			orm.Cuenta lormCuenta = orm.CuentaDAO.loadCuentaByQuery(null, null);
			// Delete the persistent object
			orm.CuentaDAO.delete(lormCuenta);
			orm.Consumo lormConsumo = orm.ConsumoDAO.loadConsumoByQuery(null, null);
			// Delete the persistent object
			orm.ConsumoDAO.delete(lormConsumo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTallerAp1Data deleteTallerAp1Data = new DeleteTallerAp1Data();
			try {
				deleteTallerAp1Data.deleteTestData();
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

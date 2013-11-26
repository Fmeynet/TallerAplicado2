/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListTallerAp1Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Administrador...");
		orm.Administrador[] ormAdministradors = orm.AdministradorDAO.listAdministradorByQuery(null, null);
		int length = Math.min(ormAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		orm.Cliente[] ormClientes = orm.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(ormClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Login...");
		orm.Login[] ormLogins = orm.LoginDAO.listLoginByQuery(null, null);
		length = Math.min(ormLogins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormLogins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Historico_cliente...");
		orm.Historico_cliente[] ormHistorico_clientes = orm.Historico_clienteDAO.listHistorico_clienteByQuery(null, null);
		length = Math.min(ormHistorico_clientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHistorico_clientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Servicio...");
		orm.Servicio[] ormServicios = orm.ServicioDAO.listServicioByQuery(null, null);
		length = Math.min(ormServicios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormServicios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cuenta...");
		orm.Cuenta[] ormCuentas = orm.CuentaDAO.listCuentaByQuery(null, null);
		length = Math.min(ormCuentas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCuentas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consumo...");
		orm.Consumo[] ormConsumos = orm.ConsumoDAO.listConsumoByQuery(null, null);
		length = Math.min(ormConsumos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormConsumos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Administrador by Criteria...");
		orm.AdministradorCriteria lormAdministradorCriteria = new orm.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAdministradorCriteria.id.eq();
		lormAdministradorCriteria.setMaxResults(ROW_COUNT);
		orm.Administrador[] ormAdministradors = lormAdministradorCriteria.listAdministrador();
		int length =ormAdministradors== null ? 0 : Math.min(ormAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		orm.ClienteCriteria lormClienteCriteria = new orm.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormClienteCriteria.id.eq();
		lormClienteCriteria.setMaxResults(ROW_COUNT);
		orm.Cliente[] ormClientes = lormClienteCriteria.listCliente();
		length =ormClientes== null ? 0 : Math.min(ormClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Login by Criteria...");
		orm.LoginCriteria lormLoginCriteria = new orm.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormLoginCriteria.id.eq();
		lormLoginCriteria.setMaxResults(ROW_COUNT);
		orm.Login[] ormLogins = lormLoginCriteria.listLogin();
		length =ormLogins== null ? 0 : Math.min(ormLogins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormLogins[i]);
		}
		System.out.println(length + " Login record(s) retrieved."); 
		
		System.out.println("Listing Historico_cliente by Criteria...");
		orm.Historico_clienteCriteria lormHistorico_clienteCriteria = new orm.Historico_clienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHistorico_clienteCriteria.id.eq();
		lormHistorico_clienteCriteria.setMaxResults(ROW_COUNT);
		orm.Historico_cliente[] ormHistorico_clientes = lormHistorico_clienteCriteria.listHistorico_cliente();
		length =ormHistorico_clientes== null ? 0 : Math.min(ormHistorico_clientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHistorico_clientes[i]);
		}
		System.out.println(length + " Historico_cliente record(s) retrieved."); 
		
		System.out.println("Listing Servicio by Criteria...");
		orm.ServicioCriteria lormServicioCriteria = new orm.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormServicioCriteria.id.eq();
		lormServicioCriteria.setMaxResults(ROW_COUNT);
		orm.Servicio[] ormServicios = lormServicioCriteria.listServicio();
		length =ormServicios== null ? 0 : Math.min(ormServicios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormServicios[i]);
		}
		System.out.println(length + " Servicio record(s) retrieved."); 
		
		System.out.println("Listing Cuenta by Criteria...");
		orm.CuentaCriteria lormCuentaCriteria = new orm.CuentaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCuentaCriteria.id.eq();
		lormCuentaCriteria.setMaxResults(ROW_COUNT);
		orm.Cuenta[] ormCuentas = lormCuentaCriteria.listCuenta();
		length =ormCuentas== null ? 0 : Math.min(ormCuentas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCuentas[i]);
		}
		System.out.println(length + " Cuenta record(s) retrieved."); 
		
		System.out.println("Listing Consumo by Criteria...");
		orm.ConsumoCriteria lormConsumoCriteria = new orm.ConsumoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormConsumoCriteria.id.eq();
		lormConsumoCriteria.setMaxResults(ROW_COUNT);
		orm.Consumo[] ormConsumos = lormConsumoCriteria.listConsumo();
		length =ormConsumos== null ? 0 : Math.min(ormConsumos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormConsumos[i]);
		}
		System.out.println(length + " Consumo record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTallerAp1Data listTallerAp1Data = new ListTallerAp1Data();
			try {
				listTallerAp1Data.listTestData();
				//listTallerAp1Data.listByCriteria();
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

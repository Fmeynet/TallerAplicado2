/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateTallerAp1Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerAp1PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Administrador lormAdministrador = orm.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, password, usuario
			orm.AdministradorDAO.save(lormAdministrador);
			orm.Cliente lormCliente = orm.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, historico_cliente, login, direccion, correo, celular, apellido_m, apellido_p, nombre, rut
			orm.ClienteDAO.save(lormCliente);
			orm.Login lormLogin = orm.LoginDAO.createLogin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historico_cliente, cliente, cuenta, consumo, administrador, fecha_fin, fecha_ini, token
			orm.LoginDAO.save(lormLogin);
			orm.Historico_cliente lormHistorico_cliente = orm.Historico_clienteDAO.createHistorico_cliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, cliente, direccion, correo, celular, apellido_m, apellido_p, nombre, rut
			orm.Historico_clienteDAO.save(lormHistorico_cliente);
			orm.Servicio lormServicio = orm.ServicioDAO.createServicio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, valor_unitario, valor_fijo, tipo_servicio
			orm.ServicioDAO.save(lormServicio);
			orm.Cuenta lormCuenta = orm.CuentaDAO.createCuenta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : consumo, login, cliente, servicio, activo
			orm.CuentaDAO.save(lormCuenta);
			orm.Consumo lormConsumo = orm.ConsumoDAO.createConsumo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cuenta, login, fecha_vencimiento, morosidad, monto, consumo
			orm.ConsumoDAO.save(lormConsumo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTallerAp1Data createTallerAp1Data = new CreateTallerAp1Data();
			try {
				createTallerAp1Data.createTestData();
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

package webservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import domain.AdministradorVO;
import domain.ClienteVO;
import domain.LoginVO;
import domain.ServicioVO;

public class ServicioAdmin {
	
	
	public String agregarAdministrador(String json) {
		Gson gson = new Gson();
		AdministradorVO administradorVO=(AdministradorVO)gson.fromJson(json, AdministradorVO.class);
		PersistentTransaction t;
		System.out.println(administradorVO.getUser());
		System.out.println(administradorVO.getPassword());
		try {
			
			t = orm.TallerAp1PersistentManager.instance().getSession()
					.beginTransaction();

			try {
				// Compara si los datos se encuentran vacios
				if (administradorVO.getUser() == ""
						|| administradorVO.getPassword() == "") {
					System.out.println("vacio");
					return "Error: Existen campos vacios";

				
					}else {
						
						orm.Administrador lormAdministrador = orm.AdministradorDAO
								.createAdministrador();
						
						//Ingreso de usuario y contraseña
						lormAdministrador.setUsuario(administradorVO.getUser());
						lormAdministrador.setPassword(administradorVO.getPassword());

						orm.AdministradorDAO.save(lormAdministrador);
						t.commit();
						System.out.println("aaa");
						return "Se ha ingresado un administrador exitosamente";

					}
			
			}

			catch (Exception e) {
				t.rollback();
				return "Error-Rollback";
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return "Error persistencia";
		}
	}
	
	public String loginAdministrador(String json) throws PersistentException {

		Gson gson = new Gson();
		AdministradorVO administradorVO=(AdministradorVO)gson.fromJson(json, AdministradorVO.class);
		PersistentTransaction t;
		

			t = orm.TallerAp1PersistentManager.instance().getSession()
					.beginTransaction();

		

				

					String condLogin = "usuario = '"
							+ administradorVO.getUser() + "' ";
					condLogin += "and password = '"
							+ administradorVO.getPassword() + "'";
					orm.Administrador adminLogeadoORM = orm.AdministradorDAO
							.loadAdministradorByQuery(condLogin, null);
					orm.Administrador[] adminLorm = orm.AdministradorDAO
							.listAdministradorByQuery(condLogin, null);
				
					orm.Login lormLogin = orm.LoginDAO.createLogin();
					Date date = new Date();
					DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

					Date fecha_fin = new Date(date.getTime() + 5 * 60000);
					String token = login.Token.generarToken(50);
					
					LoginVO loginvo = new LoginVO();
					for (int i=0; i<adminLorm.length;i++){
						domain.AdministradorVO admin = new domain.AdministradorVO(adminLorm[i].getUsuario(),adminLorm[i].getPassword());
						loginvo.setAdmin(admin);
					}
					loginvo.setFecha_ini(hourdateFormat.format(date));
					loginvo.setFecha_fin(hourdateFormat.format(fecha_fin));
					loginvo.setToken(token);
					
					String login = gson.toJson(loginvo);
					
					lormLogin.setFecha_ini(hourdateFormat.format(date));
					lormLogin.setFecha_fin(hourdateFormat.format(fecha_fin));
					lormLogin.setToken(token);
					lormLogin.setAdministrador(adminLogeadoORM);
					orm.LoginDAO.save(lormLogin);
					t.commit();

					return login;

				 }

	
public String agregarCliente(String json) {
		
	Gson gson = new Gson();
	ClienteVO clienteVO=(ClienteVO)gson.fromJson(json, ClienteVO.class);
		
		
			PersistentTransaction t;
			try {
				t = orm.TallerAp1PersistentManager.instance().getSession()
						.beginTransaction();

				try {
					//Valida que los campos no se encuentren vacios
					if (clienteVO.getNombre() == ""
							|| clienteVO.getApellido_p() == ""
							|| clienteVO.getApellido_m() == ""
							|| clienteVO.getRut() == ""
							|| clienteVO.getCelular() == ""
							|| clienteVO.getCorreo() == ""
							|| clienteVO.getDireccion() == ""
							|| clienteVO == null) {

						return "Error: Existen campos vacios";

					} else {


						// Crea condicion
						String condicionRut = "";
						String condicionMail = "";

						
						condicionRut += "rut = '" + clienteVO.getRut() + "'";
						condicionMail += "correo = '" + clienteVO.getCorreo()
								+ "'";

						// Consulta por el rut en la base de datos
						orm.Cliente[] ormClientes = orm.ClienteDAO.listClienteByQuery(
								condicionRut, null);
						
						// Consulta por el mail en la base de datos
						orm.Cliente[] ormClientes2 = orm.ClienteDAO.listClienteByQuery(
								condicionMail, null);
						
						
						 if (ormClientes2.length != 0) {
							return "El RUT ingresado ya se encuentra en uso";
						} else {

							// Ingreso de datos, evitando que el rut o el mail se encuentren repetidos en la BD
							orm.Cliente lormCliente = orm.ClienteDAO
									.createCliente();
							
							lormCliente.setNombre(clienteVO.getNombre());
							lormCliente.setApellido_p(clienteVO.getApellido_p());
							lormCliente.setApellido_m(clienteVO.getApellido_m());
							lormCliente.setRut(clienteVO.getRut());
							lormCliente.setCelular(clienteVO.getCelular());
							lormCliente.setCorreo(clienteVO.getCorreo());
							lormCliente.setDireccion(clienteVO.getDireccion());

							// Crea condicion datos de usuario
							String condLogin = "";
							condLogin += "usuario = '"
									+ clienteVO.getLogin().getAdmin()
											.getUser() + "'";
							condLogin += "and password = '"
									+ clienteVO.getLogin().getAdmin()
											.getPassword() + "'";
							// Consulta datos de usuario
							orm.Administrador adminLogeadoORM = orm.AdministradorDAO
									.loadAdministradorByQuery(condLogin, null);

							String logCond = "token = '"
									+ clienteVO.getLogin().getToken() + "'";
							orm.Login loginAdminORM = orm.LoginDAO
									.loadLoginByQuery(logCond, null);

							loginAdminORM.setAdministrador(adminLogeadoORM);
							lormCliente.setLogin(loginAdminORM);

							orm.ClienteDAO.save(lormCliente);
							t.commit();
							return "Se ha ingresado un cliente exitosamente";
						}
					}

				}

				catch (Exception e) {
					e.printStackTrace();
					t.rollback();
					return "Error-Rollback";
				}
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return "Error persistencia";
			}
		}
		
public String mostrarClientes() {

	
	Gson gson = new Gson();
	//ClienteVO clienteVO=(ClienteVO)gson.fromJson(json, ClienteVO.class);
	
	//Creacion de lista para almacenar ClienteVO
	List<domain.ClienteVO> clientesIngresados = new ArrayList<domain.ClienteVO>();		
		
	try {
		orm.Cliente[] clientes = orm.ClienteDAO.listClienteByQuery(null,
				null);

		
		for (int i = 0; i < clientes.length; i++) {
			
			//Se obtienen los datos del administrador
			domain.LoginVO CLlogin = new domain.LoginVO(clientes[i]
					.getLogin().getToken(), clientes[i].getLogin()
					.getFecha_ini(), clientes[i].getLogin().getFecha_fin(),
					new domain.AdministradorVO(clientes[i].getLogin()
							.getAdministrador().getUsuario(), clientes[i]
							.getLogin().getAdministrador().getPassword()));

			//Se agregan los datos del cliente a la lista
			clientesIngresados.add(new domain.ClienteVO(clientes[i]
					.getRut(), clientes[i].getNombre(), clientes[i]
					.getApellido_p(), clientes[i].getApellido_m(),
					clientes[i].getCelular(), clientes[i].getCorreo(),
					clientes[i].getDireccion(), CLlogin));

		}

		String clientesDatos =gson.toJson(clientesIngresados);
		return clientesDatos;

	} catch (PersistentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	//}
}

public String agregarServicio(String json) {
	
	Gson gson = new Gson();
	ServicioVO servicioVO=(ServicioVO)gson.fromJson(json, ServicioVO.class);
	try {
		PersistentTransaction t = orm.TallerAp1PersistentManager.instance()
				.getSession().beginTransaction();

		try {

			orm.Servicio lormServicio = orm.ServicioDAO.createServicio();

			lormServicio.setTipo_servicio(servicioVO.getTipo_servicio());
			lormServicio.setValor_unitario(servicioVO.getValor_unitario());
			lormServicio.setValor_fijo(servicioVO.getValor_fijo());
			orm.ServicioDAO.save(lormServicio);
			t.commit();
			return "Ingreso de servicio exitoso";

		} catch (Exception e) {
			t.rollback();
			return "Error-Rollback";
		}

	} catch (PersistentException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		return "Error persistencia";
	}

}

}

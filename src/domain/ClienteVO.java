package domain;

public class ClienteVO {

	private String rut;
	private String nombre;
	private String apellido_p;
	private String apellido_m;
	private String celular;
	private String correo;
	private String direccion;
	private domain.LoginVO login;
	
	public ClienteVO(){
		
	}
	public ClienteVO(String rut, String nombre, String apellido_p,
			String apellido_m, String celular, String correo, String direccion,
			domain.LoginVO token) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.login = token;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido_p
	 */
	public String getApellido_p() {
		return apellido_p;
	}

	/**
	 * @param apellido_p the apellido_p to set
	 */
	public void setApellido_p(String apellido_p) {
		this.apellido_p = apellido_p;
	}

	/**
	 * @return the apellido_m
	 */
	public String getApellido_m() {
		return apellido_m;
	}

	/**
	 * @param apellido_m the apellido_m to set
	 */
	public void setApellido_m(String apellido_m) {
		this.apellido_m = apellido_m;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the token
	 */
	public domain.LoginVO getLogin() {
		return login;
	}

	/**
	 * @param token the token to set
	 */
	public void setLogin(domain.LoginVO login) {
		this.login = login;
	}
	
	
	
	
	
}

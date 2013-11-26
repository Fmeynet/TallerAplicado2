package domain;

public class LoginVO {

	private String token;
	private String fecha_ini;
	private String fecha_fin;
	private AdministradorVO Admin;
	
	public LoginVO(){
		
	}
	
	public LoginVO(String token, String fecha_ini, String fecha_fin, AdministradorVO admin){
		this.token = token;
		this.fecha_ini = fecha_ini;
		this.fecha_fin = fecha_fin;
		this.Admin = admin;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the fecha_ini
	 */
	public String getFecha_ini() {
		return fecha_ini;
	}

	/**
	 * @param fecha_ini the fecha_ini to set
	 */
	public void setFecha_ini(String fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	/**
	 * @return the fecha_fin
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}

	/**
	 * @param fecha_fin the fecha_fin to set
	 */
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	/**
	 * @return the admin
	 */
	public AdministradorVO getAdmin() {
		return Admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(AdministradorVO admin) {
		Admin = admin;
	}
	
	
}

package domain;

public class AdministradorVO {

	
	private String user;
	private String password;
	
	
	public AdministradorVO(){
		
	}


	/**
	 * @param user
	 * @param password
	 */
	public AdministradorVO(String user, String password) {
		this.user = user;
		this.password = password;
	}


	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

package domain;

public class ServicioVO {

	private String tipo_servicio;
	private int valor_fijo;
	private int valor_unitario;
	
	public ServicioVO(){
		
	}
	
	public ServicioVO(String tipo_servicio, int valor_fijo, int valor_unitario) {
		this.tipo_servicio = tipo_servicio;
		this.valor_fijo = valor_fijo;
		this.valor_unitario = valor_unitario;
	}

	/**
	 * @return the tipo_servicio
	 */
	public String getTipo_servicio() {
		return tipo_servicio;
	}

	/**
	 * @param tipo_servicio the tipo_servicio to set
	 */
	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	/**
	 * @return the valor_fijo
	 */
	public int getValor_fijo() {
		return valor_fijo;
	}

	/**
	 * @param valor_fijo the valor_fijo to set
	 */
	public void setValor_fijo(int valor_fijo) {
		this.valor_fijo = valor_fijo;
	}

	/**
	 * @return the valor_unitario
	 */
	public int getValor_unitario() {
		return valor_unitario;
	}

	/**
	 * @param valor_unitario the valor_unitario to set
	 */
	public void setValor_unitario(int valor_unitario) {
		this.valor_unitario = valor_unitario;
	}
	
	
	
	
}

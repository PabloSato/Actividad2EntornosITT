package calculadora;
/**
 * Clase <b>Resta</b>
 * 
 * 
 * @author Antonio Garrido Carranza
 * @version 1.1
 * @see Resta
 * 
 * 
 */

public class Resta {

	private double resultado;
	private float acumulado;
	
	
	
	/**
	 * Este metodo devuelve el resultado de la resta.
	 * 
	 * 
	 * @return devuelve el resultado.
	 * 
	 *
	 *  
	 */
	public double getResultado() {
		return resultado;
	}
	
	
	
	
	
	/**
	 * Este metodo devuelve el acumulado de la resta.
	 * 
	 * 
	 * @return devuelve el acumulado.
	 *
	 *  
	 */
	//ESTE METODO NO EST� EN USO-------------------------------------------------------
	public double getAcumulado() {
		return acumulado;
	} 
	
	
	
	/**
	 * Este metodo almacena los acumulados
	 * 
	 * @param acumulado guarda lo acumulado de otra operaciones
	 * @param valor el nuevo resultado de la operacion, que se agrega al acumulado
	 * 
	 * 
	 * 
	 * @throws IllegalArgumentException -La calculadora
	 *  <b>no</b> admite <b>numeros negativos</b>
	 *  
	 */
	// metodo para almacenar los acumulados
	protected void setAcumulador (double valor) {
		acumulado += valor;
	}
	
	
	
	/**
	 * Este metodo muestra el acumulado
	 * 
	 * 
	 * 
	 * @return devuelve el acumulado.
	 * 
	 * 
	 *  
	 */
	//metodo para mostrar al exterior el acumulado
	public double getAcumulador() {
		return this.acumulado;
	}
	
	
	
	/**
	 * Este metodo realiza la <b>resta</b> de <b>dos</b> numeros reales.
	 * 
	 * @param a representa el <b>primer</b> numero <b>real</b> a restar
	 * @param b representa el <b>segundo</b> numero <b>real</b> a restar
	 * 
	 * 
	 * 
	 * @throws IllegalArgumentException - La calculadora
	 *  <b>no</b> admite <b>números negativos</b>
	 *  
	 */
	public void setReales2 (double a, double b) {
		resultado = a - b;
		setAcumulador(resultado);
	}
	
	
	
	/**
	 * Este metodo realiza la <b>resta</b> de <b>tres</b> numeros reales.
	 * 
	 * @param a representa el <b>primer</b> numero <b>real</b> a restar
	 * @param b representa el <b>segundo</b> numero <b>real</b> a restar
	 * @param c representa el <b>tercer</b> numero <b>real</b> a restar
	 * 
	 * 
	 * 
	 * @throws IllegalArgumentException - La calculadora
	 *  <b>no</b> admite <b>números negativos</b>
	 *  
	 */
	public void setReales3 (double a, double b, double c) {
		resultado = a - b - c;
		setAcumulador(resultado);
	}
	
	
	
	/**
	 * Este metodo realiza la <b>resta</b> de <b>dos</b> numeros enteros.
	 * 
	 * @param a representa el <b>primer</b> numero <b>entero</b> a restar.
	 * @param b representa el <b>segundo</b> numero <b>entero</b> a restar.
	 * 
	 * 
	 * 
	 * @throws IllegalArgumentException - La calculadora
	 *  <b>no</b> admite <b>números negativos</b>
	 *  
	 */
	 public void setEnteros (int a, int b) {
		 resultado = a - b;
		 setAcumulador((double)resultado);
	 }

	@Override
	public String toString() {
		return "Resta [resultado=" + resultado + ", acumulado=" + acumulado + "]";
	}
	
	
	
}

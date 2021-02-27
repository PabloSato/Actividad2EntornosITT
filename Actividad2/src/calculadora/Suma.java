package calculadora;

/**
 * Clase <b>Suma</b> contiene una serie de metodos que realizan operaciones b�sicas num�ricas de suma entre 2 o 3 n�meros.
 * Cuenta con los m�todos sumaDosReales que realiza la suma de dos n�meros reales y devuelve el resultado. El m�todo
 * sumaDosEnteros que realiza la suma de dos n�meros enteros y devuelve el resultado. El m�todo sumaTresREales
 * que realiza la suma de tres n�meros reales y devuelve el resultado.
 * Adem�s cuenta con un m�todo que no devuelve nada alguno pero que acumula el valor a�adido.
 * 
 * 
 * 
 * @author Pablo Fern�ndez Sato
 * @version 1.0
 * @see Suma
 *
 */
public class Suma {

	/**
	 * Este m�todo realiza la <b>suma</b> de <b>dos</b> n�meros <b>reales</b>.
	 * 
	 * @param num1 representa el <b>primer</b> n�mero <b>real</b> a sumar.
	 * @param num2 representa el <b>segundo</b> n�mero <b>real</b> a sumar.
	 * 
	 * @return devuelve la <b>suma</b> de <b>ambos</b> n�meros.
	 * 
	 */
	public double sumaDosReales(double num1, double num2) {

		return num1 + num2;
	}
	

	/**
	 * Este m�todo realiza la <b>suma</b> de <b>dos</b> n�meros <b>enteros</b>.
	 * 
	 * @param num1 representa el <b>primer</b> n�mero <b>entero</b> a sumar.
	 * @param num2 representa el <b>segundo</b> n�mero <b>entero</b> a sumar.
	 * 
	 * @return devuelve la <b>suma</b> de <b>ambos</b> n�meros.
	 * 
	 */
	public int sumaDosEnteros(int num1, int num2) {

		return num1 + num2;
	}

	/**
	 * Este m�todo realiza la <b>suma</b> de <b>tres</b> n�meros <b>reales</b>.
	 * 
	 * @param num1 representa el <b>primer</b> n�mero <b>real</b> a sumar.
	 * @param num2 representa el <b>segundo</b> n�mero <b>real</b> a sumar.
	 * @param num3 representa el <b>tercer</b> n�mero <b>real</b> a sumar.
	 * 
	 * @return devuelve la <b>suma</b> de los <b>tres</b> n�meros.
	 * 
	 */
	public double sumaTresReales(double num1, double num2, double num3) {

		return num1 + num2 + num3;
	}

	/**
	 * ESte metodo recibe <b>un</b> valor de <b>entrada</b> y lo va
	 * <b>acumulando</b>
	 * 
	 * @param num representa el <b>valor</b> de entrada. Es un numero <b>entero</b>.
	 * 
	 *            Este metodo <b>no</b> devuelve valor.
	 * 
	 */
	public void valorAcumulado(int num) {

		int valorAcumulado = +num;
		
	}
	
	/**
	 * ESte metodo recibe <b>un</b> valor de <b>entrada</b> y lo va
	 * <b>acumulando</b>
	 * 
	 * @param num representa el <b>valor</b> de entrada. Es un numero <b>entero</b>.
	 * @param acumulado representa el <b>valor acumulado</b> de los enteros introducidos.
	 * 
	 * @author Sergio Gomez
	 * @since 27/02/21
	 * 
	 */
	
	public int valorAcumulado(int acumulado, int num) {
		
		acumulado =+ num;
		return acumulado;
		
	}
	
}

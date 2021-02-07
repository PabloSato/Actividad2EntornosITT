package calculadora;

/**
 * Clase <b>Suma</b> contiene una serie de metodos que realizan operaciones básicas numéricas de suma entre 2 o 3 números.
 * Cuenta con los métodos sumaDosReales que realiza la suma de dos números reales y devuelve el resultado. El método
 * sumaDosEnteros que realiza la suma de dos números enteros y devuelve el resultado. El método sumaTresREales
 * que realiza la suma de tres números reales y devuelve el resultado.
 * Además cuenta con un método que no devuelve nada alguno pero que acumula el valor añadido.
 * 
 * 
 * 
 * @author Pablo Fernández Sato
 * @version 1.0
 * @see Suma
 *
 */
public class Suma {

	/**
	 * Este método realiza la <b>suma</b> de <b>dos</b> números <b>reales</b>.
	 * 
	 * @param num1 representa el <b>primer</b> número <b>real</b> a sumar.
	 * @param num2 representa el <b>segundo</b> número <b>real</b> a sumar.
	 * 
	 * @return devuelve la <b>suma</b> de <b>ambos</b> números.
	 * 
	 */
	public double sumaDosReales(double num1, double num2) {

		return num1 + num2;
	}

	/**
	 * Este método realiza la <b>suma</b> de <b>dos</b> números <b>enteros</b>.
	 * 
	 * @param num1 representa el <b>primer</b> número <b>entero</b> a sumar.
	 * @param num2 representa el <b>segundo</b> número <b>entero</b> a sumar.
	 * 
	 * @return devuelve la <b>suma</b> de <b>ambos</b> números.
	 * 
	 */
	public int sumaDosEnteros(int num1, int num2) {

		return num1 + num2;
	}

	/**
	 * Este método realiza la <b>suma</b> de <b>tres</b> números <b>reales</b>.
	 * 
	 * @param num1 representa el <b>primer</b> número <b>real</b> a sumar.
	 * @param num2 representa el <b>segundo</b> número <b>real</b> a sumar.
	 * @param num3 representa el <b>tercer</b> número <b>real</b> a sumar.
	 * 
	 * @return devuelve la <b>suma</b> de los <b>tres</b> números.
	 * 
	 */
	public double sumaTresReales(double num1, double num2, double num3) {

		return num1 + num2 + num3;
	}

	public void valorAcumulado(int num) {

		int valorAcumulado = +num;
	}

}

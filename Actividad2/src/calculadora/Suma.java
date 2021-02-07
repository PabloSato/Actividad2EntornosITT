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

	public double sumaDosReales(double num1, double num2) {

		return num1 + num2;
	}

	public int sumaDosEnteros(int num1, int num2) {

		return num1 + num2;
	}

	public double sumaTresReales(double num1, double num2, double num3) {

		return num1 + num2 + num3;
	}

	public void valorAcumulado(int num) {

		int valorAcumulado = +num;
	}

}

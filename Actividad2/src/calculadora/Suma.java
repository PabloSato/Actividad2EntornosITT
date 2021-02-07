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

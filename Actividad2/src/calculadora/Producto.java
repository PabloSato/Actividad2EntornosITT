package calculadora; 
/**
 * Esta clase realiza el producto de los siguientes n�meros:
 * enteros, reales, 3 reales y la potencia.
 * Contiene cuatro m�todos que realizan las siguientes operaciones:
 * producto con dos enteros
 * @author: Rub�n de Pablo G�mez 1� DAW
 * @since 24/01/2021
 * @retun: El resultado del producto se devolvera mediante la variable soluci�n.
 * @version:1.0
 */

public class Producto {
	/**
	 * Este metodo realiza el <b>producto</b> de dos <b>numeros reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicaci�n.
	 * @param num2 es el segundo valor real que se introduce para la multiplicaci�n
	 * @return devuelve el <b>producto</b> de <b>ambos</b> n�meros introducidos 
	 * as� como su potencia
	 * @author Rub�n de Pablo G�mez 1� DAW
	 * @since 24/01/2921
	 * @version 1.0
	 */
	//Producto de 2 n�meros reales
	public float productoDosReales(float num1, float num2) {
		float solucion = num1 * num2;
		return solucion;
	}
	/**
	 * Este m�todo realiza el <b>producto</b>de dos <b>n�meros enteros</b>.
	 * @param num1 es el primer valor entero que se introduce para la multiplicaci�n.
	 * @param num2 es el segundo valor entero que se introduce para la multiplicaci�n.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> n�meros enteros
	 * @author Rub�n de Pablo G�mez 1� DAW
	 * @since 24/01/2021
	 * @version 1.0
	 */
	//Producto de 2 n�meros enteros
	public int productoDosEnteros(int num1, int num2) {
		int solucion = num1 * num2;
		return solucion;
	}
	/**
	 * Este m�todo realiza el <b>producto</b>de tres <b>n�meros reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicaci�n.
	 * @param num2 es el segundo valor real que se introduce para la multiplicaci�n.
	 * @param num3 es el tercer valor real que se introduce para la multiplicaci�n.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> n�meros reales
	 * @author Rub�n de Pablo G�mez 1� DAW
	 * @since 24/01/2021
	 * @version 1.0
	 */
	//Producto de 3 n�meros reales
	public float productoTresReales(float num1, float num2, float num3) {
		float solucion = num1 * num2 * num3;
		return solucion;
	}
	/**
	 * Este m�todo realiza la <b>potencia</b>de dos <b>n�meros</b>.
	 * @param num1 es el primer valor que se introduce que ser� la base y ser� de tipo double.
	 * @param num2 es el segundo valor que se introduce que ser� el exponente y ser� de tipo double.
	 * @return devuelve la <b>potencia</b> de <b>ambos</b> n�meros.
	 * @author Rub�n de Pablo G�mez 1� DAW
	 * @since 24/01/2021
	 * @version 1.0
	 */
	//Potencia: num2 nunca puede ser 0
	public double potenciaDouble(double num1, double num2) {
		double solucion = Math.pow(num1, num2);
		if (num2 == 0) {//El exponente no puede ser 0
			System.out.println("El exponente no puede ser 0");
		}
		if (num1 >1000 && num2>100){//Base y exponente no pueden ser demasiado altos
			System.out.println("Introduzca num1 menor de 1000");
			System.out.println("Introduzca num2 menor que 100");
		}
		return solucion;
	}
	
	

}

package calculadora; 
/**
 * Esta clase realiza el producto de los siguientes números:
 * enteros, reales, 3 reales y la potencia.
 * Contiene cuatro métodos que realizan las siguientes operaciones:
 * producto con dos enteros
 * @author: Rubén de Pablo Gómez 1º DAW
 * @since 24/01/2021
 * @retun: El resultado del producto se devolvera mediante la variable solución.
 * @version:1.0
 */

public class Producto {
	/**
	 * Este metodo realiza el <b>producto</b> de dos <b>numeros reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicación.
	 * @param num2 es el segundo valor real que se introduce para la multiplicación
	 * @return devuelve el <b>producto</b> de <b>ambos</b> números introducidos 
	 * así como su potencia
	 * @author Rubén de Pablo Gómez 1º DAW
	 * @since 24/01/2921
	 * @version 1.0
	 */
	//Producto de 2 números reales
	public float productoDosReales(float num1, float num2) {
		float solucion = num1 * num2;
		return solucion;
	}
	/**
	 * Este método realiza el <b>producto</b>de dos <b>números enteros</b>.
	 * @param num1 es el primer valor entero que se introduce para la multiplicación.
	 * @param num2 es el segundo valor entero que se introduce para la multiplicación.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> números enteros
	 * @author Rubén de Pablo Gómez 1º DAW
	 * @since 24/01/2021
	 * @version 1.0
	 */
	//Producto de 2 números enteros
	public int productoDosEnteros(int num1, int num2) {
		int solucion = num1 * num2;
		return solucion;
	}
	/**
	 * Este método realiza el <b>producto</b>de tres <b>números reales</b>.
	 * @param num1 es el primer valor real que se introduce para la multiplicación.
	 * @param num2 es el segundo valor real que se introduce para la multiplicación.
	 * @param num3 es el tercer valor real que se introduce para la multiplicación.
	 * @return devuelve el <b>producto</b> de <b>ambos</b> números reales
	 * @author Rubén de Pablo Gómez 1º DAW
	 * @since 24/01/2021
	 * @version 1.0
	 */
	//Producto de 3 números reales
	public float productoTresReales(float num1, float num2, float num3) {
		float solucion = num1 * num2 * num3;
		return solucion;
	}
	/**
	 * Este método realiza la <b>potencia</b>de dos <b>números</b>.
	 * @param num1 es el primer valor que se introduce que será la base y será de tipo double.
	 * @param num2 es el segundo valor que se introduce que será el exponente y será de tipo double.
	 * @return devuelve la <b>potencia</b> de <b>ambos</b> números.
	 * @author Rubén de Pablo Gómez 1º DAW
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

package calculadora;

/**
 * Esta clase realiza las siguientes cuatro operaciones: division con numero entero, 
 * division con decimales, inverso de un numero real y raiz cuadrada.
 * Contiene cuatro metodos que realizan las distintas operaciones algoritmicas y otros  
 * tres metodos que devuelven unicamente el valor de las operaciones realizadas. 
 * 
 * @author Sergio&Jorge
 * @since  24/01/2021
 * 
 */

public class Cociente {
	
	//declara los resultados de la clase Cociente
	private int resultado;
	private double resultadoDouble;
	private double resultadoRaiz;
	private double resultadoInverso;
	
	//metodo constructor  
	public Cociente() {

	this.resultado = 0;
	this.resultadoDouble = 0.0;
	this.resultadoRaiz = 0.0;
	this.resultadoInverso = 0.0;
		
	}

/** 
 * Este metodo realiza la <b>division<b> de dos <b>numeros enteros<b>.
 * 
 * @param operando1 es el primer valor entero que se introduce para la realizacion de la division. 
 * @param operando2 es el segundo valor entero introducido a dividir. 
 * @param resultado es el total de la operacion algoritmica, que devuelve un numero entero.
 * @return la division de ambos numeros.
 * 
 * @exception 
 * Se ejecutara el metodo siempre y cuando el resto de la division sea 0 y en caso
 * de introducir valor mayor, o igual a 0 (a los operandos). Para ello se emplea los condicionales if.
 * 
 * @author Sergio&Jorge
 * @since 24/01/2021
 * 
 */
			
		public int division (int operando1, int operando2) {


				
			//condicionales divisor distinto de 0 y resto 0 para resultado igual a numero entero
			if (operando1 % operando2 == 0) {
			if ((operando1 > 0) && (operando2 > 0)) { 
			
			resultado = operando1 / operando2;//asigna un valor a la variable resultado
			
					
				
		}
			
	}
			return resultado;//devuelve la varible resultado 		
}		
	

/** 
 * Este metodo realiza la <b>division<b> de <b>dos numeros reales<b>.
 * 
 * @param operando1 es el primer valor real que se introduce para la realizacion de la division. 
 * @param operando2 es el segundo valor real que se introduce para la division. 
 * @param resultado es el total de la operacion algoritmica. El resultado sera un numero real.
 * @return la division de ambos numeros.
 * 
 * @exception
 * Se ejecutara el metodo en caso de que se cumpla la siguiente condicion: 
 * Valor mayor, o igual a 0.
 * 
 * @author Sergio&Jorge
 * @since 27/01/2021
 * 
 */
		
		public double divisionDecimales (double operando1, double operando2) {

				    
			//condicional divisor distinto de 0 
			if ((operando1 > 0) && (operando2 > 0)) { 
	
			resultadoDouble = operando1 / operando2;//asigna un valor a la variable resultado							
					
	}
			return resultadoDouble;//devuelve la varible resultado 			
}

/** 
 * Este metodo realiza la <b>raiz cuadrada de un numero entero<b>.
 * 
 * @param operando es el valor entero introducido para la realizacion de la raiz cuadrada. 
 * @param resultadoRaiz variable que se le asigna el resultado real de la raiz cuadrada. 
 * @param Math.sqrt se utiliza para la realizacion de la raiz cuadrada. 
 * 
 * @return numero real resultante de la raiz de numero entero.
 * 
 * @author Sergio&Jorge
 * @since 27/01/2021
 * 
 */
		
		public double raiz (int operando1) {
				
				resultadoRaiz = Math.sqrt((double)operando1);//raiz cuadrada de operando con metodo Math
				return resultadoRaiz;//retorna el resultado de raiz
				
		}

/** 
 * Este metodo realiza el <b>numero inverso de un numero real<b> introducido.
 * 
 * @param operando1 asigna un numero real a la variable, que se introduce para la realizacion del metodo inverso. 
 * @return resultado es el total de la operacion algoritmica, devuelve un numero real.
 * 
 * @exception
 * El metodo se realizara siempre y cuando el operando sea distinto a 0.
 * Para ello se emplea la condicion if.
 * 
 * @author Sergio&Jorge
 * @since 27/01/2021
 * 
 */

		public double inverso (double operando1) {
		

			if (operando1 != 0) {//condicion del operando 
				
				resultadoInverso = 1 / operando1;//asignacion de valor a la variable resultado 
				
				
		}
			return resultadoInverso;//retorna la variable resultado
			
	}
	
/** 
 * Este metodo realiza la consulta del <b>resultado<b> obtenido de la
 * <b>division de dos numeros enteros<b>
 *  
 * @return Resultado de la division con enteros.
 * 
 * @author Sergio
 * @since 06/02/2021
 * 
 */		
		
		String consultar() {
			
			return("El resultado de la division con dos numeros enteros es: " + this.resultado);
			
		}
		
/** 
 * Este metodo realiza la consulta del <b>resultado<b> obtenido de la
 * <b>division de dos numeros reales<b>
 *  
 * @return Resultado de la division con dos numeros reales
 * 
 * @author Sergio
 * @since 06/02/2021
 * 
 */	
		
		public String consultarDouble() {
			
			return("El resultado de la division con dos numeros reales es: " + this.resultadoDouble);
			
		}
		
/** 
 * Este metodo realiza la <b>raiz<b> de <b>un numero real<b>
 *  
 * @return Resultado de la raiz con numero real
 * 
 * @author Sergio	
 * @since 06/02/2021
 * 
 */		
		
		public String consultarRaiz() {
			
			return("El resultado de la raiz de dos numeros reales es: " + this.resultadoRaiz);
			
		}
		
/** 
 * Este metodo realiza el <b>inverso<b> de <b>un numero real<b>
 *  
 * @return Resultado del inverso con numero real
 * 
 * @author Sergio	
 * @since 06/02/2021
 * 
 */		
				
		public String consultarInverso() {
					
			return("El resultado del inverso de un numero entero es: " + this.resultadoInverso);
					
		}

	
	}	
		


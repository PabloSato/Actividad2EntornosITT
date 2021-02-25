package calculadora;

public class cocienteJorge {

	/**
	 * La clase cocienteJorge puede realizar las siguientes cuatro operaciones: 
	 *-Division con numero entero
	 *-Division con decimales 
	 *-Inverso de un numero real 
	 *-Raiz cuadrada.
	 *Contiene cuatro metodos que realizan las distintas operaciones algoritmicas y otros  
	 * tres metodos que devuelven unicamente el valor de las operaciones realizadas (numero entero, 
	 * o real). 
	 * 
	 * @author Jorge García
	 * @since  14/02/2021
	 *
	 */

	

	private int resultado2;
	private double resultadoDouble2;
	private double resultadoRaiz2;
	private double resultadoInverso2;
	
	/** 
	 * Este metodo le atribuimos parametros a las variables para que esten inicializadas, dando valor
	 * 0 a los de tipo entero y 0.0 a los de tipo Real
	 * 
	 * @author Jorge García
	 * @since 14/02/2021
	 * 	
	 */

	public cocienteJorge() {

	this.resultado2 = 0;
	this.resultadoDouble2= 0.0;
	this.resultadoRaiz2 = 0.0;
	this.resultadoInverso2 = 0.0;
		
	}

	/** 
	 * Este metodo realiza la <b>division<b> de dos <b>numeros enteros<b>.
	 * 
	 * @param operando1 es el primer valor entero que se introduce para la realizacion de la division. 
	 * @param operando2 es el segundo valor entero introducido a dividir. 
	 * @param resultado es el total de la operacion entre el operando1 y operando2, que devuelve un 
	 * 		  numero entero.
	 * @return la division entre ambos numeros.
	 * 
	 * @exception 
	 * Se ejecutara el metodo siempre y cuando el resto de la division sea 0 y en caso
	 * de introducir valor mayor, o igual a 0 (a los operandos). Para ello se emplea los condicionales if.
	 * 
	 * @author Sergio y Jorge
	 * @since 24/01/2021
	 * 
	 */

		public int division2 (int operando1, int operando2) {


			
			if (operando1 % operando2 == 0) {
			if ((operando1 > 0) && (operando2 > 0)) { 
			
			resultado2 = operando1 / operando2;
			
					
				
		}
			
	}
			return resultado2;		
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
		 * Valor mayor o igual a 0.
		 * 
		 * @author Sergio&Jorge
		 * @since 27/01/2021
		 * 
		 */
		
		public double divisionDecimales2 (double operando1, double operando2) {

				    
			
			if ((operando1 > 0) && (operando2 > 0)) { 
	
			resultadoDouble2 = operando1 / operando2;						
					
	}
			return resultadoDouble2;		
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
		
		public double raiz2 (int operando1) {
				
				resultadoRaiz2 = Math.sqrt((double)operando1);
				return resultadoRaiz2;
				
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
		
		
		public double inverso2 (double operando1) {
		

			if (operando1 != 0) {
				
				resultadoInverso2 = 1 / operando1;
				
				
		}
			return resultadoInverso2;
			
	}
	
		
		/** 
		 * Este metodo se encarga de la consulta y devolucion del <b>resultado<b> resultante de la
		 * <b>division de los dos numeros enteros introducidos<b>
		 *  
		 * @return la division con nº enteros.
		 * 
		 * @author Jorge
		 * @since 14/02/2021
		 * 
		 */	

		
		String consultar2() {
			
			return("El resultado de la division con dos numeros enteros es: " + this.resultado2);
			
		}

		/** 
		 * Este metodo se encarga de la consulta y devolucion del <b>resultado<b> obtenido de la
		 * <b>division de los dos numeros reales introducidos<b>
		 *  
		 * @return la division de los dos numeros reales
		 * 
		 * @author Jorge 
		 * @since 14/02/2021
		 * 
		 */	
		
		public String consultarDouble2() {
			
			return("El resultado de la division con dos numeros reales es: " + this.resultadoDouble2);
			
		}
		

		/** 
		 * Este metodo se encarga de realizar la <b>raiz<b> de <b>un numero real<b>
		 *  
		 * @return la raiz con numero real
		 * 
		 * @author Jorge	
		 * @since 14/02/2021
		 * 
		 */
		
		public String consultarRaiz2() {
			
			return("El resultado de la raiz de dos numeros reales es: " + this.resultadoRaiz2);
			
		}
		

		/** 
		 * Este metodo se encarga de realizar el <b>inverso<b> de <b>un numero real<b>
		 *  
		 * @return  del inverso con numero real
		 * 
		 * @author Jorge	
		 * @since 14/02/2021
		 * 
		 */
		
		public String consultarInverso2() {
					
			return("El resultado del inverso de un numero entero es: " + this.resultadoInverso2);
					
		}

	
	}	
						//
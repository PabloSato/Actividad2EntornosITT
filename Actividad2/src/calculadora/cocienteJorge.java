package calculadora;

public class cocienteJorge {



	

	private int resultado2;
	private double resultadoDouble2;
	private double resultadoRaiz2;
	private double resultadoInverso2;
	

	public cocienteJorge() {

	this.resultado2 = 0;
	this.resultadoDouble2= 0.0;
	this.resultadoRaiz2 = 0.0;
	this.resultadoInverso2 = 0.0;
		
	}


		public int division2 (int operando1, int operando2) {


			
			if (operando1 % operando2 == 0) {
			if ((operando1 > 0) && (operando2 > 0)) { 
			
			resultado2 = operando1 / operando2;
			
					
				
		}
			
	}
			return resultado2;		
}		
	


		
		public double divisionDecimales2 (double operando1, double operando2) {

				    
			
			if ((operando1 > 0) && (operando2 > 0)) { 
	
			resultadoDouble2 = operando1 / operando2;						
					
	}
			return resultadoDouble2;		
}


		
		public double raiz2 (int operando1) {
				
				resultadoRaiz2 = Math.sqrt((double)operando1);
				return resultadoRaiz2;
				
		}

		public double inverso2 (double operando1) {
		

			if (operando1 != 0) {
				
				resultadoInverso2 = 1 / operando1;
				
				
		}
			return resultadoInverso2;
			
	}
	

		
		String consultar2() {
			
			return("El resultado de la division con dos numeros enteros es: " + this.resultado2);
			
		}

		
		public String consultarDouble2() {
			
			return("El resultado de la division con dos numeros reales es: " + this.resultadoDouble2);
			
		}
		

		
		public String consultarRaiz2() {
			
			return("El resultado de la raiz de dos numeros reales es: " + this.resultadoRaiz2);
			
		}
		

				
		public String consultarInverso2() {
					
			return("El resultado del inverso de un numero entero es: " + this.resultadoInverso2);
					
		}

	
	}	
package calculadora;

import calculadora.Producto;

/*
 * Esta clase realiza consultas mediante los metodos de las distintas clases:
 * Suma, Resta, Producto y Cociente.
 * 
 * @since 07/02/2021
 *  
 */

public class Main {
	
	
	public static void main(String[] args) {
		
		//METODOS DE LA CLASE COCIENTE
		Cociente coc = new Cociente();//crea objeto de la clase Cociente
		coc.divisionDecimales(10.2,0.50);
		System.out.println(coc.consultarDouble());
		System.out.println("***************************");
		Cociente coc2 = new Cociente();//crea objeto de la clase Cociente
		coc2.division(6, 3);
		System.out.println(coc2.consultar());
		System.out.println("***************************");
		coc2.raiz(8);
		System.out.println(coc2.consultarRaiz());
		System.out.println("***************************");
		coc2.inverso(2);
		System.out.println(coc2.consultarInverso());
		
		//METODOS DE LA CLASE SUMA
		Suma suma = new Suma();
		System.out.println(suma.sumaDosReales(4, 5));
		System.out.println(suma.sumaDosEnteros(7, 6));
		System.out.println(suma.sumaTresReales(10, 20, 30));
		suma.valorAcumulado(10);
		suma.valorAcumulado(20);
		
		//METODOS DE LA CLASE RESTA
		Resta resta = new Resta();
		resta.setReales2(4, 6);
		System.out.println(resta.toString());
		resta.setReales3(7, 2, 1);
		System.out.println(resta.toString());
		resta.setEnteros(10, 5);
		System.out.println(resta.toString());
		
		//METODOS DE LA CLASE COCIENTEJORGE
		cocienteJorge cocJ = new cocienteJorge();
		cocJ.divisionDecimales2(40.50,0.75);
		System.out.println(cocJ.consultarDouble2());
		System.out.println("***************************");
		cocienteJorge cocJ1 = new cocienteJorge();
		cocJ1.division2(8, 4);
		System.out.println(cocJ1.consultar2());
		System.out.println("***************************");
		cocJ1.raiz2(81);
		System.out.println(cocJ1.consultarRaiz2());
		System.out.println("***************************");
		cocJ1.inverso2(8);
		System.out.println(cocJ1.consultarInverso2());
		
		//METODOS AÑADIDOS POR RUBEN
		Producto producto = new Producto();
		System.out.println(producto.productoDosReales(4, 5));
		System.out.println(producto.productoDosEnteros(7, 6));
		System.out.println(producto.productoTresReales(10, 20, 30));
		System.out.println(producto.potenciaDouble(50,40));				
	}
	
}

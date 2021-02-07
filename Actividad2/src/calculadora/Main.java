package calculadora;

public class Main {

	public static void main(String[] args) {
		
		
		Cociente coc = new Cociente();
		coc.divisionDecimales(10.2,0.50);
		System.out.println(coc.consultarDouble());
		System.out.println("***************************");
		Cociente coc2 = new Cociente();
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

	}
	
}

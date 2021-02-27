package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Suma;

class test_Suma {
	
	private Suma sum1;

	/**
	 * Pruebas unitarias de la clase Suma
	 * 
	 * @author Sergio Gomez 
	 * @since 21/02/2021
	 * 
	 */
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
		System.out.println("Empezando tests");
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
		System.out.println("Siguiente test");
		
	}
	
	@BeforeEach
	void setUp() throws Exception{
		sum1 = new Suma();//Creacion de objeto antes de cada test
	}
	
	@AfterEach
	void tearDown() throws Exception{
		sum1 = null;//Al final de cada test se pasa a null el objeto creado
	}
	
	@Test
	void testSumaEnteros() {
		
		//Se realizan los test para suma de dos enteros.
		//Comprueba que el numero dado es entero.
		assertEquals(4, sum1.sumaDosEnteros(2, 2));
		assertNotEquals(1, sum1.sumaDosEnteros(1, 2));
		assertNotEquals(1.1, sum1.sumaDosEnteros(1, 1));
		assertNotEquals(-6.2, sum1.sumaDosEnteros(2, 2));
		assertNotEquals(-2, sum1.sumaDosEnteros(1, 1));
		
	}
	
	@Test
	void testSumaDosReales() {
		
		//Test para la devolucion de la suma de un numero real. 
		//Para ello se comprueba que el resultado no sea igual a un numero negativo, o entero. 
		//Y que efectivamente se produzca la suma de dos reales.
		assertEquals(2.2, sum1.sumaDosReales(1.1, 1.1));
		assertNotEquals(1.4, sum1.sumaDosReales(1.2, 1.1));
		assertNotEquals(4, sum1.sumaDosReales(3.1, 2.2));
		assertNotEquals(-6, sum1.sumaDosReales(2, 2));
		assertNotEquals(-2.2, sum1.sumaDosReales(1.2, 1.2));
		
	}
	
	@Test
	void testSumaTresReales() {
		
		//Test para la comprobacion de la suma de tres numeros reales. Se contemplan 
		//las casuisticas para que no devuelva un numero que no sea real.
		assertEquals(3.8, sum1.sumaTresReales(1.3, 1.2, 1.3));
		assertNotEquals(3.2, sum1.sumaTresReales(1.5, 2.5, 1.5));
		assertNotEquals(5, sum1.sumaTresReales(1.5, 2.5, 2.5));
		assertNotEquals(-4, sum1.sumaTresReales(1.1, 1.1, 1.1));
		assertNotEquals(-2.5, sum1.sumaTresReales(1.2, 1.2, 1.2));
		
		
	}
	
	@Test
	public void testValorAcumulado() {
		
		//Test para comprobar que se produce la acumulacion de dos numeros enteros. 
		//Y que verdaderamente se usan enteros y no reales.
		assertEquals(4, sum1.valorAcumulado(2, 2));
		assertNotEquals(7, sum1.valorAcumulado(2, 3));
		assertNotEquals(5.5, sum1.valorAcumulado(2, 5));
		assertNotEquals(-2, sum1.valorAcumulado(0, 0));
		assertNotEquals(-2.2, sum1.valorAcumulado(1, 4));
		
	}
	
}

	
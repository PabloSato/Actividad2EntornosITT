package juni5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Cociente;

class Test_Cociente {
	
	private Cociente cociente1;;

	/**
	 * Pruebas Unitarias de la clase Cociente
	 * 
	 * @author pablo Fernández Sato
	 */
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() throws Exception{
		//Creo un nuevo objeto Cociente antes de cada test
		cociente1 = new Cociente();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		//Después de cada Test, paso a null el objeto Cociente creado
		cociente1 = null;
	}

	@Test
	void testDivision() {

		assertEquals(1, cociente1.division(2, 2));
		assertNotEquals(2, cociente1.division(2, 2));
	
		//SE MODIFICA EL CÓDIGO PARA EVITAR ERRORES QUE HAN SURGIDO EN ESTA OPERACION
		assertEquals(0, cociente1.division(0, 2));
		assertNotEquals(2, cociente1.division(0, 2));
		
		//NO PUEDE REALIZAR LA DIVISION CON OPERANDO 2, SALTA UNA EXCEPCION ARITMÉTICA
		//cociente1.division(2, 0);
		assertEquals(0, cociente1.division(1, 2));
		assertNotEquals(0.5, cociente1.division(1, 2));
		
		assertEquals(2, cociente1.division(2, 1));
		assertNotEquals(1, cociente1.division(0, 2));
		
	}
	@Test
	void testDivisionDecimales() {
		
		assertEquals(1.0, cociente1.divisionDecimales(2, 2));
		assertNotEquals(1.5, cociente1.divisionDecimales(2, 2));
		
		assertEquals(0.0, cociente1.divisionDecimales(0, 2));
		assertNotEquals(1.5, cociente1.divisionDecimales(0, 2));
		
		//NO PUEDE REALIZAR LA DIVISION CON OPERANDO 2, SALTA UNA EXCEPCION ARITMÉTICA
		//cociente1.divisionDecimales(2, 0);
		assertEquals(2, cociente1.divisionDecimales(1, 0.5));
		assertNotEquals(1.5, cociente1.divisionDecimales(0, 2));
		
		assertEquals(0.75, cociente1.divisionDecimales(1.5, 2));
		assertNotEquals(1.5, cociente1.divisionDecimales(1.5, 2));
	}

	@Test
	void tesRraiz() {
		
		assertEquals(3, cociente1.raiz(9));
		assertNotEquals(3.5, cociente1.raiz(9));
		
	}
	@Test
	void testInverso() {
		
		assertEquals(0.5, cociente1.inverso(2));
		assertNotEquals(0, cociente1.inverso(2));
		
	}

}

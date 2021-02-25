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
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() throws Exception{
		sum1 = new Suma();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		sum1 = null;
	}
	
	@Test
	void testSumaEnteros() {

		assertEquals(2, sum1.sumaDosEnteros(1,1));		
		assertNotEquals(1, sum1.sumaDosEnteros(0,0));
		
	}
	
}
	
	
	
	
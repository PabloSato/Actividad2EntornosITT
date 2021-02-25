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
<<<<<<< HEAD
	void testSumaEnteros() {

		assertEquals(2, sum1.sumaDosEnteros(1,1));		
=======
<<<<<<< HEAD
	void testAcumulador() {
=======
	void testSumaEnteros() {
>>>>>>> 6cd776c691c4ef5d8c79f2c69841eef4e227f840
		sum1.toString();
		
		assertEquals(2, sum1.sumaDosEnteros(1,1));
		
>>>>>>> b3cd9fe840ed78ea4f093efe1a478c6acd9b54bc
		assertNotEquals(1, sum1.sumaDosEnteros(0,0));
		
	}
	
}
	
	
	
	
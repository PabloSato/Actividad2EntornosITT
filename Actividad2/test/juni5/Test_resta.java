package juni5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Resta;

class Test_resta {
	
	private Resta res1;

	/**
	 * Pruebas Unitarias de la clase Resta
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
		res1 = new Resta();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		
	}
	
	
	@Test
	void testSetReales2() {
		res1.setReales2(2, 1);
		
		assertEquals(1, res1.getResultado());
		assertEquals(1, res1.getAcumulador());
		
		assertNotEquals(2, res1.getResultado());
		assertNotEquals(2, res1.getAcumulador());
		
		res1.setReales2(1, 3);
		
		assertEquals(-2, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		
		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		
		res1.setReales2(-2, 2);
		
		assertEquals(-4, res1.getResultado());
		assertEquals(-5, res1.getAcumulador());
		assertEquals(-5, res1.getAcumulado());
		
		assertNotEquals(4, res1.getResultado());
		assertNotEquals(5, res1.getAcumulador());
		assertNotEquals(5, res1.getAcumulado());
		
		res1.setReales2(2, -2);
		
		assertEquals(4, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());
		
		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
		
		res1.setReales2(-2, -2);
		
		assertEquals(0, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());

		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
		
		res1.setReales2(1000000000, 1000000000);
		
		assertEquals(0, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());

		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
		
		res1.setReales2(-1000000000, -1000000000);
		
		assertEquals(0, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());

		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
		
	}

}

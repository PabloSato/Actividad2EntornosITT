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
		res1 = null;
	}
	
	@Test
	void testAcumulador() {
		res1.toString();
		
		assertEquals(0, res1.getAcumulador());
		
		assertNotEquals(1, res1.getAcumulador());
	}
	
	@Test
	void testAcumulado() {
		res1.toString();
		
		assertEquals(0, res1.getAcumulado());
		
		assertNotEquals(1, res1.getAcumulado());
	}
	
	@Test
	void testResultado() {
		res1.toString();
		
		assertEquals(0, res1.getResultado());
		
		assertNotEquals(1, res1.getResultado());
		
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
	
	@Test
	void setReales3() {
		res1.setReales3(3, 2, 1);
		
		assertEquals(0, res1.getResultado());
		assertEquals(0, res1.getAcumulador());
		assertEquals(0, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		res1.setReales3(3, 3, 3);
		
		assertEquals(-3, res1.getResultado());
		assertEquals(-3, res1.getAcumulador());
		assertEquals(-3, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		res1.setReales3(1, 2, 3);
		
		assertEquals(-4, res1.getResultado());
		assertEquals(-7, res1.getAcumulador());
		assertEquals(-7, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		res1.setReales3(-1, 2, 3);
		
		assertEquals(-6, res1.getResultado());
		assertEquals(-13, res1.getAcumulador());
		assertEquals(-13, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		res1.setReales3(3, -2, 1);
		
		assertEquals(4, res1.getResultado());
		assertEquals(-9, res1.getAcumulador());
		assertEquals(-9, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		res1.setReales3(3, 2, -1);
		
		assertEquals(2, res1.getResultado());
		assertEquals(-7, res1.getAcumulador());
		assertEquals(-7, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(7, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
	}
	
	@Test
	void testEnteros() {
		res1.setEnteros(2, 1);

		assertEquals(1, res1.getResultado());
		assertEquals(1, res1.getAcumulador());
		assertEquals(1, res1.getAcumulado());
		
		assertNotEquals(-1, res1.getResultado());
		assertNotEquals(-1, res1.getAcumulador());
		assertNotEquals(-1, res1.getAcumulado());
		

		res1.setEnteros(1, 2);

		assertEquals(-1, res1.getResultado());
		assertEquals(0, res1.getAcumulador());
		assertEquals(0, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		res1.setEnteros(-2, 1);

		assertEquals(-3, res1.getResultado());
		assertEquals(-3, res1.getAcumulador());
		assertEquals(-3, res1.getAcumulado());
		
		assertNotEquals(3, res1.getResultado());
		assertNotEquals(3, res1.getAcumulador());
		assertNotEquals(3, res1.getAcumulado());

		res1.setEnteros(2, -1);

		assertEquals(3, res1.getResultado());
		assertEquals(0, res1.getAcumulador());
		assertEquals(0, res1.getAcumulado());
		
		assertNotEquals(-3, res1.getResultado());
		assertNotEquals(-1, res1.getAcumulador());
		assertNotEquals(-1, res1.getAcumulado());

		res1.setEnteros(-2, -1);

		assertEquals(-1, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());
		
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
	}
	
	@Test
	void testToString() {
		res1.toString();
		
		//System.out.println(res1.toString());
		assertEquals("Resta [resultado=0.0, acumulado=0.0]", res1.toString());
		
		assertNotEquals("Resta [resultado=0, acumulado=0]", res1.toString());
	}
}

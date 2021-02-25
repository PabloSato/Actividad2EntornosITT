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
		//Creo un nuevo objeto Resta antes de cada test
		res1 = new Resta();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		//Después de cada Test, paso a null el objeto Resta creado
		res1 = null;
	}
	
	@Test
	void testAcumulador() {
		
		//Compruebo el Acumulador. Al no haber recibido ningun valor todavía, me debe devolver 0
		
		assertEquals(0, res1.getAcumulador());
		
		assertNotEquals(1, res1.getAcumulador());
	}
	
	@Test
	void testAcumulado() {
		

		//Compruebo el Acumulador. Al no haber recibido ningun valor todavía, me debe devolver 0
		
		assertEquals(0, res1.getAcumulado());
		
		assertNotEquals(1, res1.getAcumulado());
	}
	
	@Test
	void testResultado() {

		//Compruebo el Resultado. Al no haber recibido ningun valor todavía, me debe devolver 0
		
		assertEquals(0, res1.getResultado());
		
		assertNotEquals(1, res1.getResultado());
		
	}
	
	@Test
	void testSetReales2() {

		//Paso como parámetros dos valores reales positivo (el primero mayor)
		res1.setReales2(2.5, 1.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(1, res1.getResultado());
		assertEquals(1, res1.getAcumulador());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(2, res1.getResultado());
		assertNotEquals(2, res1.getAcumulador());

		//Paso como parámetros dos valores reales positivo (el segundo mayor)
		res1.setReales2(1.5, 3.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-2, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());

		//Paso como parámetros dos valores reales, el primero negativo y el segundo positivo
		res1.setReales2(-2.5, 2.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-5, res1.getResultado());
		assertEquals(-6, res1.getAcumulador());
		assertEquals(-6, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(4, res1.getResultado());
		assertNotEquals(5, res1.getAcumulador());
		assertNotEquals(5, res1.getAcumulado());

		//Paso como parámetros dos valores reales, el primero positivo y el segundo negativo
		res1.setReales2(2.5, -2.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(5, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(2, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros dos valores reales, ambos negativos
		res1.setReales2(-2.5, -2.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(0, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
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
		
		//Paso como parámetros tres valores reales positivo (el primero mayor)
		res1.setReales3(3.5, 2.5, 1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(0, res1.getResultado());
		assertEquals(0, res1.getAcumulador());
		assertEquals(0, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros tres valores reales positivo (el primero y el último mayor que el medio)
		res1.setReales3(3.5, 3, 3.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-3, res1.getResultado());
		assertEquals(-3, res1.getAcumulador());
		assertEquals(-3, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros tres valores reales positivo (el último mayor)
		res1.setReales3(1, 2.5, 3.5);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-5, res1.getResultado());
		assertEquals(-8, res1.getAcumulador());
		assertEquals(-8, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros tres valores reales positivo (el primero negativo)
		res1.setReales3(-1, 2, 3);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-6, res1.getResultado());
		assertEquals(-14, res1.getAcumulador());
		assertEquals(-14, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros tres valores reales positivo (el medio negativo)
		res1.setReales3(3, -2, 1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(4, res1.getResultado());
		assertEquals(-10, res1.getAcumulador());
		assertEquals(-10, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros tres valores reales positivo (el último negativo)
		res1.setReales3(3, 2, -1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(2, res1.getResultado());
		assertEquals(-8, res1.getAcumulador());
		assertEquals(-8, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(7, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
	}
	
	@Test
	void testEnteros() {

		//Paso como parámetros dos valores enteros positivo (el primero mayor)
		res1.setEnteros(2, 1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(1, res1.getResultado());
		assertEquals(1, res1.getAcumulador());
		assertEquals(1, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(-1, res1.getResultado());
		assertNotEquals(-1, res1.getAcumulador());
		assertNotEquals(-1, res1.getAcumulado());

		//Paso como parámetros dos valores enteros positivo (el segundo mayor)
		res1.setEnteros(1, 2);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-1, res1.getResultado());
		assertEquals(0, res1.getAcumulador());
		assertEquals(0, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());

		//Paso como parámetros dos valores enteros positivo (el primero negativo)
		res1.setEnteros(-2, 1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-3, res1.getResultado());
		assertEquals(-3, res1.getAcumulador());
		assertEquals(-3, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(3, res1.getResultado());
		assertNotEquals(3, res1.getAcumulador());
		assertNotEquals(3, res1.getAcumulado());

		//Paso como parámetros dos valores enteros positivo (el segundo negativo)
		res1.setEnteros(2, -1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(3, res1.getResultado());
		assertEquals(0, res1.getAcumulador());
		assertEquals(0, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(-3, res1.getResultado());
		assertNotEquals(-1, res1.getAcumulador());
		assertNotEquals(-1, res1.getAcumulado());

		//Paso como parámetros dos valores enteros positivo (ambos negativos)
		res1.setEnteros(-2, -1);
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals(-1, res1.getResultado());
		assertEquals(-1, res1.getAcumulador());
		assertEquals(-1, res1.getAcumulado());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals(1, res1.getResultado());
		assertNotEquals(1, res1.getAcumulador());
		assertNotEquals(1, res1.getAcumulado());
	}
	
	@Test
	void testToString() {
		//Compruebo el método toString()
		
		//Compruebo que es igual al valor que pongo de prueba
		assertEquals("Resta [resultado=0.0, acumulado=0.0]", res1.toString());
		//Compruebo que es distinto al valor que pongo de prueba
		assertNotEquals("Resta [resultado=0, acumulado=0]", res1.toString());
	}
}

package junitt5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Producto;

class Test_Producto {

	private Producto pro1;
	
	/**
	 * Prueba Unitarias de la clase Producto
	 * 
	 * @author Antonio Garrido Carranza
	 */
		
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() throws Exception{
		pro1 = new Producto();
	}
	
	@AfterEach
	void tearDown() throws Exception{
		pro1 = null;
	}
	
	@Test
	void testProductoDosReales() {
		
		assertEquals(0, pro1.productoDosReales(0,1));
		assertNotEquals(1, pro1.productoDosReales(2, 4));
		
	}
	
	@Test
	void testProductoDosEnteros() {
		
		assertEquals(4, pro1.productoDosEnteros(2,2));
		assertNotEquals(1, pro1.productoDosEnteros(2,6));
	}
	
	@Test
	void testProductoTresReales() {
		
		assertEquals(8, pro1.productoTresReales(2,2,2));
		assertNotEquals(1, pro1.productoTresReales(2,6,2));
	}
	
	@Test
	void testPotenciaDouble() {
		
		assertEquals(16, pro1.potenciaDouble(4,2));
		//probando que el num2 no pueda ser 0
		assertNotEquals(0,pro1.potenciaDouble(1, 0));
		assertEquals(64, pro1.potenciaDouble(2,6));
		//probando numero negativos
		assertNotEquals(-1,pro1.potenciaDouble(-1, 6));
		assertEquals(100000,pro1.potenciaDouble(100000, 1));
	}
	
	
}

package junitt5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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
	
}

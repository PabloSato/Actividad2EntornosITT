package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




import calculadora.Suma;

class test_suma2 {
	
	private Suma suma1;
	private int num;
	private int valorAcumulado = +num;

	//
	/**
	 * Prueba Unitarias de la clase suma2
	 * 
	 * @author Jorge García Defez
	 */
	
	@BeforeAll
	
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@AfterAll
	
	static void tearDownAfterClass() throws Exception{
		
	}
	
	@BeforeEach
	
	//Creo un nuevo objeto Suma1 antes de cada test
	
	void setUp() throws Exception{
		suma1 = new Suma();
	
	}
	
	@AfterEach
	
	//Despues de cada Test, paso a null el objeto Suma1 creado y reiniciamos el proceso.
	
	void tearDown() throws Exception{
		suma1 = null;
	}
	
	@Test
	
	public void testSumaDosReales() {
		
		//En este test comprobamos que hace exactamente lo que le pedimos con las suma de 2 números 
		//reales y que trabaja bien con los negativos
		
		assertEquals(8.8, suma1.sumaDosReales(4.4,4.4));
		assertNotEquals(1, suma1.sumaDosReales(2, 4));
		assertEquals(-18, suma1.sumaDosReales (-20.5, 2.5)); 
	}
	
	@Test
	
	public void testSumaDosEnteros() {
		
		//En este test comprobamos que hace exactamente lo que le pedimos con la suma de 2 números 
		//enteros y trabaja tambien bien con los negativos
		
		assertEquals(13, suma1.sumaDosEnteros(8,5));
		assertNotEquals(3, suma1.sumaDosEnteros(2,6));
		assertEquals(-3, suma1.sumaDosEnteros (-5, 2)); 
	}
	
	@Test
	
	public void testSumaTresReales() {
		
		//En este test comprobamos que hace exactamente lo que le pedimos con la suma total de 3 números
		//reales y que trabaja bien con los nº negativos
		
		assertEquals(20.5, suma1.sumaTresReales(0.5,9.5,10.5));
		assertNotEquals(90.5, suma1.sumaTresReales(2.8,6.6,2.9));
		assertEquals(-9.5, suma1.sumaTresReales(-20, 10, 0.5));
	}
	
	@Test
	public void testValorAcumulado() {
		//En este ultimo test, comprobamos que el número que se introduzca se queda como acumulado y se
		//actualiza con el numero que se le meta despues
		int num2=5;
		assertEquals(num, valorAcumulado);
		assertNotEquals(num+num2, valorAcumulado);
		
	}


}

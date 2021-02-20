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
	void test() {
		fail("Not yet implemented");
	}

}

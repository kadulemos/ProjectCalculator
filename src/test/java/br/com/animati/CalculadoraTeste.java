package br.com.animati;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculadoraTeste {

	private static Calculator calculator;
	
	@BeforeClass
	public static void inicCalculadora() {
		calculator = new CalculatorImpl();
	}
	
	@Before
	public void antesCadaTeste() {
		System.out.println("Essa é a execução antes de cada Teste");
	}
	
	@After
	public void depoisCadaTeste() {
		System.out.println("Essa é a execução depois de cada Teste");
	}
	
	@Test
	public void testeSoma() {
		int resultado = calculator.sum(3, 4);
		
		assertEquals(7, resultado);
	}
	
	@Test
	public void testDivision() {
		try {
			int resultado = calculator.divison(10, 2);
			
			assertEquals(5, resultado);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	@Test(expected = Exception.class)
	public void testeDivisaoExcecao() throws Exception {
		calculator.divison(10, 0);
	}
	
	@Ignore
	@Test
	public void testeIgualdade() {
		boolean resultado = calculator.equalIntegers(20, 20);
		
		assertTrue(resultado);
	}
	
	@Ignore
	@Test
	public void testeSubtracao() {
		int resultado = 10 - 3;
		
		assertTrue(resultado == 7);
	}
	
}

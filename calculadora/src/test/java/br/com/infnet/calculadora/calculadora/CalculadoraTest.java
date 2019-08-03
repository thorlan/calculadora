package br.com.infnet.calculadora.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveTestarSeACalculadoraExiste(){
		Calculadora calc = new Calculadora();
		assertNotNull(calc);
	}
	
	@Test
	public void deveReceberUmaStringVaziaEDevolverZero(){
		
		Calculadora calc = new Calculadora();
		int resultado = calc.add("");
		assertEquals(resultado, 0);
	}
	
	@Test
	public void deveReceberUmaStringComUmNumeroEDevolverASoma(){
		
		Calculadora calc = new Calculadora();
		int resultado = calc.add("1");
		assertEquals(resultado, 1);
	}
	
	@Test
	public void deveReceberUmaStringComDoisNumerosSeparadosPorVirgulaEDevolverASoma(){
		
		Calculadora calc = new Calculadora();
		int resultado = calc.add("1,2");
		assertEquals(resultado, 3);
	}


	
}

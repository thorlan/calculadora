package br.com.infnet.calculadora.calculadora;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveTestarSeACalculadoraExiste(){
		Calculadora calc = new Calculadora();
		assertNotNull(calc);
	}
	
}

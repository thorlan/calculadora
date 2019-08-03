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

	@Test
	public void deveReceberUmaStringComMaisDeDoisNumerosSeparadosPorVirgulaEDevolverASoma(){
		
		Calculadora calc = new Calculadora();
		int resultado = calc.add("1,2,3");
		assertEquals(resultado, 6);
	}
	
	@Test
	public void deveReceberUmaStringComMaisDeDoisNumerosSeparadosPorVirgulaECaracteresEspeciaisEDevolverASoma(){
		
		Calculadora calc = new Calculadora();
		int resultado = calc.add("1\n2,3");
		assertEquals(resultado, 6);
	}
	
	@Test
	public void deveReceberUmaStringComMaisDeDoisNumerosSeparadosPorVirgulaEOutrosDelimitadoresEDevolverASoma() {
		
		Calculadora calc = new Calculadora();
		int resultado = calc.add("//;\n1;2");
		assertEquals(resultado, 3);
		
	}
	
	
}

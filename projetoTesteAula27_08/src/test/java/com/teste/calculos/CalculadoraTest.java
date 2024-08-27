package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5+5 = 10")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//act
		double resultado = calc.sum(valor1, valor2);
		
		//assert
		assertEquals(esperado,resultado, "5 + 5 nao gerou o valor 10");
	}
	
	@Test
	@DisplayName(" Teste 15-10 = 5")
	void testSub() {
		Calculadora calc = new Calculadora();
		double valor1 = 15D;
		double valor2 = 10D;
		double esperado = 5D;
		
		//act
		double resultado = calc.sub(valor1, valor2);
		
		//assert
		assertEquals(esperado,resultado, "15 - 10 nao gerou o valor 5");
	}
	
	@Test
	@DisplayName(" Teste 6*6 = 36")
	void testMult() {
		Calculadora calc = new Calculadora();
		double valor1 = 6D;
		double valor2 = 6D;
		double esperado = 36D;
		
		//act
		double resultado = calc.mult(valor1, valor2);
		
		//assert
		assertEquals(esperado,resultado, "6 * 6 nao gerou o valor 36");
	}
	
	@Test
	@DisplayName(" Teste 10/1 = 10")
	void testDiv() {
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 1D;
		double esperado = 10D;
		
		//act
		double resultado = calc.div(valor1, valor2);
		
		//assert
		assertEquals(esperado,resultado, "10 / 1 nao gerou o valor 10");
	}
	
}

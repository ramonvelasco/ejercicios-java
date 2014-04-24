package com.ramonvelasco.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ramonvelasco.validadores.Buzz;
import com.ramonvelasco.validadores.Fizz;
import com.ramonvelasco.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	FizzBuzz fb;
	Fizz fizz;
	Buzz buzz;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
		fizz = new Fizz();
		buzz = new Buzz();

	}

	// @Test
	// public void testDivisores() {
	// assertEquals("Divisores 3",true,fb.divisor3(3));
	// assertEquals("Divisores 3",false,fb.divisor3(4));
	//
	// assertEquals("Divisores 5",true,fb.divisor5(5));
	// assertEquals("Divisores 5",false,fb.divisor5(4));
	// }
	@Test
	public void testFizz() {
		assertEquals("Fizz", "Fizz", fizz.getOutput());
		
		assertTrue("Clase Fizz", fizz.validar(3));
		assertFalse("Clase Fizz", fizz.validar(4));
		assertFalse("Clase Fizz", fizz.validar(5));
		assertTrue("Clase Fizz", fizz.validar(6));
		assertTrue("Clase Fizz", fizz.validar(9));

	}

	public void testBuzz() {
		assertEquals("Buzz", "Buzz", buzz.getOutput());
		
		assertTrue("Clase Buzz", buzz.validar(5));
		assertFalse("Clase Buzz", buzz.validar(4));
		assertFalse("Clase Buzz", buzz.validar(6));
		assertTrue("Clase Buzz", buzz.validar(15));
		assertTrue("Clase Buzz", buzz.validar(10));
	}

	@Test
	public void testObtener() {
		assertEquals("Obtener texto", "1", fb.obtenerTexto(1));
		assertEquals("Obtener texto", "Fizz", fb.obtenerTexto(3));
		assertEquals("Obtener texto", "Buzz", fb.obtenerTexto(5));
		assertEquals("Obtener texto", "FizzBuzz", fb.obtenerTexto(15));
	}

	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz", "1", fb.calcular(1));
		assertEquals("FizzBuzz", "1 2", fb.calcular(2));
		assertEquals("FizzBuzz", "1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz Fizz 7", fb.calcular(7));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz Fizz 7 8", fb.calcular(8));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz",
				fb.calcular(9));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11",
				fb.calcular(11));
		assertEquals("FizzBuzz", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz",
				fb.calcular(12));
		assertEquals("FizzBuzz",
				"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13",
				fb.calcular(13));
		assertEquals("FizzBuzz",
				"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14",
				fb.calcular(14));
		assertEquals("FizzBuzz",
				"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz",
				fb.calcular(15));
		assertEquals(
				"FizzBuzz",
				"1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16",
				fb.calcular(16));

	}

}

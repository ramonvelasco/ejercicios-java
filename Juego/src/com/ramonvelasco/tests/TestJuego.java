package com.ramonvelasco.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ramonvelasco.juego.Juego;
import com.ramonvelasco.juego.JuegoAdivinaNumero;

public class TestJuego {

	Juego juego1, juego2, juego3;
	
	@Before
	public void setUp() throws Exception {
		juego1 = new JuegoAdivinaNumero(5,3);
		juego2 =  new JuegoAdivinaNumero(0,8);
		juego3 =  new JuegoAdivinaNumero(2,4);
	}

	@Test
	public void test() {
		
		assertEquals("Juego",5, juego1.muestraVidasRestantes());
		assertEquals("Juego",0, juego2.muestraVidasRestantes());
		assertEquals("Juego",2, juego3.muestraVidasRestantes());
		
		assertTrue("Juego", juego3.quitaVida());
		assertEquals("Juego",1, juego3.muestraVidasRestantes());

		assertFalse("Juego", juego3.quitaVida());
		assertEquals("Juego",0, juego3.muestraVidasRestantes());
		assertFalse("Juego", juego3.quitaVida());
		assertEquals("Juego",0, juego3.muestraVidasRestantes());

		juego3.reiniciaPartida();
		assertEquals("Juego",2, juego3.muestraVidasRestantes());
		
		juego1.actualizaRecord();
		
		assertEquals("Juego",5, juego1.muestraVidasRestantes());	
		assertEquals("Juego",5, juego1.muestraVidasRestantes());
		
	}


}

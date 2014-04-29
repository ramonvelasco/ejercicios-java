package com.ramonvelasco.juego;


public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int vidas, int valor) {
		super(vidas, valor);
		// TODO Auto-generated constructor stub
	}

	public boolean validaNumero(int num) {
		if (num % 2 == 0) {
			return true;

		} else {
			System.out.println("Introduzca un numero Par!");
			return false;
		}

	}
	
	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero par");
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero par: Es un juego en el que el jugador" +
				" deber‡ acertar un nœmero PAR comprendido entre el 0 y el 10 mediante un nœmero limitado de intentos(vidas)");
	}

}

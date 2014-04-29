package com.ramonvelasco.juego;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int vidas, int valor) {
		super(vidas, valor);
		// TODO Auto-generated constructor stub
	}
	public boolean validaNumero(int num) {
		if (num % 2 == 1) {
			return true;

		} else {
			System.out.println("Introduzca un numero Impar!");
			return false;
		}

	}
	
	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un n�mero impar");
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un n�mero impar: Es un juego en el que el jugador" +
				" deber� acertar un n�mero IMPAR comprendido entre el 0 y el 10 mediante un n�mero limitado de intentos(vidas)");
	}
	@Override
	public void reiniciaPartida()
	{
		super.reiniciaPartida();
		//super.valor= (int) (11 * Math.random());
	}
}

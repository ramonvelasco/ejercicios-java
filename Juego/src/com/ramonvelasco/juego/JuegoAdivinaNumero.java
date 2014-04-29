package com.ramonvelasco.juego;

import java.util.Scanner;

import com.ramonvelasco.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	private int valorAdivinar;
	private int valorIntroducido;

	public JuegoAdivinaNumero(int vidas, int valor) {
		super(vidas);
		this.valorAdivinar = valor;
		// TODO Auto-generated constructor stub
	}

	public boolean validaNumero(int num) {
		return true;
	}

	@Override
	public void Juega() {
		// TODO Auto-generated method stub
		super.reiniciaPartida();
		System.out.println("Adivine un nœmero entre el 0 y el 10");
		Scanner entrada = new Scanner(System.in);
		while (super.muestraVidasRestantes()>0) {
			this.valorIntroducido = entrada.nextInt();
			if (validaNumero(this.valorIntroducido)) {
				if (this.valorIntroducido == this.valorAdivinar) {
					System.out.println("Acertaste!");
					super.actualizaRecord();
				} else {
					if (super.quitaVida()) {
						if (this.valorIntroducido < this.valorAdivinar) {
							System.out
									.println("El valor introducido es menor que el numero a adivinar");
						} else {
							System.out
									.println("El valor introducido es mayor que el numero a adivinar");
						}
						System.out.println("Siga intentandolo");

					}

				}
			}
		}
	}

	@Override
	public void muestraNombre() {
		// TODO Auto-generated method stub
		System.out.println("Adivina un nœmero");
	}

	@Override
	public void muestraInfo() {
		// TODO Auto-generated method stub
		System.out
				.println("Adivina un nœmero: Es un juego en el que el jugador"
						+ " deber‡ acertar un nœmero comprendido entre el 0 y el 10 mediante un nœmero limitado de intentos(vidas)");
	}
	
	@Override
	public void reiniciaPartida()
	{
		super.reiniciaPartida();
		this.valorIntroducido = (int) (11 * Math.random());
	}
}

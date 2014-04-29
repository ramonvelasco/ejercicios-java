package com.ramonvelasco.factories;

import com.ramonvelasco.juego.JuegoAdivinaImpar;
import com.ramonvelasco.juego.JuegoAdivinaNumero;
import com.ramonvelasco.juego.JuegoAdivinaPar;

public class JugablesFactory {

	public static int vid = 3;

	public static final JuegoAdivinaNumero getJuegoAdivinaNumero() {
		JuegoAdivinaNumero j = new JuegoAdivinaNumero(vid,
				(int) (11 * Math.random()));

		return j;
	}

	public static final JuegoAdivinaPar getJuegoAdivinaPar() {
		JuegoAdivinaPar p = new JuegoAdivinaPar(vid, generarPar());

		return p;
	}

	public static final JuegoAdivinaImpar getJuegoAdivinaImpar() {
		JuegoAdivinaImpar i = new JuegoAdivinaImpar(vid, generarImpar());

		return i;
	}

	public static int generarPar() {
		int num = (int) (11 * Math.random());
		while (num % 2 == 1) {
			num = (int) (11 * Math.random());

		}
		return num;

	}

	public static int generarImpar() {
		int num = (int) (11 * Math.random());
		while (num % 2 == 0) {
			num = (int) (11 * Math.random());

		}
		return num;

	}
}

package com.ramonvelasco.juego;

import java.util.ArrayList;
import java.util.Scanner;

import com.ramonvelasco.factories.JugablesFactory;
import com.ramonvelasco.interfaces.Jugable;


public class Application {

	/**
	 * @param args
	 */
	public static ArrayList<Jugable> juegos = new ArrayList<Jugable>(3);
	
	static JuegoAdivinaNumero juego;
	static JuegoAdivinaPar juegoPar;
	static JuegoAdivinaImpar juegoImpar;
	


	
	public static Jugable eligeJuego()
	{
//		JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3,1);
//		JuegoAdivinaPar juegoPar;
//		JuegoAdivinaImpar juegoImpar;
//	    juegos.add(juego);

		juego= JugablesFactory.getJuegoAdivinaNumero();
		juegoPar = JugablesFactory.getJuegoAdivinaPar();
		juegoImpar = JugablesFactory.getJuegoAdivinaImpar();

		addJuego(juego);
		addJuego(juegoPar);
		addJuego(juegoImpar);
	
		Scanner entrada = new Scanner(System.in);
		int jueg = 3;
		while (jueg>2 || jueg <0)
		{
			System.out.println("Elija juego pulsando 0, 1 — 2");	
			System.out.println("0: Juego adivina nœmero");	
			System.out.println("1: Juego adivina nœmero Par");	
			System.out.println("2: Juego adivina nœmero Impar");	
			jueg = entrada.nextInt();
		}
		
		return juegos.get(jueg);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugable jugable = eligeJuego();
		jugable.muestraNombre();
		jugable.muestraInfo();
		jugable.Juega();
		
		
		
		
		
//		JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3,3);
//		juego.muestraNombre();
//		juego.muestraInfo();
//		juego.Juega();
//		
//		JuegoAdivinaNumero juegoPar = new JuegoAdivinaPar(3,2);
//		juegoPar.muestraNombre();
//		juegoPar.muestraInfo();
//		juegoPar.Juega();
//		
//		JuegoAdivinaNumero juegoImpar = new JuegoAdivinaImpar(3,5);
//		juegoImpar.muestraNombre();
//		juegoImpar.muestraInfo();
//		juegoImpar.Juega();
		
	}
	public static void addJuego(Jugable j) {
		if(!juegos.contains(j)) {
			juegos.add(j);
		}
	}
}

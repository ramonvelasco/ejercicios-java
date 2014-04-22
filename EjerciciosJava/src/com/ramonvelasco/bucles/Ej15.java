package com.ramonvelasco.bucles;

import java.util.Scanner;

public class Ej15 {

	/*
	 * Construir un programa que simule el juego de la adivinanza de un n�mero.
	 * El ordenador debe generar un n�mero aleatorio entre 1 y 100 y el usuario tiene cinco oportunidades para acertarlo.
	 * Despu�s de cada intento el programa debe indicarle al usuario si el n�mero introducido por �l es mayor, menor o igual al n�mero a adivinar, y el n�mero de intentos restantes.
	 */
	
	public static void main(String[] args) {

		int x  = (int) (100*Math.random()+1);
		int count = 1;
		int num;
		Boolean acertado = false;
		System.out.println("(N�mero: "+ x+")") ;
		while (count<6 && !acertado)
		{
			System.out.println("Introduzca el n�mero que crea ser entre 1 y 100: ");
			Scanner entrada = new Scanner(System.in);
			num = entrada.nextInt();
			if (num ==x) {
        	
				System.out.println("Ha acertado el n�mero, Enhorbuena. N�mero: "+ x) ;
				acertado = true;
					
			}
			else if (num < x)
			{
				System.out.println("El numero introducido: " + num +" es menor que el numero a adivinar") ;
				System.out.println("Numero de intentos: " +count) ;
				count++;

			}
			else 
			{
				System.out.println("El numero introducido: " + num +" es mayor que el numero a adivinar") ;
				System.out.println("Numero de intentos: " +count) ;
				count++;

			}
		}
		if (count>5)
		{
			System.out.println("5 intentos alcanzados") ;
		}
		System.out.println("Fin del juego") ;
		

	}

}

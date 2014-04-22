package com.ramonvelasco.basicos;

import java.util.Scanner;

public class EJ4_01 {

	/*
	Construir un programa que, dado el radio de una esfera, calcule y devuelva por pantalla el valor de la superficie y el volumen de la esfera correspondiente. 
	Para obtener el valor de PI, utilizar la variable est‡tica Math.PI.
	Volumen esfera = (4/3)PIR3
	Superficie esfera = 4PIR2
	*/
	
	public static void main(String[] args) {
	    int radio;
	    double sup ,vol;

          System.out.println("Introduzca el radio de la esfera: ");
          
          Scanner entrada = new Scanner(System.in);
          radio = entrada.nextInt();
          
          sup = 4 * Math.PI * Math.pow(radio,2);
          vol = (4/3)* Math.PI * Math.pow(radio,3);
         
          System.out.println("La superficie de la esfera es " + sup);
          System.out.println("El volumen de la esfera es " + vol);

		
	}

}

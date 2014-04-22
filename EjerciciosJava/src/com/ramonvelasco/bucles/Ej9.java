package com.ramonvelasco.bucles;

import java.util.Scanner;

public class Ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int fact, suma = 1;

          System.out.println("Introduzca el numero: ");
          
          Scanner entrada = new Scanner(System.in);
          fact = entrada.nextInt();
          
          for(int i=fact;i>1;i--){ 
        	  suma=suma*i; 
          } 
        	 
          System.out.println("El factorial de "+fact+" es "+suma); 
       } 
	
	

}

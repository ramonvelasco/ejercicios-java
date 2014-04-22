package com.ramonvelasco.basicos;

import java.util.Scanner;

public class Ej06 {

	/**
	 * @param args
	 */
	
	/*Construir un programa que calcule el ’ndice de masa corporal de una persona (IMC = peso [kg] / altura2[m])
	 *  e indique el estado en el que se encuentra esa persona en funci—n del valor de IMC
	 *  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		double altura;
	    double imc;
	    String status = null;

          System.out.println("Introduzca el peso en kg: ");
          
          Scanner entrada = new Scanner(System.in);
          peso = entrada.nextDouble();
          
          System.out.println("Introduzca la altura en m: ");
       
          altura = entrada.nextDouble();
          		
          
          imc = peso/Math.pow(altura, 2);

          if (imc < 16)
          {
        	  status = "Criterio de ingreso en hospital";
          }
          else if (imc<17)
          {
        	  status = "Infrapeso";
          }
          else if ( imc<18)
          {
        	  status = "Bajo peso";
          }   
          else if ( imc<25)
          {
        	  status= "Peso normal (saludable)";
          }   
          else if ( imc<30)
          {
        	  status= "Sobrepeso";
          }   
          else if ( imc<35)
          {
        	  status= "Sobrepeso cr—nico";
          }   
          else if ( imc<40)
          {
        	  status = "Obesidad Premorbida";
          }   
          else
          {
        	  status = "Obesidad m—rbida";
          }
          
          System.out.println("El indice de masa corporal es:  " + imc + ", que se corresponde con: " + status);

	
	}

}

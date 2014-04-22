package com.ramonvelasco.arrays;

import java.util.Arrays;

public class Ej16 {
/*
 * Construir un programa que pida al usuario una serie de nœmeros enteros, los almacene en un array, y obtenga el m‡ximo y el m’nimo de los valores almacenados.
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fila = new int[10];
		for(int i=0;i<fila.length;i++){ 
			int x=(int) (100*Math.random()+1);
      	  fila[i]= x;
        } 
		
		int max= getMaxValue(fila);
		int min= getMinValue(fila);
		
		System.out.println(Arrays.toString(fila));
		System.out.println(max) ;
		System.out.println(min) ;
		
	}

	public static int getMaxValue(int[] array){  
	      int maxValue = array[0];  
	      for(int i=1;i < array.length;i++){  
	      if(array[i] > maxValue){  
	      maxValue = array[i];  

	         }  
	     }  
	             return maxValue;  
	}  

	public static int getMinValue(int[] array){  
	     int minValue = array[0];  
	     for(int i=1;i<array.length;i++){  
	     if(array[i] < minValue){  
	     minValue = array[i];  
	        }  
	     }  
	    return minValue;  
	}  
}

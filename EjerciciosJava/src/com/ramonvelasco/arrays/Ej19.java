package com.ramonvelasco.arrays;

import java.util.Arrays;

public class Ej19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fila = new int[10];
		for(int i=0;i<fila.length;i++){ 
			fila[i]=(int) (100*Math.random()+1);

        } 
		int[] fila2 = new int[7];
		for(int i=0;i<fila2.length;i++){ 
			fila2[i]=(int) (100*Math.random()+1);
			
        } 
		System.out.println(Arrays.toString(fila));
		System.out.println(Arrays.toString(fila2));
		int[] union = sumar (fila, fila2);
		System.out.println(Arrays.toString(union));
	}
	
	public static int[] sumar(int[] fila, int[]fila2)
	{
		int [] union;
		if (fila.length >= fila2.length)
		{
			union= fila;
			for(int i=0;i<fila2.length;i++){ 
				union[i]=union[i]+fila2[i];
				
	        } 
		}
		else
		{
			 union=fila2;
			 for(int i=0;i<fila.length;i++){ 
					union[i]=union[i]+fila[i];
					
		        } 
		}
		return union;
	}


}

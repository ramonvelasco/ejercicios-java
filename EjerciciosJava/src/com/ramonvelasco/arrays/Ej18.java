package com.ramonvelasco.arrays;

import java.util.Arrays;

public class Ej18 {

	/**
	 * Construir un programa que pida al usuario dos vectores de nœmeros enteros v1 y v2, y que construya un nuevo vector del resultado de "concatenar" los vectores v1 y v2. 
	 * Es decir, colocar los elementos de v2 a continuaci—n de los de v1 y, finalmente, mostrar el resultado de la concatenaci—n por pantalla.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fila = new int[10];
		for(int i=0;i<fila.length;i++){ 
			fila[i]=(int) (100*Math.random()+1);

        } 
		int[] fila2 = new int[10];
		for(int i=0;i<fila2.length;i++){ 
			fila2[i]=(int) (100*Math.random()+1);
			
        } 
		System.out.println(Arrays.toString(fila));
		System.out.println(Arrays.toString(fila2));
		int[] union = concatenar (fila, fila2);
		System.out.println(Arrays.toString(union));
	}
	
	public static int[] concatenar(int[] fila, int[]fila2)
	{

		int [] union= new int[fila.length+fila2.length];
		System.arraycopy( fila, 0, union, 0, fila.length);
		System.arraycopy(fila2, 0, union, fila.length, fila2.length );

		return union;
	}

}

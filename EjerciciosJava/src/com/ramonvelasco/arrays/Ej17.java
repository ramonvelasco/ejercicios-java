package com.ramonvelasco.arrays;

import java.util.Arrays;

public class Ej17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] fila1 = new int[]{1,2,3,4,3,2,1};
		int [] fila2 = new int[]{1,2,3,4,5,3,2,1};
		
		int[] fila = new int[10];
		for(int i=0;i<fila.length;i++){ 
			int x=(int) (100*Math.random()+1);
      	  fila[i]= x;
        } 
		

		System.out.println(Arrays.toString(fila1));
		Boolean capicua = esCapicua(fila1);
		System.out.println("Es capicua: "+capicua);
		
		System.out.println(Arrays.toString(fila2));
		capicua = esCapicua(fila2);
		System.out.println("Es capicua: "+capicua);
		
		System.out.println(Arrays.toString(fila));
		capicua = esCapicua(fila);
		System.out.println("Es capicua: "+capicua);
		
		
	}
		public static Boolean esCapicua(int[] array){
		Boolean capicua = true;
		int n=0;
		int m= array.length-1;
		while (n!=m && m>-1 && n<array.length && capicua){
			if (array[n]!=array[m])
				capicua = false;
			else
				n++;
				m--;
			
		}
		return capicua;
	}
	


}

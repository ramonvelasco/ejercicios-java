package com.ramonvelasco.fizzbuzz;

import java.util.ArrayList;

import com.ramonvelasco.validadores.Buzz;
import com.ramonvelasco.validadores.Fizz;
import com.ramonvelasco.interfaces.IValidador;

public class FizzBuzz {


	private ArrayList<IValidador> validadores;
	
	public FizzBuzz() {

		validadores = new ArrayList<IValidador>();
		validadores.add(new Fizz());
		validadores.add(new Buzz());
	}
	
	public String calcular(int num) {
		String res = "";
		
		for (int i = 1; i <= num; i++) {
			if (i!=1) {
				res += " ";
			}
			res += obtenerTexto(i);
		}
		return res;
	}

	public String obtenerTexto(int num) {
		String res = "";
		
		for (IValidador validador : this.validadores) {
			if(validador.validar(num)) {
				res += validador.getOutput();
			}
		}
		

		if (res.length() == 0) {
			res = Integer.toString(num);
		}
		return res;
	}
}

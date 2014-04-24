package com.ramonvelasco.validadores;

public class FizzBuzz {
	Fizz fizz = new Fizz();
	Buzz buzz = new Buzz();

	public String calcular(int num) {
		String res = "";

		for (int i = 1; i <= num; i++) {
			res += obtenerTexto(i) + " ";
		}
		return res;
	}

	public String obtenerTexto(int num) {
		String res = "";
		if (fizz.esFizz(num)) {
			res += fizz.textFizz();
		}
		if (buzz.esBuzz(num)) {
			res += buzz.textBuzz();
		}
		if (res.length() == 0) {
			res = Integer.toString(num);
		}
		return res;
	}
}

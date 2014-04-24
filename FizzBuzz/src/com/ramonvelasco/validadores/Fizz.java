package com.ramonvelasco.validadores;

public class Fizz extends Validador {
	

	public Fizz() {
		super("Fizz");
	}
	
	@Override
	public boolean validar(int num) {
		return num % 3 == 0;
	}
}

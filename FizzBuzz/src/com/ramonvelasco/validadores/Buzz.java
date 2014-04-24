package com.ramonvelasco.validadores;

public class Buzz extends Validador {

	public Buzz() {
		super("Buzz");
	}
	
	@Override
	public boolean validar(int num) {
		return num % 5 == 0;
	}
}

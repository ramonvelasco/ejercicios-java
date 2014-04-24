package com.ramonvelasco.validadores;

public class Fizz {
	private final String output = "Fizz";

	public boolean esFizz(int num) {
		return num % 3 == 0;
	}

	public String textFizz() {
		return this.output;
	}
}

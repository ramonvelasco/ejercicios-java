package com.ramonvelasco.validadores;

public class Buzz {

	private final String output = "Buzz";

	public boolean esBuzz(int num) {
		return num % 5 == 0;
	}

	public String textBuzz() {
		return this.output;
	}
}

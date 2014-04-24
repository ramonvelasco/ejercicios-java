package com.ramonvelasco.validadores;

import com.ramonvelasco.interfaces.IValidador;



public abstract class Validador implements IValidador  {

	private String output;

	public Validador(String output) {
		this.output = output;
	}
	
	@Override
	public abstract boolean validar(int num);

	@Override
	public String getOutput() {
		return this.output;
	}

}

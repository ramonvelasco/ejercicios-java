package com.ramonvelasco.juego;

public abstract class Juego {

	private int vidas;
	private int vidas_inic;
	private int record = 0;

	public Juego(int vidas) {
		this.vidas = vidas;
		this.vidas_inic = vidas;

	}

	public int muestraVidasRestantes() {
		//System.out.println("N¼ de vidas restantes: " + this.vidas);
		return this.vidas;
	}

	public boolean quitaVida() {
		if (this.vidas <= 1) {
			this.vidas = 0;
			System.out.println("Game over. No tiene m‡s vidas");
			return false;
		}

		else {
			this.vidas--;
			return true;
		}
	}

	public void reiniciaPartida() {
		this.vidas = this.vidas_inic;
	}

	public void actualizaRecord() {
		if (this.vidas == this.record) {
			System.out.println("Has alcanzado el record");
		} else if (this.vidas > this.record) {
			System.out.println("Has superado el record con numero de vidas: "
					+ this.vidas);
			this.record = this.vidas;
		}
	}

	//	public abstract void Juega();
	
	
	
	
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// Juego juego= new Juego(5);
	// juego.muestraVidasRestantes();
	// this.vidas--;
	// juego.muestraVidasRestantes();
	// Juego juego2= new Juego(5);
	// juego.muestraVidasRestantes();
	// juego2.muestraVidasRestantes();
	//
	// }

}

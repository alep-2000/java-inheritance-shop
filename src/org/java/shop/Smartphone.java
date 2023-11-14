package org.java.shop;

public class Smartphone extends Prodotto {
	private int IMEI;
	private int qMemoria;
	
	public Smartphone(int codice, String nome, String descrizione, float prezzo, int iva, int IMEI, int qMemoria) {
		
		super(codice, nome, descrizione, prezzo, iva);
		
		setIMEI(IMEI);
		setqMemoria(qMemoria);
	}

	public int getIMEI() {
		return IMEI;
	}

	public void setIMEI(int iMEI) {
		IMEI = iMEI;
	}

	public int getqMemoria() {
		return qMemoria;
	}

	public void setqMemoria(int qMemoria) {
		this.qMemoria = qMemoria;
	}
	
	
}

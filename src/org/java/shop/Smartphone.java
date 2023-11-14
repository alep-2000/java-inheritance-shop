package org.java.shop;

public class Smartphone extends Prodotto {
	private String IMEI;
	private int qMemoria;
	
	public Smartphone(int codice, String nome, String descrizione, float prezzo, int iva, String IMEI, int qMemoria) {
		
		super(codice, nome, descrizione, prezzo, iva);
		
		setIMEI(IMEI);
		setqMemoria(qMemoria);
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public int getqMemoria() {
		return qMemoria;
	}

	public void setqMemoria(int qMemoria) {
		this.qMemoria = qMemoria;
	}
	
	
}

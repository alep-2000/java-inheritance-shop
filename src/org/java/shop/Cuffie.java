package org.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private String wireless;
	private String cablate;
	
	public Cuffie(int codice, String nome, String descrizione, float prezzo, int iva, String IMEI, int qMemoria) {
		
		super(codice, nome, descrizione, prezzo, iva);
		
		setColore(colore);
		setWireless(wireless);
		setCablate(cablate);
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getWireless() {
		return wireless;
	}

	public void setWireless(String wireless) {
		this.wireless = wireless;
	}

	public String getCablate() {
		return cablate;
	}

	public void setCablate(String cablate) {
		this.cablate = cablate;
	}
	
	
}

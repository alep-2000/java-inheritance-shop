package org.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private Boolean wireless;
	private Boolean cablate;
	
	public Cuffie(int codice, String nome, String descrizione, float prezzo, int iva, String colore, Boolean wireless, Boolean cablate) {
		
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

	public Boolean getWireless() {
		return wireless;
	}

	public void setWireless(Boolean wireless) {
		this.wireless = wireless;
	}

	public Boolean getCablate() {
		return cablate;
	}

	public void setCablate(Boolean cablate) {
		this.cablate = cablate;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+"Colore: " + getColore() + "\n"
				+"Wireless: " + getWireless() + "\n"
				+"Cablate: " + getCablate()+ "\n"
				+"---------------------------------------------" + "\n"; 
	}
	
	
}

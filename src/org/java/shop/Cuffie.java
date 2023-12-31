package org.java.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;
	private boolean cablate;
	
	public Cuffie(String codice, String nome, String descrizione, float prezzo, int iva, String colore, boolean wireless, boolean cablate) {
		
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

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean isCablate() {
		return cablate;
	}
	
	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}

	@Override
	public float getPrezzoIva(boolean fedelta) {
		
		if (!fedelta) return getPrezzoIva();
		
		return isCablate()
				? getPrezzoIva() * .93f
				: super.getPrezzoIva(fedelta);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+"Colore: " + getColore() + "\n"
				+"Wireless: " + (isWireless() ? "Si" : "No") + "\n"
				+"Cablate: " + (isCablate() ? "Si" : "No") + "\n"
				+"---------------------------------------------" + "\n"; 
	}
	
	
}

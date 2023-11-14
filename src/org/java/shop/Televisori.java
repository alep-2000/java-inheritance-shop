package org.java.shop;

public class Televisori extends Prodotto{
	private int dimensioni;
	private boolean smart;
	
	public Televisori(int codice, String nome, String descrizione, float prezzo, int iva, String IMEI, int qMemoria) {
			
			super(codice, nome, descrizione, prezzo, iva);
			
			setDimensioni(dimensioni);
			setSmart(smart);
		}
	
	public int getDimensioni() {
		return dimensioni;
	}
	
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public boolean isSmart() {
		return smart;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}

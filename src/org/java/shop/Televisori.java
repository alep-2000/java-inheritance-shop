package org.java.shop;

public class Televisori extends Prodotto{
	private int dimensioni;
	private boolean smart;
	
	public Televisori(int codice, String nome, String descrizione, float prezzo, int iva, int dimensioni, boolean smart) {
			
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
	
	@Override
	public String toString() {
		return super.toString()  + "\n"
				+"Dimensioni: " + getDimensioni() + " pollici" + "\n"
				+"Smart: " + (isSmart() ? "Si" : "No") + "\n"
				+"---------------------------------------------" + "\n";
	}

}

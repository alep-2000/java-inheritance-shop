package org.java.shop;

public class Smartphone extends Prodotto {
	private String IMEI;
	private int qMemoria;
	
	public Smartphone(String codice, String nome, String descrizione, float prezzo, int iva, String IMEI, int qMemoria) {
		
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
	
	@Override
	public float getPrezzoIva(boolean fedelta) {
		
		if (!fedelta) return getPrezzoIva();
		
		return getqMemoria() < 32
				? getPrezzoIva() * .95f
				: super.getPrezzoIva(fedelta);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
			+"Codice IMEI: " + getIMEI() + "\n"
			+"Quantità di memoria: " + getqMemoria() + " GB" + "\n"
			+"---------------------------------------------" + "\n"; 
		
	}
}

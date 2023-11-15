package org.java.shop;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva){
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public int getCodice() {
		return codice;
	}
	private void setCodice(int codice) {
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	public float getPrezzoIva(){
		return getPrezzo() * (100 + iva) / 100;
	};
	
	public float getPrezzoIva(boolean fedelta) {
		return fedelta
				? (getPrezzoIva() * .98f)
				: getPrezzoIva();
	}
	
	public String getCodiceNome() {
		return getCodice() + "-" + getNome();
	}
	
	public String getCodiceModificato() {
		return String.format("%08d", codice);
	};
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prodotto: \n"
				+ "codice: " + getCodice() + "\n"
				+ "nome: " + getNome() + "\n"
				+ "descrizione: " + getDescrizione() + "\n"
				+ "prezzo base: " + String.format("%.02f", getPrezzo()) + "€"+ "\n"
				+ "iva: " + getIva() + "%" + "\n"
				+ "prezzo con iva: " + String.format("%.02f", getPrezzoIva()) + "€"+ "\n"
				+ "codice + nome: " + getCodiceNome() + "\n";
	}
}

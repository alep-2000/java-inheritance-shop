package org.java.shop;

public class Carrello {

	public static void main(String[] args) {
		
		Prodotto p = new Prodotto(102002093, "Smartphone", "Modello Samsung ultra performante", 300, 20);
		System.out.println(p);
		
		Smartphone s = new Smartphone(102002093, "Smartphone", "Modello Samsung ultra performante", 300, 20,"101020020020020202",32);
		System.out.println(s);
		
		Televisori t = new Televisori(1012010291, "Televisore", "Televisore ultra piatto", 800, 10, 65, true);
		System.out.println(t);
		
		Cuffie c = new Cuffie(1103801204, "Cuffia", "Cuffie JBL", 1200, 4, "Rosso", true, false);
		System.out.println(c);
	}
}

package org.java.shop;

import java.util.Scanner;

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
		
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.print("Vuoi inserire un nuovo prodotto? ");
			String strP = in.nextLine();
			
			System.out.print("Inserisci il codice: ");
			String strCodice = in.nextLine();
			
			System.out.print("Inserisci il nome del prodotto: ");
			String strNome = in.nextLine();
			
			System.out.print("Inserisci la descrizione: ");
			String strDescrizione = in.nextLine();
			
			System.out.print("Inserisci il prezzo del prodotto: ");
			String strPrezzo = in.nextLine();
			
			System.out.print("Inserisci l'iva: ");
			String strIva = in.nextLine();
			
			System.out.print("Quale? Smartphone/Televisori/Cuffie ");
			String strQp = in.nextLine();
			
			if(strQp.equals("Smartphone")) {
				System.out.print("Inserisci il codice IMEI: ");
				String strIMEI = in.nextLine();
				
				System.out.print("Inserisci la grandezza della memoria: ");
				String strKm = in.nextLine();
			}
			
			if(strQp.equals("Televisore")) {
				System.out.print("Inserisci le dimensioni: ");
				String strDimensioni = in.nextLine();
				
				System.out.print("Inserisci se è smart: (SI/NO)");
				String strSmart = in.nextLine();
			}
			
			if(strQp.equals("Cuffie")) {
				System.out.print("Inserisci il colore: ");
				String strColore = in.nextLine();
				
				System.out.print("Inserisci se è wireless: (SI/NO");
				String strWireless = in.nextLine();
				
				System.out.print("Inserisci se è cablata: (SI/NO");
				String strCablata = in.nextLine();
			}
			
			in.close();
		}
	}
}

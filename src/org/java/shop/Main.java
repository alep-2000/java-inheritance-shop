package org.java.shop;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		
		
		 String[ ] prodotti = {
		            "Smartphone",
		            "Fotocamera DSLR",
		            "Laptop",
		            "Smartwatch",
		            "Scarpe da corsa",
		            "Libro di fantascienza",
		            "Tastiera meccanica",
		            "Borsa a tracolla",
		            "Forno a microonde",
		            "Puzzle 1000 pezzi"
		 };

		 String[] descrizioni = {
		            "Uno smartphone di ultima generazione con fotocamera ad alta risoluzione e display ampio.",
		            "Una fotocamera DSLR professionale con sensori avanzati per scatti di alta qualità.",
		            "Un laptop potente con processore veloce e ampio spazio di archiviazione.",
		            "Uno smartwatch con monitoraggio fitness e notifiche smart per la tua vita quotidiana.",
		            "Scarpe leggere e ammortizzate progettate per il comfort durante la corsa.",
		            "Un libro avvincente di fantascienza scritto da un autore rinomato.",
		            "Una tastiera meccanica con retroilluminazione RGB per un'esperienza di gioco immersiva.",
		            "Una elegante borsa a tracolla perfetta per l'uso quotidiano.",
		            "Un forno a microonde con diverse funzioni di cottura per preparare rapidamente i tuoi pasti.",
		            "Un puzzle stimolante con 1000 pezzi per sfidare la tua mente e la tua pazienza.",
		 };
		
		Random r = new Random();
		
		for(int x=0; x<prodotti.length; x++) {
			Prodotto p = new Prodotto(r.nextInt(100000000), prodotti[x], descrizioni[x] , r.nextFloat(0,300), r.nextInt(60));
			System.out.println(p);
		}
	}
}

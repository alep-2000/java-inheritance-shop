package org.java.shop;

import java.util.Scanner;

	public class Carrello {

	    public static void main(String[] args) {
	    	final int PRODUCT_COUNT = 5;
	        boolean smart = false;
	        boolean wireless = false;
	        boolean cablate = false;
	        String strIMEI = null;
	        int intMemoria = 0;
	        int intDimensioni = 0;
	        String strColore = null;
	        int i = 0;
	        Prodotto[] prodotti = new Prodotto[PRODUCT_COUNT];
	        

	        Scanner in = new Scanner(System.in);
	        while (true) {
	            System.out.print("Vuoi inserire un nuovo prodotto? (SI/NO)");
	            String strP = in.nextLine().toLowerCase();



	            if (strP.equals("no"))break;
	          
	            System.out.print("Quale? Smartphone/Televisori/Cuffie ");
	            String strQp = in.nextLine();

	            System.out.print("Inserisci il codice: ");
	            String strCodice = in.nextLine();
	            int intCodice = Integer.valueOf(strCodice);

	            System.out.print("Inserisci il nome del prodotto: ");
	            String strNome = in.nextLine();

	            System.out.print("Inserisci la descrizione: ");
	            String strDescrizione = in.nextLine();

	            System.out.print("Inserisci il prezzo del prodotto: ");
	            String strPrezzo = in.nextLine();
	            int intPrezzo = Integer.valueOf(strPrezzo);

	            System.out.print("Inserisci l'iva: ");
	            String strIva = in.nextLine();
	            int intIva = Integer.valueOf(strIva);

	            if (strQp.equals("Smartphone")) {
	                System.out.print("Inserisci il codice IMEI: ");
	                strIMEI = in.nextLine();

	                System.out.print("Inserisci la grandezza della memoria: ");
	                String strMemoria = in.nextLine();
	                intMemoria = Integer.valueOf(strMemoria);
	            } else if (strQp.equals("Televisore")) {
	                System.out.print("Inserisci le dimensioni: ");
	                String strDimensioni = in.nextLine();
	                intDimensioni = Integer.valueOf(strDimensioni);

	                System.out.print("Inserisci se è smart: (SI/NO)");
	                String strSmart = in.nextLine().toLowerCase();

	                if (strSmart.equals("si")) {
	                    smart = true;
	                }
	            }else if(strQp.equals("Cuffie")) {
	                System.out.print("Inserisci il colore: ");
	                strColore = in.nextLine();

	                System.out.print("Inserisci se è wireless: (SI/NO");
	                String strWireless = in.nextLine().toLowerCase();

	                if (strWireless.equals("si")) {
	                    wireless = true;
	                }

	                System.out.print("Inserisci se è cablata: (SI/NO");
	                String strCablata = in.nextLine().toLowerCase();

	                if (strCablata.equals("si")) {
	                    cablate = true;
	                }
	            }

	           
	            
	            String CapitalizedProductType = strQp.substring(0, 1).toUpperCase() + strQp.substring(1).toLowerCase();
	            
	            switch (strQp) {
	                case "Smartphone": {
	                    
						prodotti[i] = new Smartphone(intCodice, strNome, strDescrizione, intPrezzo, intIva, strIMEI, intMemoria);
	                    i++;
						break;
	                }
	                case "Televisore": {
	                    
						prodotti[i] = new Televisori(intCodice, strNome, strDescrizione, intPrezzo, intIva, intDimensioni, smart);
						i++;
						break;
	                }
	                case "Cuffie": {
	                    
						
						prodotti[i] = new Cuffie(intCodice, strNome, strDescrizione, intPrezzo, intIva, strColore, wireless, cablate);
						i++;
						break;
	                }
	                default:
						throw new IllegalArgumentException("Unexpected value: " + CapitalizedProductType);
					}
	        }
	        
	        for (int j = 0; j <i; j++) {
	            System.out.println(prodotti[j] + "\n");
	        }
	    }
	}

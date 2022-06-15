package jana60.bonus;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Prodotto catalogo = new Prodotto(null, null, null, 0);
		String[] listacompleta = new String[5];
		
		
		//Dichiarazione del catalogo AKA - Vettore prodotto di classe Prodotto con dimensione definitagli prima.
				
				
				//Riempimento del catalogo
				for(int i = 0; i < 5; i++) {
					
					//Assegnazione valore della marca del prodotto.
					System.out.println("Inserisci il brand del " + (i+1) + "° prodotto: ");
					catalogo.brand= scan.nextLine();
					//Assegnazione valore del nome del prodotto.
					System.out.println("Inserisci il nome del " + (i+1) + "° prodotto: ");
					catalogo.name = scan.nextLine();
					//Assegnazione valore dell'iva sul prodotto.
					System.out.println("Inserisci il colore del " + (i+1) + "° prodotto: ");
					catalogo.colore = scan.nextLine();
					//Assegnazione valore del prezzo del prodotto.
					System.out.println("Inserisci il prezzo del " + (i+1) + "° prodotto: ");
					catalogo.PrezzoBase = scan.nextDouble();
					scan.nextLine();
					listacompleta[i] = catalogo.lista();
					
					
				}
                
				System.out.println(listacompleta[0]);
				System.out.println(listacompleta[1]);
				System.out.println(listacompleta[2]);
				System.out.println(listacompleta[3]);
				System.out.println(listacompleta[4]);
				
        scan.close();
	}
}

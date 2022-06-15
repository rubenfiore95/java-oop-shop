package jana60.bonus;

import java.text.DecimalFormat;

public class Prodotto {

String brand, name, colore;
double PrezzoBase;
int VAT = 22;

DecimalFormat df= new DecimalFormat ("#.00€");

public Prodotto(String brand, String name, String colore, double d) {
	
	this.brand = brand;
	this.name = name;
	this.colore = colore;
	this.PrezzoBase = d;
	
    }
	
//METODO

public double PrezzoTotale() {
	return PrezzoBase + ((PrezzoBase /100)* VAT);
}

public String toString() {
	return "Il prezzo del prodotto " +name+ " di marca " +brand+ " e' di : " + df.format(PrezzoTotale());
 }

public String lista() {
	return "PRODOTTO: " +name+ " BRAND: " +brand+ " Colore: " +colore+ " Prezzo + IVA : " + df.format(PrezzoTotale());
 }

	
}

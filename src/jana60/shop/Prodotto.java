package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

String brand, name;
double PrezzoBase;
int VAT;

DecimalFormat df= new DecimalFormat ("#.00€");

public Prodotto(String brand, String name, double d, int VAT) {
	super();
	this.brand = brand;
	this.name = name;
	this.PrezzoBase = d;
	this.VAT = VAT;
    }
	
//METODO

public double PrezzoTotale() {
	return PrezzoBase + ((PrezzoBase /100)* VAT);
}

public String toString() {
	return "Il prezzo del prodotto " +name+ " di marca " +brand+ " e' di : " + df.format(PrezzoTotale());
 }

	
}

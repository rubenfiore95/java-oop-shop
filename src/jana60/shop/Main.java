package jana60.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto[] prodotti= new Prodotto[4]; // Creato array di prodotti.
		
		Prodotto Shampoo = new Prodotto("Garnier", "Schiuma da barba", 4.99, 22);
		Prodotto Dentifricio = new Prodotto("Colgate", "Dentifricio", 2.99, 22);
		Prodotto Sapone = new Prodotto("Sole", "sapone per piatti", 1.59, 22);
		Prodotto Fazzoletti = new Prodotto("Scottex", "Carta igienica", 1.15, 22);
		
		prodotti[0]= Shampoo;   // Inseriti i prodotti in array
		prodotti[1]= Dentifricio;
		prodotti[2]= Sapone;
		prodotti[3]= Fazzoletti;
		
		for (int i=0; i < prodotti.length; i++) {
			System.out.println(prodotti[i].toString());
			
			
			
		}
		

	}

}

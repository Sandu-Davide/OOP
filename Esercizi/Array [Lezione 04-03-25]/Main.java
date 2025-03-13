package base;

public class Main {

	public static void main(String[] args) {
		Array newArray = new Array(15,30);
		newArray.printInfo();
		System.out.println("Oggetto: " + newArray);
		System.out.println("Numero elementi uguali: " + newArray.countElementArray(6));
		System.out.println("Media elementi maggiori: " + newArray.averageElementMaggiori(5));
		System.out.println("Posizione: " + newArray.returnPositionElement(5));
		System.out.println("Minore: " + newArray.minValueElement(20));
		System.out.println("Massimo dei minimi: " + newArray.maxOfMinValueElement(23));
		
		System.out.println("Fattoriale: " + Ricorsione.fattoriale(4));
		System.out.println("Potenza: " + Ricorsione.potenza(2,1_000L));
		
		newArray.inversione();
		newArray.printInfo();
		newArray.inversione();
		newArray.printInfo();
		
		
	}

}

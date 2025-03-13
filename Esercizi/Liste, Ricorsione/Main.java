package Liste;

public class Main {

	public static void main(String[] args) {
		Lista list = new Lista(70);
		list.printLista();
		System.out.println("--- In Ricorsivo: ---------------------------");
		list.printListaRicorsivo();
		System.out.println("Elementi: " + list.countElement());
		System.out.println("Lunghezza: " + list.lengthString(10) + " | " + list.lengthStringRicorsivo(10));
		System.out.println("Media: " + list.averageLengthOfString() + " | " + list.averageLengthRicorsivo());
		System.out.println("Uguale a: " + list.equalsString("ciao") + " | " + list.equlsRicorsivo("ciao"));
		System.out.println("Quanti uguale a: " + list.numberOfStringEquals("ciaociao") + " | "  + list.numberOfStringEqualsRicorsivo("ciaociao"));
		System.out.println("Max: " + list.maxOfLength() + " | " + list.maxOfLengthRicorsivo());
		System.out.println("Max tra i min: " + list.maxOfMin(16) + " | " + list.maxOfMinRicorsivo(16));
		

	}

}

package Esercizio2;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista(30);
		l.stampa();
		System.out.println("tutte le canzoni hanno durata inferiore a 300 secondi "+l.controlloInferiore(300));
        System.out.println("tutte le canzoni hanno durata inferiore a 500 secondi "+l.controlloInferioreR(500));
	}

}

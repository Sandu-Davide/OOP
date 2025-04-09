package Esercizio2;

public class Canzone {
	String nomeCantente;
	String titolo;
	int durata;
	Canzone next;
	
	public Canzone(String nomeCantente, String titolo, int durata, Canzone next) {
		this.nomeCantente = nomeCantente;
		this.titolo = titolo;
		this.durata = durata;
		this.next = next;
	}
	
	
}

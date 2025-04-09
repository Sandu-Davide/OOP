package Esercizio1;

public abstract class Corso {
	String materia;
	private int partecipanti;
	
	public Corso(String materia, int partecipanti) {
		this.materia = materia;
		this.partecipanti = partecipanti;
	}
	
	public void nuovaIscrizione() {
		partecipanti++;
	}
	
	public int getPartecipanti() {
		return partecipanti;
	}
	
	public abstract int costoDocente();
}

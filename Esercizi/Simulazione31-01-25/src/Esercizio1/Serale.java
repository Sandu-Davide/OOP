package Esercizio1;

public class Serale extends  Corso {
	boolean laureato;
	
	public Serale(String materia, int partecipanti, boolean laureato) {
		super(materia, partecipanti);
		this.laureato = laureato;
	}

	@Override
	public int costoDocente() {
		return 200 + (6*getPartecipanti()) + (laureato ? 400 : 0);
	}

}

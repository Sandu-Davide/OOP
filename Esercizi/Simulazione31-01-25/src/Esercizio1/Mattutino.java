package Esercizio1;

public class Mattutino extends Corso {
	int numeroMinorenni;
	
	public Mattutino(String materia, int partecipanti, int numeroMinorenni) {
		super(materia, partecipanti);
		this.numeroMinorenni = numeroMinorenni;
	}

	@Override
	public int costoDocente() {
		return 100 + (5*getPartecipanti()) + (numeroMinorenni > 5 ? 200 : 0);
	}

}

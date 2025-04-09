package Esercizio1;

import java.util.Random;

public class Agenzia {
	Corso v[];
	
	public Agenzia(int n, int m) {
		v = new Corso[n+m];
		Random r = new Random();
		for(int i=0; i<n; i++) {
			v[i] = new Mattutino("Materia " + (r.nextInt(10)+1), r.nextInt(10), r.nextInt(10));
		}
		for(int j=n; j<n+m; j++) {
			v[j] = new Serale("Materia " + (r.nextInt(10)+1), r.nextInt(10), r.nextBoolean());
		}
	}
	
	public double mediaCostoDocente(String m) {
		int sommaCostoDocente=0;
		int contatoreCorsi=0;
		
		for(int i=0; i<v.length; i++) {
			if(v[i].materia.equals(m)) {
				sommaCostoDocente = v[i].costoDocente();
				contatoreCorsi++;
			}
		}
		
		return contatoreCorsi != 0 ? (double) sommaCostoDocente/contatoreCorsi : 0;
	}
}

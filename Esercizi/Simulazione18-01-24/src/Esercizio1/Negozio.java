package Esercizio1;

import java.util.Random;

public class Negozio {
	Vite v[];
	
	public Negozio(int n, int m) {
		v = new Vite[n+m];
		Random r = new Random();
		
		for(int i=0; i<n; i++) {
			v[i] = new VitePerLegno(r.nextDouble(30.0), r.nextBoolean(), r.nextBoolean());
		}
		for(int i=n; i<n+m; i++) {
			v[i] = new VitePerFerro(r.nextDouble(30.0), r.nextBoolean(), r.nextBoolean());
		}
	}
	
	public double minimoCosto(double d) {
		double min = Double.MAX_VALUE;
		for(int i=0; i<v.length; i++) {
			if(v[i].diametro == d && v[i].costo() < min) {
				min = v[i].costo();
			}
		}
		return min;
	}
}

package base;

public class Ricorsione {
	
	public static double fattoriale(int n) {
		return n==0 ? 1 : n*(fattoriale(n-1));
	}
	
	public static double potenza(double base, long esponente) {
		return esponente <= 0 ? 1 : esponente % 2 == 1 ? base*potenza(base*base, esponente/2) : potenza(base*base, esponente/2); 
	}
	
}

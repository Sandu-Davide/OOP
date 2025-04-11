package Esercizio1;

public abstract class Vite {
	double diametro;
	private boolean zincata;
	
	public Vite(double diametro, boolean zincata) {
		this.diametro = diametro;
		this.zincata = zincata;
	}
	
	public boolean isZincata() {
		return zincata;
	}
	
	public void zincatura() {
		zincata = true;
	}
	
	public abstract double costo();
	
	
}

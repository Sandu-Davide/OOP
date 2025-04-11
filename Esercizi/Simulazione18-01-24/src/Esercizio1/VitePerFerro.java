package Esercizio1;

public class VitePerFerro extends Vite{
	boolean acciaio;
	
	public VitePerFerro(double diametro, boolean zincata,	boolean acciaio) {
		super(diametro, zincata);
		this.acciaio = acciaio;
	}



	@Override
	public double costo() {
		return 0.02*diametro + (isZincata() ? 0.2 : 0) + (acciaio ? 0.1 : 0);
	}
	
	
}

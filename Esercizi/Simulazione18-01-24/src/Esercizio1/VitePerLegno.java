package Esercizio1;

public class VitePerLegno extends Vite{
	boolean cacciaviteStella;
	
	public VitePerLegno(double diametro, boolean zincata,boolean cacciaviteStella) {
		super(diametro, zincata);
		this.cacciaviteStella = cacciaviteStella;
	}

	@Override
	public double costo() {
		return 0.01*diametro + (isZincata() ? 0.1 : 0) + (cacciaviteStella ? 0.1 : 0);
	}

}

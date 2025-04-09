package Esercizio2;

import java.util.Random;

public class Lista {
	Canzone testa = null;
	
	public Lista(int n) {
		Random r = new Random();
		for(int i=0; i<n; i++) {
			testa = new Canzone("Nome " + (r.nextInt(10)+1) , "Titolo " + (r.nextInt(10)+1) , r.nextInt(500)+1, testa);
		}
	}
	
	public boolean controlloInferiore(int n) {
		boolean risultato = true;
		for(Canzone canzoneScan=testa; canzoneScan != null; canzoneScan = canzoneScan.next) {
			if(canzoneScan.durata > n) {
				risultato = false;
				break;
			}
		}
		
		return risultato;
	}
	
	private boolean controlloInferioreR(int n, Canzone canzoneScan) {
		if(canzoneScan == null) {
			return true;
		}else {
			if(canzoneScan.durata > n) {
				return false;
			}else{
				return controlloInferioreR(n, canzoneScan.next);
			}
		}
	}
	
	public boolean controlloInferioreR(int n) {
		return controlloInferioreR(n, testa);
	}
	
	//Metodo non richiesto dall'esercitazione (Creato per debug)
	public void stampa() {
		for(Canzone canzoneScan=testa; canzoneScan != null; canzoneScan = canzoneScan.next) {
			System.out.println(canzoneScan.nomeCantente + " | " + canzoneScan.titolo  + " | " + canzoneScan.durata);
		}
	}
}

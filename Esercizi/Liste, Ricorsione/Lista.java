package Liste;

import java.util.Random;

public class Lista {
	
	public Elemento head=null;
	
	public Lista(int lengthElement) {
		Random random = new Random();
		for(int i=0; i<lengthElement; i++) {
			String str = "ciao";
			for(int j=0; j<random.nextInt(15); j++) {
				str += "ciao";
			}
			head = new Elemento(str, head);
		}
	}
	
	public int countElement() {
		int count = 0;
		
		for(Elemento elementScan = head; elementScan != null; elementScan = elementScan.next){
			count++;
		}
		
		return count;
	}
	
	public void printLista() {
		Elemento elementScan = head;
		
		while(elementScan != null) {
			System.out.println(elementScan.stringa + " " + elementScan.stringa.length());
			elementScan = elementScan.next;
		}
	}
	
	private void printListaRicorsivo(Elemento elementScan) {
		if(elementScan != null) {
			System.out.println(elementScan.stringa + " " + elementScan.stringa.length());
			printListaRicorsivo(elementScan.next);
		}
	}
	
	public void printListaRicorsivo() {
		printListaRicorsivo(this.head);
	}
	
	public int lengthString(int limit) {
		int length=0;
		Elemento elementScan = head;
		
		while(elementScan != null) {
			if(elementScan.stringa.length() > limit) {
				length += elementScan.stringa.length();
			}
			elementScan = elementScan.next;
		}
		return length;
	}
	
	private int lengthStringRicorsivo(Elemento elementScan, int limit) {
		if(elementScan == null) {
			return 0;
		}
		
		if(elementScan.stringa.length() > limit) {
			return elementScan.stringa.length() + lengthStringRicorsivo(elementScan.next, limit);
		}else {
			return lengthStringRicorsivo(elementScan.next, limit);
		}
		
	}
	
	public int lengthStringRicorsivo(int limit) {
		return lengthStringRicorsivo(head, limit);
	}
	
	public double averageLengthOfString() {
		double average = 0.0;
		int countString = 0;
		
		for(Elemento elementScan = head; elementScan != null; elementScan = elementScan.next){
			if(elementScan.stringa.length() % 2 == 0) {
				average += elementScan.stringa.length();
				++countString;
			}
		}
		
		return average/countString;
	}
	
	private int averageLengthRicorsivo(Elemento elementScan) {
		if(elementScan == null) {
			return 0;
		}
		
		if(elementScan.stringa.length() % 2 == 0) {
			return elementScan.stringa.length() + averageLengthRicorsivo(elementScan.next);
		}else {
			return averageLengthRicorsivo(elementScan.next);
		}
		
	}
	
	public double averageLengthRicorsivo() {
		return (double) averageLengthRicorsivo(head)/countElement();
	}
	
	public boolean equalsString(String s) {
		boolean equals = false;
		Elemento elementScan = head;
		
		while(elementScan != null) {
			if(elementScan.stringa.equals(s)) {
				equals = true;
				break;
			}
			elementScan = elementScan.next;
		}
		return equals;
	}
	
	private boolean equalsRicorsivo(Elemento elementScan, String s) {
		if(elementScan == null) {
			return false;
		}
		
		if(elementScan.stringa.equals(s)) {
			return true;
		}else {
			return equalsRicorsivo(elementScan.next, s);
		}
	}
	
	public boolean equlsRicorsivo(String s) {
		return equalsRicorsivo(head, s);
	}
	
	public int numberOfStringEquals(String s) {
		int numberOfString=0;
		Elemento elementScan = head;
		
		while(elementScan != null) {
			numberOfString += elementScan.stringa.equals(s) ? 1 : 0;
			elementScan = elementScan.next;
		}
		return numberOfString;
	}
	
	private int numberOfStringEqualsRicorsivo(Elemento elementScan, String s) {
		if(elementScan == null) {
			return 0;
		}
		
		if(elementScan.stringa.equals(s)) {
			return 1 + numberOfStringEqualsRicorsivo(elementScan.next, s);
		}else {
			return numberOfStringEqualsRicorsivo(elementScan.next, s);
		}
	}
	
	public int numberOfStringEqualsRicorsivo(String s) {
		return numberOfStringEqualsRicorsivo(head, s);
	}
	
	public int maxOfLength() {
		int max=0;
		Elemento elementScan = head;
		
		while(elementScan != null) {
			max = max < elementScan.stringa.length() ? elementScan.stringa.length() : max;
			elementScan = elementScan.next;
		}
		return max;
	}
	
	private int maxOfLengthRicorsivo(Elemento elementScan, int max) {
		if(elementScan == null) {
			return max;
		}
		
		if(max < elementScan.stringa.length()) {
			return maxOfLengthRicorsivo(elementScan.next, elementScan.stringa.length());
		}else {
			return maxOfLengthRicorsivo(elementScan.next, max);
		}
		
	}
	
	public int maxOfLengthRicorsivo() {
		return maxOfLengthRicorsivo(head, 0);
	}
	
	public int maxOfMin(int min) {
		int max=0;
		Elemento elementScan = head;
		
		while(elementScan != null) {
			if(max < elementScan.stringa.length() && elementScan.stringa.length() < min) {
				max = elementScan.stringa.length();
			}
			elementScan = elementScan.next;
		}
		return max;
	}
	
	private int maxOfMinRicorsivo(Elemento elementScan, int min, int max) {
		if(elementScan == null) {
			return max;
		}
		
		if(max < elementScan.stringa.length() && elementScan.stringa.length() < min) {
			return maxOfMinRicorsivo(elementScan.next, min, elementScan.stringa.length());
		}else {
			return maxOfMinRicorsivo(elementScan.next, min, max);
		}
	}
	
	public int maxOfMinRicorsivo(int min) {
		return maxOfMinRicorsivo(head, min, 0);
	}
	
}

package base;

import java.util.Random;

public class Array {
	public int v[];
	
	public Array(int n, int limit) {
		v = new int[n];
		fillRandomNumbers(limit);	
	}
	//fillRandomNumbers: metodo non necessario (non richiesto)
	public void fillRandomNumbers(int limit) {
		Random random = new Random();
		for(int i=0; i< v.length; i++) {
			v[i] = random.nextInt(limit+1);
		}
	}
	//minValueElement: metodo non necessario (non richiesto)
	public int minValueElement(int n) {
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<v.length; i++) {
			min = v[i] < n && min > v[i] ? v[i] : min;
		}
		
		return min != Integer.MAX_VALUE ? min : Integer.MIN_VALUE;
	}
	
	public void inversione() {
		int support = 0;
		for(int i=0; i<v.length/2; i++) {
			support = v[i];
			v[i] = v[v.length-1-i];
			v[v.length-1-i] = support;
		}
	}
	
	public int maxOfMinValueElement(int n) {
		int maxOfMin = Integer.MIN_VALUE;
		
		for(int i=0; i<v.length; i++) {
			maxOfMin = v[i] < n && maxOfMin < v[i] ? v[i] : maxOfMin;
		}
		
		return maxOfMin;
	}
	
	public int returnPositionElement(int n) {
		int position = -1;
		
		for(int i=0; i<v.length; i++) {
			if(n == v[i]) {
				position = i;
				break;
			}
		}
		
		return position;
	}
	
	public int countElementArray(int n) {
		int numberOfElement=0;
		
		for(int i=0; i<v.length; i++) {
			numberOfElement = v[i] == n ? ++numberOfElement : numberOfElement;
		}
		
		return numberOfElement;
	}
	
	public double averageElementMaggiori(int n) {
		double average = 0.0;
		int count =0;
		
		for(int i=0; i<v.length; i++) {
			average = v[i] > n && ++count > 0 ? average + v[i] : average;
		}

		return count != 0 ? average / count : average;
	}
	
	public void printInfo() {
		System.out.print("[");
		for(int i=0; i<v.length; i++) {
			System.out.print(" " + v[i] + " ");
			
		}
		System.out.println("]");
	}
}

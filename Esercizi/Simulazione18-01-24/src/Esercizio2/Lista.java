package Esercizio2;

import java.util.Random;

public class Lista {
	USB head = null;
	
	public Lista(int n) {
		Random r = new Random();
		for(int i=0; i<n; i++) {
			head = new USB("marca" + r.nextInt(10), r.nextInt(112) + 16, head);
		}
	}
	
	public int conta(String m, int c) {
		int count = 0;
		for(USB usbScan=head; usbScan != null; usbScan = usbScan.next) {
			if(usbScan.marca.equals(m) && usbScan.capacita == c) {
				count++;
			}
		}
		return count;
	}
	
	private int contaR(String m, int c, USB usbScan, int count) {
		if(usbScan == null) {
			return count;
		}else if(usbScan.marca.equals(m) && usbScan.capacita == c) {
			return contaR(m, c, usbScan.next,++count);
		}else {
			return contaR(m, c, usbScan.next, count);
		}
	}
	
	public int contaR(String m, int c) {
		return contaR(m, c, head, 0);
	}
}

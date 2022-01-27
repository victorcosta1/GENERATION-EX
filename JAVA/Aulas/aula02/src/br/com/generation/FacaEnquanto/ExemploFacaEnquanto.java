package br.com.generation.FacaEnquanto;

public class ExemploFacaEnquanto {

	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		
		do {
			System.out.println("Repetição: " + i );
			++i;
			Thread.sleep(500);
			
		}
		while(i <= 10);

	}

}

package br.com.generation.LacodeRepeticao;

public class ExWile {

	public static void main(String[] args) throws InterruptedException {
		
		int contador=0;
		
		while( contador <= 10) {
			System.out.println("Repetição " + contador);
			contador++;
			
			Thread.sleep(500);
		}
	}

}

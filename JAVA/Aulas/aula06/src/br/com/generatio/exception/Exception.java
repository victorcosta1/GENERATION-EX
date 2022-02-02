package br.com.generatio.exception;

public class Exception {

	public static void main(String[] args) {
		int[] vetor = new int[4];
		
		System.out.println("Antes da exception");
		
		try {
		vetor[4] = 10;
		}
		catch(java.lang.ArrayIndexOutOfBoundsException  e) {
			System.out.println("Exception consertada");
			vetor[3] = 10;
			System.out.println(vetor[3]);
		}
	}

}

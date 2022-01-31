package br.com.generations.metodos;

public class Metodos {
	
	public static String metodo6(int i, int f) {
		String numeroString = "";
		
		
		for(int c = i; c < f; c++) {
			numeroString += c + " - ";
		}
		return numeroString;
	}

}

package br.com.generations.repeticaofor;

public class ExemploFor2 {

	public static void main(String[] args) {
		
		int numero = 10, i, soma;
		
		for(i = 0, soma = 0; i <= numero; ++i) {
			
			System.out.println("Soma = " + soma + "+" + i );
			soma = soma + i;
			System.out.println(" = " + soma);
		}
		
		
		
		
		
	}

}

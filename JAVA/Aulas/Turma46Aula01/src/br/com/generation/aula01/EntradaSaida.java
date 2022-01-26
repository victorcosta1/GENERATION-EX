package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Ibforme o valor de A: ");
		
		a = leia.nextInt();
		
		System.out.println("Infome o valor de B: ");
		b = leia.nextInt();
		
		soma = a+b;
		
		System.out.println("As soma dos valores é de: " + soma);
		
		leia.close();
		
	}

}

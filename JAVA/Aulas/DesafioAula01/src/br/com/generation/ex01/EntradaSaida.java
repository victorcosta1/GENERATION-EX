package br.com.generation.ex01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		 
		int a, b, soma, sub;
		double vezes, div, rest;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("informe o valor de B: ");
		b = leia.nextInt();
		
		soma = a+b;
		vezes = a*b;
		sub = a-b;
		div = a/b;
		rest = a%b;
		
		System.out.println("\nA soma de A + b: " + soma);
		System.out.println("\nA multiplicação de A + b: " + vezes);
		System.out.println("\nA divisão de A + b: " + div);
		System.out.println("\nO resto da divisão entre a + b é de: " + rest );
		
		leia.close();
		
		

	}

}

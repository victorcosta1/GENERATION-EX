package br.com.generation.condicionais;

import java.util.Scanner;

public class LacosCindicionais02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma letra de A a D");
		char letra = sc.next().charAt(0);
		
		
		//Pode se fazer tudo dentro  dos switch é uma verificação	
		
		//A virgula serve como OU nesse caso.
		switch(letra) {
		case 'a', 'A':
			
				System.out.println("Anna");
			break;
		case 'b', 'B':
				System.out.println("Bruno");
			break;
		case 'c', 'C':
				System.out.println("Carlos");
			break;
		case 'd', 'D':
				System.out.println("Dani");
			break;	
			default:
				System.out.println("Valor invalido");
			break;	
		}
		
	}

}

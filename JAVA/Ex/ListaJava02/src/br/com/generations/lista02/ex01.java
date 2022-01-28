package br.com.generations.lista02;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int n1, n2, n3, m = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o 1° número: ");
		n1 = leia.nextInt();
		
		System.out.println("\nInforme o 2° número: ");
		n2 = leia.nextInt();
		
		System.out.println("\nInforme o 3° número: ");
		n3 = leia.nextInt();
		
		if (n1 > m) {
			m = n1;
			
		}
		
		if (n2 > m) {

			m = n2;
			
		}
		
		if (n3 > m) {
			m = n3;
		}
		
		System.out.println("\nO maior valor é: " + m);
	}

}

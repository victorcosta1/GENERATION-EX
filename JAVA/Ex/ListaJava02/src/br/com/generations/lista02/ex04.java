package br.com.generations.lista02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		int num;
		double raiz, potencia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("O n�mero � par");
			raiz = Math.sqrt(num);
			System.out.println("Raiz quadrada: %2f " + raiz);
		}
		
		else {
			System.out.println("Impar");
		}

	}

}

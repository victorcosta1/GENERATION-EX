package br.com.generation.listajava03;

import java.util.Scanner;

public class dowhile05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num,resultado = 0;
			
		do
		{
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
			
			resultado += num;
			
		}while(num!=0);
		
		System.out.println("\nA soma dos numeros digitados foi: "+resultado);

	}

}

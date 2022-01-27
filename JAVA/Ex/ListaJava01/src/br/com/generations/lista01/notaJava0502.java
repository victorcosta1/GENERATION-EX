package br.com.generations.lista01;

import java.util.Scanner;

public class notaJava0502 {

	public static void main(String[] args) {
		double A, B, C, med;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nota A:");
		A = leia.nextDouble();
		
		System.out.println("Nota B:");
		B = leia.nextDouble();
		
		System.out.println("Nota C:");
		C = leia.nextDouble();
														//med ponderada = div pela soma dos pesos  
		                                               //não pela contagem dos elementos
		med = (A * 2 + B * 3 + C * 5) / 10;
		
		System.out.println("A média é de: " + med);

	}

}

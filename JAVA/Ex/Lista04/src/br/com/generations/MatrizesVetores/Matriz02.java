package br.com.generations.MatrizesVetores;

import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int[][] matriz = new int[3][3];
		int val, x, soma = 0, somadiagonal;
		
		
		System.out.println("\nInforme os valores: ");
		
		for(val = 0; val < 3; val++) {
			
			for(x = 0; x < 3; x++) {
				matriz[val][x] = leia.nextInt();
				soma = soma + matriz[val][x];
			}
		
		}
		
		System.out.println("\nSoma dos valores: " + soma);
		
		somadiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		
		System.out.println("\nA soma diagonal é de: " + somadiagonal);
	}

}

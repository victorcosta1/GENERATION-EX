package br.com.generations.MatrizesVetores;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int[] arrayVetor = new int[5];
		int maior=0, x, num;
		
		Scanner leia = new Scanner(System.in);
		
		for(x =0; x < 4; x++) {
			System.out.println("Informe o " +( x + 1) + " valor: ");
			num = leia.nextInt();
			
			arrayVetor[x] = num;
			
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior valor informado foi: " + maior);

	}

}

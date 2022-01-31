package br.com.generation.aula03;

public class Vetor01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; //---> começa sempre no 0.....9
		
		int num = 100;
		arrayVetor[0] = 23;
		arrayVetor[5] = 22;		
		arrayVetor[7] = num;
		arrayVetor[9] = 23;
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println(i + " - " + arrayVetor[i]);
		}
			


		

	}

}

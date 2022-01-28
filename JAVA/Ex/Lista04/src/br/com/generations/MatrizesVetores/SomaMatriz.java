package br.com.generations.MatrizesVetores;

import java.util.Random;

public class SomaMatriz {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int soma=0;
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		
		
		for(int i=0;i<4;i++) {
			for(int j = 0; j < 6; j++) {
				n1[i][j] = sorteio.nextInt(5) + 1;
				n2[i][j] = sorteio.nextInt(5) + 1;
				
				m1[i][j]=n1[i][j]+n2[i][j];
				m2[i][j]=n1[i][j]-n2[i][j];
			}
		}
		
		System.out.println("-------Resultado n1-------");
		for(int i=0;i<4; i++) {
			for(int j=0;j<6; j++) {
				System.out.println("[" + n1[i][j] + "]");
			}
			
			System.out.println();
		}
		
		System.out.println("-------Resultado n2-------");
		for(int i=0; i<4;i++) {
			for(int j=0; j<6; j++) {
				System.out.println("[" + n2[i][j] + "]");
			}
			System.out.println();
		}
		
//--------------------------------------------M-------------------------------		
		System.out.println("-------Resultado m1-------");
		for(int i=0; i<4;i++) {
			for(int j=0; j<6; j++) {
				System.out.println("[" + m1[i][j] + "]");
			}
			System.out.println();
		}
		
		System.out.println("-------Resultado m2-------");
		for(int i=0; i<4;i++) {
			for(int j=0; j<6; j++) {
				System.out.println("[" + m2[i][j] + "]");
			}
			System.out.println();
		}
		
		
	}
		
}

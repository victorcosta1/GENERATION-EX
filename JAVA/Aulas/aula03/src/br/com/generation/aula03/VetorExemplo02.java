package br.com.generation.aula03;

import java.util.Scanner;

public class VetorExemplo02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4]; //----> Come�a em 0
		double soma = 0.0, media = 0.0;
		
		System.out.println("Digite �s quatro notas do aluno: ");
		for(int i = 0; i <=3; i++) {
			System.out.println(i+1 + "� Nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		

	}

}

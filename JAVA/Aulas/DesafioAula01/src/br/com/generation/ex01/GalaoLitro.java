package br.com.generation.ex01;

import java.util.Scanner;

public class GalaoLitro {

	public static void main(String[] args) {
		
		int galoes,  menos, div, rest;
		double litros;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de galões: ");
		
		galoes = leia.nextInt();
		
		litros = galoes * 3.7854;
		
		System.out.println("A quantidade de galões informados: "+galoes + "\nA quantidade de Litros é de: " + litros + " Litros: ");
		
		leia.close();
		
		
		
	}

}

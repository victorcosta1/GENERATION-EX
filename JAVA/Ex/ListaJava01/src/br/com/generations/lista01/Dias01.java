package br.com.generations.lista01;

import java.util.Scanner;

public class Dias01 {

	public static void main(String[] args) {
		int dia, mes, ano, dias = 0, total;
		
		String nome;
		
		Scanner leia = new Scanner(System.in);
//--------------------------------------------------------------------------\\
		
		System.out.println("Infome seu nome: ");
		nome = leia.nextLine();
		
		
		System.out.println("Informe a sua idade em Anos: ");
		ano = leia.nextInt();
		
		System.out.println("Informe a sua idade em messes: ");
		mes = leia.nextInt();
		
		System.out.println("Informe a sua idade em dias: ");
		dia = leia.nextInt();
		
		total = ano * 365 + mes * 30 + dia;
		
		System.out.println(nome + "Você já viveu " + total + " dias."); 
		
		//atualmente tenho 20 anos, 243 meses e 7448 dias 26/01/22 resultado = 22038
	}

}

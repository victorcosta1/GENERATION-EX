package br.com.generations.lista02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nInforme sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) 
		{
			System.out.println("\nVocê esta na categoria: Infantil");
		}
		
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nVocê esta na categoria: Juvenil");
		}
		
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nVocê esta na categoria: adulto");
		}
		else
		{
			System.out.println("\nIdade fora das categorias disponiveis");


	}
	}
}

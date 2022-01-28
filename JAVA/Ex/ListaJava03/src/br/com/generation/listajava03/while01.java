package br.com.generation.listajava03;

import java.util.Scanner;

public class while01 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0,totalJovens=0,totalAdultos=0;
		
		
		
		while(idade != -99)
		{
			System.out.println("\nDigite a sua idade: ");
			idade = ler.nextInt();
			
			if(idade<=21 && idade != -99)
			{
				totalJovens++;
			}
			else if(idade>=50 && idade != -99)
			{
				totalAdultos++;
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+totalJovens);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+totalAdultos);

	}

}

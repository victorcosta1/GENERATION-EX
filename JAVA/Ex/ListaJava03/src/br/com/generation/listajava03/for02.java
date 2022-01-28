package br.com.generation.listajava03;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int x,num,contPar=0,contImpar=0;
		
		
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			
			if(num%2==0)
			{
				contPar++;
			}
			else if(num%2==1)
			{
				contImpar++;
			}
			
		}
		System.out.printf("\nVoce digitou: %d, numero(s) par(es)...",contPar);
		System.out.printf("\nVoce digitou: %d, numero(s) impar(es)...",contImpar);
	}

}

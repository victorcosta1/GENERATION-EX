package br.com.generation.condicionais;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		//Laço Condicional
		
		
		if (media >=9.0 && media <= 10) {
			System.out.println("Aprovado com honras!");
		}
		
			
		else if (media >= 6.0 && media < 9.0) {
			System.out.println("Aprovado " + media);
		}
		
		else if (media >= 3.0 && media <6.0) {
			System.out.println("Recuperação! " + media);
		}
		
		else if (media < 0 || media > 10) {
			System.out.println("Burro você não pode digitar nota negativa ou maior que 10");
		}
		
		else {
			System.out.println("Reprovado " + media);
		}
		
		
	}

}

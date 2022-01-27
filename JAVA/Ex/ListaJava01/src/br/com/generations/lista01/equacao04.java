package br.com.generations.lista01;

import java.util.Scanner;

public class equacao04 {

	public static void main(String[] args) {
		 int a, b, c;
		 
		 double R, S, D;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("Informe o primeiro número: ");
		  a = leia.nextInt();
		  
		  System.out.println("Informe o segundo número: ");
		  b = leia.nextInt();
		  
		  System.out.println("Informe o terceiro número: ");
		  c = leia.nextInt();
		  
		  R = (a + b)^2; //110
		  S = (b + c)^2; //11
		  D = (R + S)/2;
		  
		  System.out.println("O resultado é de: " + D);

	}

}

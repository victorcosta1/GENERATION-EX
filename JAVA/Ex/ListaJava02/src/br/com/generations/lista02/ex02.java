package br.com.generations.lista02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		 
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nPrimeiro número");
		num1 = ler.nextInt();
		
		System.out.println("\nSegundo número");
		num2 = ler.nextInt();
		
		System.out.println("\nTerceiro número");
		num3 = ler.nextInt();
		
		if(num1 < num2) {
			if(num2 < num3) {
				System.out.println(num1+ "\n" + num2 + "\n" + num3 );
			}
			
			else if (num1 < num3) {
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			}
			
			else {
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}
		}
		
		else if(num2 < num3) {
			if(num1 < num3) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			}
			
			else {
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			}
		}
		
		else {
			System.out.println(num3 + "\n" + num2 + "\n" + num1);
		}
	}

}

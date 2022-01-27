package br.com.generations.lista01;

import java.util.Scanner;

public class segundos03 {

	public static void main(String[] args) {
		double seg, min, hr;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a duração do en=vento em segundos: ");
		seg = leia.nextDouble();
		
		hr = seg/3600;
		min = ((seg % 3600) / 60);
		seg = ((seg % 3600) % 60);
		
		System.out.println("O tempo decorrido foi de: " + hr + " Horas \n" + min + " Minutos \n" +  seg  + " Segundos\n");
		
		

	}

}

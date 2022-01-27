package br.com.generations.lista01;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class DiasAnos2 {

	public static void main(String[] args) {
		
		int  dia, mes, ano, dias;
		
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = leia.next();
		
		System.out.println("Informe sua idade expressa em dias: ");
		dias = leia.nextInt();
		
		ano = dias/365;
		mes = dias % 365 / 30;
	    dias = dias % 365 % 30;
	    
	    System.out.println("Trabalhando nisso....");
	    
	    System.out.println("Concluido!");
	    
	    System.out.println("Victor, sua idade é de :" + "\nanos: " + ano +"\nMesses: " + mes + "\nDias: " + dias);
	    
	    
	}

}

package br.com.generations.lista01;   //fiquei na duvida com o enuciado não entendi se a pesa 2, b 3 e c 5 ou se os pessos são valtaeies como eu fiz aqui

// para duvida e fixação do conteúdo vou fazer duas atividaes. 

import java.util.Scanner;

public class notas01 {

	public static void main(String[] args) {
		
		double n1, n2, n3, med=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a nota 1: ");
		n1 = leia.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		n2 = leia.nextDouble();
		
		System.out.println("Informe a nota 3: ");
		n3 = leia.nextDouble();
		
		if((n1>n2) && (n1>n3)){
			med = ((n1*5) + (n2*3) + (n3*2))/10;
		}
		
		else if((n2>n1) && (n2>n2)) {
			med = ((n2*5) + (n1*3) + (n3*2))/10;
		}
		
		else {
			med = ((n1*2) + (n2*3) + (n3*5))/10;
		}
		
		System.out.println("A média ponderada é de: " + med);
	}

}

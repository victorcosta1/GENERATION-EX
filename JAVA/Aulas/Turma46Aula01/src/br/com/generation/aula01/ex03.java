package br.com.generation.aula01;

public class ex03 {

	public static void main(String[] args) {
		
		int var1;
		double var2;
		
		var1 = 10;
		var2= 10.0;
		
		System.out.println("Valor original da primeira var " + var1);
		System.out.println("Valor original da primeira var " + var2);
		
		
		//atualizando o valor da variavel
		
		System.out.println();
		
		var1 = var1 / 4; //----> inteiros
		
		var2 = var2 / 4; //----> reais
		
		System.out.println("Valor da 1 var apos a div " + var1);
		System.out.println("Valor da 2 var apos a div " + var2);
	}

}

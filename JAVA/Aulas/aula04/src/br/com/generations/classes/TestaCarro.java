package br.com.generations.classes;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carros c1 = new Carros();
		
		c1.modelo = "corolla";
		c1.marca = "Toyota";
		c1.anoFabricacao = 2003;
		c1.velocidade = 0;
		
		c1.acelerar(120);
		System.out.println(c1.velocidade);
		
		c1.freiar(60);
		System.out.println("O carro freiou..."+ c1.velocidade);
		
	

	}

}

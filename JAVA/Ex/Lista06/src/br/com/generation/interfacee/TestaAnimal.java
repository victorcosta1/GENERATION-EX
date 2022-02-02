package br.com.generation.interfacee;

public class TestaAnimal {

	public static void main(String[] args) {


		AnimalComer come1 = new AnimalComer();
		
		
		come1.comer(new Cachorro());
		
		come1.comer(new Cavalo());

	}

}

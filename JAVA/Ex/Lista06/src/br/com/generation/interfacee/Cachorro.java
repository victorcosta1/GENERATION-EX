package br.com.generation.interfacee;

public class Cachorro implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("Som do cachorro: auaua");
		
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro dormindo......");

		
	}

	@Override
	public void comer() {
		System.out.println("Cachorro comendo...");
		
	}

}

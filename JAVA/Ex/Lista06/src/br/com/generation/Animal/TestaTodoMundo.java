package br.com.generation.Animal;

public class TestaTodoMundo extends Animal{

	public static void main(String[] args) {
		
		Animal c1 = new Cavalo();
		
		c1.setSom("Relincho");
		c1.setIdade(10);
		c1.setNome("Cavalo maluco");
		c1.setCorrer("Começou a correr...");
		 System.out.println("Idade: "+ c1.getIdade() + "\nNome: " + c1.getNome()+ "\nSom: " + c1.getSom() + "\nCavalo maluco se assusta..."  + c1.getCorrer());
	
		 System.out.println("----------------------------------------------------------");
	
	  Animal ca1 = new Cachorro();
	  
	  ca1.setNome("Cachorro biruta");
	  ca1.setIdade(3);
	  ca1.setSom("AU... AU... AU...");
	  ca1.setCorrer(" e começa a correr atras de você... Ainda bem que eu não sou você....");
	  	
	  System.out.println("----------------------------------------------------------");
	  
	  System.out.println("Idade: "+ ca1.getIdade() + "\nNome: " + ca1.getNome()+ "\nSom: " + ca1.getSom() + "\nEle te encara...."  + ca1.getCorrer());
	  
	  System.out.println("----------------------------------------------------------");
	  System.out.println("----------------------------------------------------------");
	  
	  Animal p1 = new Preguica();
	  
	  p1.setNome("Preguiça maluca");
	  p1.setIdade(20);
	  p1.setSom(".....Que som ele faz??");
	  p1.setArvore("Começou a subir na arvore");
	  
	  System.out.println("Idade: "+ p1.getIdade() + "\nNome: " + p1.getNome()+ "\nSom: " + p1.getSom() + "\nEle te encara...."  + p1.getArvore());
	
	  System.out.println("----------------------------------------------------------");
	  System.out.println("----------------------------------------------------------");
	
	}
		
}

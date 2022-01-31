package br.com.generations.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
	al1.nome = "Luana";
	al1.idade = 18;
	al1.endereco = "Rua: Henrique muzzio - 300";
	
	al2.nome ="Paulo";
	al2.idade = 25;
	al2.endereco = "Rua tancredo neves - 500";
	
	System.out.println(al1.nome);
	System.out.println(al1.idade);
	System.out.println(al1.endereco);
	
	al1.estudar();
	al1.fazerProva();
	
	
	System.out.println(al2.nome);
	System.out.println(al2.idade);
	System.out.println(al2.endereco);
	
	al2.estudar();
	al2.fazerProva();

	}

}

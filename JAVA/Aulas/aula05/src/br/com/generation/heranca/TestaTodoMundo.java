package br.com.generation.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do funcionario: ");
		String nome = entrada.next();
		
		System.out.println("Idade: ");
		int idade = entrada.hashCode();
		
		
		Professor pf1 = new Professor();
		
		pf1.setNome(nome);
		pf1.setIdade(idade);
		pf1.setEndereco("Rua 2 de julho");
		
		pf1.setDisciplina("Filosofia");
		pf1.setSalario(20.000);
		
		System.out.println("Nome: " + pf1.getNome());
		System.out.println("Idade: " + pf1.getIdade());
		System.out.println("Endereço: " +  pf1.getEndereco());
		System.out.println("Disciplina: " + pf1.getDisciplina());
		System.out.println("Salario: " + pf1.getSalario());
		

	}

}

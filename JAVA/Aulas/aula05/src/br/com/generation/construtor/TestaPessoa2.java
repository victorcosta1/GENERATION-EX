package br.com.generation.construtor;

import java.util.Scanner;

public class TestaPessoa2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		int idade = sc.hashCode();
		
		Pessoa2 p1 = new Pessoa2(nome, idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);

	}

}

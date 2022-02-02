package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos você deseja adicionar:  ");
		int numeroAlunos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Informe a idade do aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome do aluno: ");
			String nome = sc.next();
			
			alunos.add(new Aluno(idade, nome));
			
			
		}
		
		for(Aluno i: alunos) {
			System.out.println(i);
		}
		
		sc.close();
	}

}

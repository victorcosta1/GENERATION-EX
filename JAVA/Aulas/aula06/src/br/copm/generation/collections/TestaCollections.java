package br.copm.generation.collections;

import java.util.ArrayList;

public class TestaCollections {

	public static void main(String[] args) {
		
		String aula1 = "Bloco 1 - Java";
		String aula2 = "Bloco 2 - Backend";
		String aula3 = "Bloco 3 - FrontEnd";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		aulas.remove(1);
		System.out.println(aulas);
		
		//for each
		
		for(String i: aulas) {
		System.out.println("Aula: " + i);
		}
		
		String primeiraAula = aulas.get(0);
		
		System.out.println(primeiraAula);
		
		
		
	}

}

package br.com.generations.classes;

public class Carros {
	
	//Atributos = Variaveis
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;
	
	
	
	
	//M�todos = Verbos
	
	void acelerar(int  acelaracao) {
		velocidade = velocidade + acelaracao;
	}
	
	void freiar(int freio) {
		velocidade -= freio;
	}
}
package br.copm.generation.collections2;

public class Aula {
	
	//Atributos - variaveis 
	private String titulo;
	private int tempo;
	
	
	//Construtor da classe
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//metodos de recuperação
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() {
		return "Aula: " + this.titulo + "|" + this.tempo + "  minutos.";
	}
}

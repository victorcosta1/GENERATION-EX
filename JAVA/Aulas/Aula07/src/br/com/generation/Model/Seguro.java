package br.com.generation.Model;

public class Seguro {
	private String cobertura;
	private double valorfranquia;
	
	public Seguro(String cobertura, double valorfranquia) {
		super();
		this.cobertura = cobertura;
		this.valorfranquia = valorfranquia;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public double getValorfranquia() {
		return valorfranquia;
	}
	public void setValorfranquia(double valorfranquia) {
		this.valorfranquia = valorfranquia;
	}
	
	
}

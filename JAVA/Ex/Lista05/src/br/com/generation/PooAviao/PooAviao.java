package br.com.generation.PooAviao;

public class PooAviao {
	private int numAviao;
	private String nomePassageiro;
	private long cpfPassageiro;
	private double valorCompra;
	
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getNumAviao() {
		return numAviao;
	}
	public void setNumAviao(int numAviao) {
		this.numAviao = numAviao;
	}
	public String getNomePassageiro() {
		return nomePassageiro;
	}
	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}
	public long getCpfPassageiro() {
		return cpfPassageiro;
	}
	public void setCpfPassageiro(long cpfPassageiro) {
		this.cpfPassageiro = cpfPassageiro;
	}
		


public void imprimirInfo() {
	System.out.println("\n"+nomePassageiro+" de cpf: "+cpfPassageiro+" Passagem referente a aeronave de id: "+numAviao+ "\n Valor total da compra: R$" + valorCompra);
	}
}

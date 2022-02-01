package br.com.generations.lista05;

public class PooClienteEx01 {
	private String nomeCliente;
	private long cpfCliente;
	private int telefone;
	private String produtoComprado;
	private float valorCompra;
	
	


public PooClienteEx01(String nomeCliente, long cpfCliente, int telefone, String produtoComprado, float valorCompra) {
	this.nomeCliente =  nomeCliente; 
	this.cpfCliente = cpfCliente;
	this.telefone = telefone;
	this.produtoComprado = produtoComprado;
	this.valorCompra = valorCompra;
}

public void imprimirInfo()
{
	System.out.println("\n"+nomeCliente+" de cpf: "+cpfCliente+" e telefone: "+telefone+" comprou um(a) "+produtoComprado+" no valor de R$ "+valorCompra);
}

public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public long getCpfCliente() {
	return cpfCliente;
}

public void setCpfCliente(long cpfCliente) {
	this.cpfCliente = cpfCliente;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}

public String getProdutoComprado() {
	return produtoComprado;
}

public void setProdutoComprado(String produtoComprado) {
	this.produtoComprado = produtoComprado;
}

public float getValorCompra() {
	return valorCompra;
}

public void setValorCompra(float valorCompra) {
	this.valorCompra = valorCompra;
}
}
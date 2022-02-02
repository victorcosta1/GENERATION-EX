package br.com.generation.teste;

public class TestaUnitario {

	public static void main(String[] args) {
		
			Calculadora calc = new Calculadora();
			
			double resultadoEsperado = 4;
			
			double resultado = calc.somar(2.0, 2);
			
			if(resultado == resultadoEsperado) {
				System.out.println("Teste ok");
			}
			else {
				System.out.println("Teste falhou");
			}

	}

}

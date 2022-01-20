programa
{
	
	funcao inicio()
	{
		real peso, excedente, multa

		escreva ("\nEntre com o peso do tomate: ")
		leia(peso)
		
	
		 	excedente = peso - 50.00
		 	multa = excedente*4.00
		
		se (peso>=50.00){
		 	 
		escreva ("\nTotal do peso excedente: ",excedente)
		escreva ("\nTotal da multa aplicada: ",multa)
		}
		
		senao
		{
		escreva ("\nMulta não aplicada")
		
	}	
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
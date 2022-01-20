programa
{
	
	funcao inicio()								/*Tentei adcionar uma contagem de soma (para fixação) apesar de ser inutil já que a contagem vai ser a = ao nmr informado*/
	{
		inteiro contador, nmr, soma, quantidade

		contador=0 soma=0

		escreva("Informe um número: ")
		leia(nmr)
		
		faca{
			
			contador = contador ++
			soma += contador
			quantidade= contador+1-2	//a soma da qntd estava dando o total +2 não sei pq mas consegui consertar colocando -2
		}
			enquanto (contador<=nmr)

			  escreva("O resultado da soma até o numero: ", nmr,"\nÉ de:", soma)
			  escreva("\nQuantidade de números somados: ", quantidade)
	}

				
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
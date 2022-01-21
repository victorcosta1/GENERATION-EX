programa
{
	
	funcao inicio()
	{
		inteiro vetor[5], nmr, x, m=0      //M= Maior

		para(x=0; x<4; x++){
			escreva("\nInforme o valor: ")
			leia(nmr)

			vetor[x]=nmr

			se(nmr>m){
				m = nmr	
			}
		}
		
		escreva("\nO maior número informado foi de: ", m)
																	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
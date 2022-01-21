programa
{
												/*sm= soma
												 * sd= somadiagonal*/
																		
	funcao inicio()
	{
		inteiro matriz[3][3],val,x,sm=0,sd
		

		escreva("\nDigite os valores: ")
		
		
		para(val=0;val<3;val++)
		{
			para(x=0;x<3;x++)
			{
		
				leia(matriz[val][x])		
				sm=sm+matriz[val][x]
				
			}
		}
		escreva("\nA soma dos valores: ",sm)

		sd=matriz[0][0]+matriz[1][1]+matriz[2][2]
		
		escreva("\nA soma da diagonal principal= ",sd)
	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 67; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
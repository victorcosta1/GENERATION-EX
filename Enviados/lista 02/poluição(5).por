programa
{
	
	funcao inicio()
	{
		real indice


		escreva("Informe o indice de poluição: ")
		leia(indice)

		se (indice==0.3){
			escreva("ATENÇÃO! empresa do grupo 1 suspender atividades")
		}

		se (indice==0.4){
			escreva("ATENÇÃO! empresas do grupo 1 e 2 suspender atividades")
			
		}

		se (indice>=0.5){
			escreva("ATENÇÃO! TODOS OS GRUPOS DE EMPRESAS DEVEM SUSPENDER AS ATIVIDADES")
		}

		se (indice<=0.2){
			escreva("indice de poluição baixo. Todas as empresas podem seguir funcionando normalmente.")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
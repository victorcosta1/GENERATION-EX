programa
{
	
	
	funcao inicio()
	{
		real base, altura

		escreva("informe a base: ")
		leia(base)

		se (base>0){
			escreva("Ok, iremos prosseguir.")
		}

		senao{
			escreva("impossivél continuar. Informe um número valído.")
		}

		escreva("informe a altura: ")
		leia(altura)

		se (altura>0){
			escreva("Ok, iremos prosseguir.")
		}

		senao{
			escreva("impossivél continuar. Informe um número valído.")
		}

		escreva("A area do triangulo é: ", (base*altura)/2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
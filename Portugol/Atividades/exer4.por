programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro numeroA, numeroB, numeroC
		real numeroD, numeroS, numeroR

		escreva("Digite o valor de A:")
		leia(numeroA)
		limpa()

		escreva("Digite o valor de B:")
		leia(numeroB)
		limpa()

		escreva("Digite o valor de C:")
		leia(numeroC)
		limpa()

		numeroR = (numeroA + numeroB)^2
		numeroS = (numeroB + numeroC)^2
		numeroD = (numeroR + numeroS) / 2

		escreva(numeroD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
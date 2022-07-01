programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro d, x1, x2, y1, y2

		escreva("Valor de x1:")
		leia(x1)
		limpa()

		escreva("Valor de x2:")
		leia(x2)
		limpa()

		escreva("Valor de y1:")
		leia(y1)
		limpa()

		escreva("Valor de y2:")
		leia(y2)
		limpa()

		d = Matematica.raiz(Matematica.potencia((x2 - x1), 2) + Matematica.potencia((y2 - y1), 2), 2)
		escreva("O seu resultado é " + d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
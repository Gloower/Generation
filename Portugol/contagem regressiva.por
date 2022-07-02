programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro contador  = 10

		enquanto(contador > 0){
			escreva("Contagem Regressiva... ", contador)
			contador--
			u.aguarde(2000)
			limpa()
			}
		escreva("A contagem acabou!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
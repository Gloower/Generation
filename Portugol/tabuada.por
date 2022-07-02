programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro x, tabuada, resultadoTabuada

		escreva ("Digite o valor da tabuada: ")
		leia(tabuada)

		para(x = 1; x <= 10; x++){
		resultadoTabuada = x * tabuada
		escreva("\n", x, "x", tabuada, " = ", resultadoTabuada )
		Util.aguarde(1500)
		limpa()

		escreva("Processo da tabuada completo.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
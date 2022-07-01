programa
{
	inclua biblioteca Matematica
	
//definir os anos, meses e dias a partir dos dias
	funcao inicio()
	{
		inteiro dia, idade, idadeDias, idadeMes, idadeAnos

		escreva("Escreva sua idade em dias: ")
		leia(dia)
		limpa()

		idadeAnos = dia / 365
		idadeMes = dia / 30
		idadeDias = idadeMes * 30
		escreva("Sua idade é " + idadeAnos + "anos," + idadeMes + " meses e ")
		
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
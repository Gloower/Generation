programa
{
	inclua biblioteca Matematica
	//definir os anos, meses e dias
	funcao inicio()
	{
		inteiro dia, mes, ano, idade, idadeDias, idadeMes, idadeAnos

		escreva("Em que dia você você nasceu? ")
		leia(dia)
		limpa()

		escreva("Em que mês você nasceu? ")
		leia(mes)
		limpa()

		escreva("Em que ano você nasceu? ")
		leia(ano)
		limpa()

		idade = 2022 - ano
		idadeMes = mes * 30 
		idadeAnos = idade * 365
		idadeDias = dia + idadeMes + idadeAnos

		escreva("Sua idade em dias é " +idadeDias)
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
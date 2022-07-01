programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, duracaoSegundos

		escreva("Insira a duração do evento em segundos: ")
		leia(segundos)
		limpa()
//calculo
		horas = segundos / 3600
		minutos = (segundos % 3600) / 60
		duracaoSegundos = (segundos % 3600) / 60
		escreva("A duração do evento foi de " + horas + " horas " + minutos + " minutos e " + duracaoSegundos + " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
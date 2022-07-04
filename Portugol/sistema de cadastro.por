programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		cadeia nomeCadastro, sobrenCadastro, ultimonCadastro
		cadeia cadastro [3]

		escreva("Digite o seu primeiro nome: ")
		leia(nomeCadastro)
		u.aguarde(1500)
		limpa()

		escreva("Digite o seu sobrenome: ")
		leia(sobrenCadastro)
		u.aguarde(1500)
		limpa()

		escreva("Digite o seu ultimo nome: ")
		leia(ultimonCadastro)
		u.aguarde(1500)
		limpa()


//Vetores do cadastro
		cadastro[0] = nomeCadastro
		cadastro[1] = sobrenCadastro
		cadastro[2] = ultimonCadastro

//Cadastro completo
		escreva("Bem vindo ao site: " + cadastro[0]+ " " + cadastro[1] + " " + cadastro [2])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 623; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Util
 --> u
	
	funcao inicio()
	{
		cadeia login, senha, loginCadastro, senhaCadastro
		
	 	escreva("Cadastre o seu login: ")
	 	leia(loginCadastro)
	 	u.aguarde(2000)
	 	limpa()

	 	escreva("Cadastre a sua senha: ")
	 	leia(senhaCadastro)
	 	u.aguarde(2000)
	 	limpa()
		
		
		faca{
			escreva("Insira o seu login: ")
			leia(login)


			escreva("Insira a sua senha de acesso: ")
			leia(senha)
			u.aguarde(2000)
			limpa()


		se (login == loginCadastro e senha == senhaCadastro){
			escreva("Login válido")

			
			}
senao{
	
	escreva("Login inválido, tente novamente")
	u.aguarde(2000)
	limpa()
	}
			}

			

	    enquanto(login != loginCadastro ou senha != senhaCadastro)
	    escreva("\nBem vindo ao Generation Brazil")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
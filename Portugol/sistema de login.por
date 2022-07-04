//Feito por Nicolas Alves

programa
{
	inclua biblioteca Util
 --> u
	
	funcao inicio()
	{
		cadeia login, senha, loginCadastro, senhaCadastro
		cadeia cadastro [4]
	
		
	 	escreva("Cadastre o seu login: ")
	 	leia(loginCadastro)
	 	u.aguarde(2000)
	 	limpa()

	 	escreva("Cadastre a sua senha: ")
	 	leia(senhaCadastro)
	 	u.aguarde(2000)
	 	limpa()

cadastro [0] = loginCadastro
cadastro [1] = senhaCadastro
		
		
		faca{
			escreva("Insira o seu login: ")
			leia(login)


			escreva("Insira a sua senha de acesso: ")
			leia(senha)
			u.aguarde(2000)
			limpa()




		se (login == cadastro[0] e senha == cadastro[1]){
			escreva("Login válido")


		 	
			}
senao{	
	
	escreva("Login inválido, tente novamente")
	u.aguarde(2000)
	limpa()
	}


cadastro [2] = login
cadastro [3] = senha	
			}

			

	    enquanto(cadastro[2] != cadastro[0] ou cadastro[3] != cadastro[1])
	    escreva("\nBem vindo ao Generation Brazil " +cadastro[2])
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 25; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {cadastro, 11, 9, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
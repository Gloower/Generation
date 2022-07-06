//Feito por: Nicolas Alves

programa
{
	inclua biblioteca Util
 --> u
	
	funcao inicio()
	{
		cadeia cadastro [1][4]
		cadeia nick
//Cadastro e confirmação de login e senha
faca{		
	 	escreva("Cadastre o seu login: ")
	 	leia(cadastro[0][0])
	 	u.aguarde(2000)
	 	limpa()

	 	escreva("Cadastre a sua senha: ")
	 	leia(cadastro[0][1])
	 	u.aguarde(2000)
	 	limpa()

	 	escreva("Confirme o login cadastrado: ")
	 	leia(cadastro[0][2])
	 	u.aguarde(2000)
	 	limpa()

	 	escreva("Confirme a senha cadastrada: ")
	 	leia(cadastro[0][3])
	 	u.aguarde(2000)
	 	limpa()

//Verificação do cadastro para prosseguir ao login
se (cadastro[0][2] == cadastro[0][0] e cadastro[0][1] == cadastro[0][3]){
	
	escreva("Cadastro feito com sucesso, por favor faça o login")
	u.aguarde(2500)
	limpa()
			}
senao{escreva("Login e senha não correspondidos, repita o cadastro")
u.aguarde(1500)
limpa()
}			

	}
//nome de usuario no site	
enquanto(cadastro[0][2] != cadastro[0][0] ou cadastro[0][1] != cadastro[0][3])
	    	escreva("Como quer ser chamado? ")
	 	leia(nick)
	 	u.aguarde(2000)
	 	limpa()
//Login e senha para entrar no site
	faca{
			escreva("Insira o seu login: ")
			leia(cadastro[0][2])


			escreva("\nInsira a sua senha de acesso: ")
			leia(cadastro[0][3])
			u.aguarde(2000)
			limpa()

		se (cadastro[0][2] == cadastro[0][0] e cadastro[0][1] == cadastro[0][3]){
	
	escreva("Login válido")
	u.aguarde(2500)
	limpa()
			}

		senao{	
	
	escreva("Login e/ou senha inválidos, tente novamente")
	u.aguarde(2000)
	limpa()
			}

						
		}
//Mensagem de entrada no site	(Altere o nome da forma que queira)	
		enquanto(cadastro[0][2] != cadastro[0][0] ou cadastro[0][1] != cadastro[0][3])
	    escreva("Bem vindo ao Generation Brazil " +nick)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1691; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {cadastro, 10, 9, 8}-{nick, 11, 9, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
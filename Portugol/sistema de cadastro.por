programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		cadeia cadastro [1][4]

faca{
		escreva("Cadastre o seu login: ")
		leia(cadastro[0][0])
		u.aguarde(1500)
		limpa()

		escreva("Cadastre a sua senha: ")
		leia(cadastro[0][1])
		u.aguarde(1500)
		limpa()

		escreva("Digite o seu login novamente: ")
		leia(cadastro[0][2])
		u.aguarde(1500)
		limpa()
		
		escreva("Digite a sua senha novamente: ")
		leia(cadastro[0][3])
		u.aguarde(1500)
		limpa()
		
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
enquanto(cadastro[0][2] != cadastro[0][0] ou cadastro[0][1] != cadastro[0][3])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {cadastro, 7, 9, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
//Feito por: Nicolas Alves

programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro pontuacao [5]
		inteiro maiorNumero = 0
//Inserir valores		
		escreva("Insira 5 valores: \n")
			para (inteiro i = 0; i <= 4; i++){
			escreva((i+1) + "º valor: ")
				leia(pontuacao[i])
//Maior numero	
	se (pontuacao[i] > maiorNumero) {
				maiorNumero = pontuacao[i]
			}  

		}

u.aguarde(2300)
limpa()

	escreva("A maior pontuação é: "+ maiorNumero)


u.aguarde(4000)
limpa()	


	escreva("Feito por: Nicolas Alves")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 26; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 7, 10, 9}-{maiorNumero, 8, 10, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Util --> u
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população; ok
b) média do número de filhos; ok
c) maior salário; ok
d) percentual de pessoas com salário até R$100,00. ok
*/

	funcao inicio()
	{
		real salario, mediaSalario 
		real percentSalario = 0
		real maiorSalario = 0
		real somaSalario = 0
		real somaFilhos = 0
		inteiro filhos, mediaFilhos, i
	
		para(i = 0; i <= 5; i++) {
		
			escreva("Quanto de salário você recebe? ")
			leia(salario) 
			u.aguarde(100)
			limpa()

		se (salario > maiorSalario) {
				maiorSalario = salario
			}
		se (salario <= 100){
			percentSalario++
			}

			escreva("Quantos filhos você tem? ")
			leia(filhos) 
			u.aguarde(100)
			limpa()

			



//Calculo para a soma 
somaSalario = salario + somaSalario
somaFilhos = filhos + somaFilhos


		}
//Calculo para media
percentSalario = (percentSalario * 100) / i
mediaFilhos = somaFilhos / i
mediaSalario = somaSalario / i
//Respostas
escreva("A media salario é: ", mediaSalario)	
escreva("\nO maior salario é: ", maiorSalario)
escreva("\nA media de filhos: ", mediaFilhos)
escreva("\n% de pessoas com o salario ate 100 reais: ", percentSalario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
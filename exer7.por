programa
{
//Biblioteca para a conta e para o Timer
	inclua biblioteca Util
	inclua biblioteca Matematica
//Definindo os valores	
	funcao inicio()
	{
		inteiro a, b, c, d, ee, f, x, y
		escreva("Digite os valores de a, b, c, d, ee, f, x, y")
		Util.aguarde(3000) 
		limpa()

		escreva("Digite o valor de a:")
		leia(a)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de b:")
		leia(b)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de c:")
		leia(c)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de d:")
		leia(d)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de e:")
		leia(ee)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de f:")
		leia(f)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de x:")
		leia(x)
		Util.aguarde(1500) 
		limpa()

		escreva("Digite o valor de y:")
		leia(y)
		Util.aguarde(1500) 
		limpa()
	
		x = ((c*ee) - (b*f)) / ((a*ee) - (b*d))
		y = ((a*f) - (c*d)) / ((a*ee) - (b*d))

		escreva("Resultados : \nx ", x, "\ny ", y)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1031; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa {
	funcao inicio() {
	   inteiro porcentDistribuidor, porcentImposto, custoFabrica, custoConsumidor

	   escreva("Quantas % do distribuidor? ")
	   leia(porcentDistribuidor)
	   limpa()

	   escreva("Quantas % de imposto? ")
	   leia(porcentImposto)
	   limpa()
        
        escreva("Custo de Fabrica: ")
        leia(custoFabrica)
        limpa()
        
        custoConsumidor = custoFabrica + porcentDistribuidor * porcentImposto
        
        escreva("\nResultado: ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
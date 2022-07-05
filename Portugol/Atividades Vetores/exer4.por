//Feito por: Nicolas Alves
programa
{
	inclua biblioteca Util --> u
	funcao inicio() {
    
	    inteiro matriz[3][3] = {{7,54,57},{9,23,7},{63,75,1}}
	    inteiro somarTudo = 0, somarDiagonal = 0
	    
	    para(inteiro l = 0; l < 3; l++){
	        somarDiagonal += matriz[l][l]
	        para(inteiro c = 0; c < 3; c++){
	            somarTudo += matriz[l][c]
	        }
	    }
	    
	    escreva("\nA soma da diagonal é: ", somarDiagonal)
	    escreva("\nA soma de tudo é: ", somarTudo)

u.aguarde(5000)
limpa()

	    escreva("Feito por: Nicolas Alves")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 7, 13, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
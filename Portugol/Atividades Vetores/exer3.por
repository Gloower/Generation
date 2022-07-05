//Feito por: Nicolas Alves

programa
{
	inclua biblioteca Util --> u
	
funcao inicio() {
	
	    inteiro n1[4][6] = {{6,2,3,7,5,23}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}}
	    inteiro n2[4][6] = {{7,54,57,44,70,69}, {16,67,8,30,21,5}, {14,19,9,23,7,39}, {94,64,63,75,1,23}}
	    inteiro m1[4][6], m2[4][6]
	    
	    para(inteiro l = 0; l < 4; l++){
	        para(inteiro c = 0; c < 6; c++){
	            m1[l][c] = n1[l][c] + n2[l][c]
	            escreva("Resultados da soma entre entre n1 + n2 = ", m1[l][c])
			  u.aguarde(2000)
			  limpa()


	            m2[l][c] = n1[l][c] - n2[l][c]
	            escreva("Diferença entre n1 e n2 = ", m2[l][c], " de diferença")
	            u.aguarde(2000)
			  limpa()
	            
	        }
	    }
u.aguarde(1500)
limpa()
escreva("Feito por: Nicolas Alves")	    
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 818; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m1, 11, 13, 2}-{m2, 11, 23, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
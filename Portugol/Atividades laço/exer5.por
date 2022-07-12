programa
{
	inclua biblioteca Util --> u

cadeia ASCII =     " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"	
	
	funcao inicio() {
		inteiro i = 233
		
		faca{
		    escreva("\n", i)
		    se(i < 300 e i > 400){
		        i = i + 3
		    }senao{
		        i = i + 5
		    }
		    
		}enquanto(i <= 456)
		u.aguarde(3000)
		limpa()

			escreva("                                        ______                              \n")
			escreva("                                       / ____| |                             \n")
			escreva("                                      | |  __| | ___   _____      _____ _ __ \n")
			escreva("                                      | | |_ | |/ _ \\/ _ \\ \\ /\\ // _ \\'__|\n")
			escreva("                                      | |__| | | (_) | (_) \\ V  V  /   __/ |   \n")
			escreva("                                      \\_____|_|\\___/\\___/ \\_/\\_/\\___|_|   ")
			
		u.aguarde(5000)
		limpa()	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
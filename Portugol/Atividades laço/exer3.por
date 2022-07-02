programa {

inclua biblioteca Util --> u

cadeia ASCII =     " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"
	
	funcao inicio() {
		inteiro numero = 0
		inteiro somaNumeros = 0
		real mediaNumeros = 0
		
		inteiro quantidadeLidos = 0
		
		enquanto(numero >= 0){
		    escreva("Insira um numero: ")
		    leia(numero)
		    
		    se(numero > 0){
    		    somaNumeros = somaNumeros + numero
    		    quantidadeLidos++
		    }
		}
		
		mediaNumeros = somaNumeros / quantidadeLidos
		
		escreva("\nMedia: ", mediaNumeros)
		escreva("\nSoma Total: ", somaNumeros)
		escreva("\nQuantidade de nums lidos: ", quantidadeLidos)

		u.aguarde(5000)
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
 * @POSICAO-CURSOR = 706; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
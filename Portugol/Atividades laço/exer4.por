programa {

inclua biblioteca Util --> u
cadeia ASCII =     " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"

	
	funcao inicio() {
		inteiro numero = 0
		
		escreva("Insira um numero: ")
		leia(numero)
		escreva("\n", numero)
		
		enquanto(numero <= 100){
		    numero = numero * 3
		    escreva(" ", numero)    
		}
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
 * @POSICAO-CURSOR = 839; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
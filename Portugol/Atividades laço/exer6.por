programa
{
	inclua biblioteca Util --> u

cadeia ASCII =     " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"	
	
funcao inicio() {
		inteiro i = 0
		inteiro numero = 0
		inteiro somaNumeros = 0
		
		escreva("Insira um numero: ")
		leia(numero)
		u.aguarde(1050)
		limpa() 
		
		faca{
		    i++
		    somaNumeros = somaNumeros + i
		    escreva(" ", i)
		    u.aguarde(200)
		}enquanto(i < numero)
		escreva(" = ", somaNumeros)
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
 * @POSICAO-CURSOR = 1110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
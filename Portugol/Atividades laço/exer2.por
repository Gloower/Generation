programa
{
	inclua biblioteca Util --> u
/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/

	funcao inicio()
	{
		inteiro i, somaImpares = 0
		cadeia ASCII =     " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"
		
		para (i=0; i<500; i++)
			se(i % 3 == 0 e i % 2 !=  0){
				somaImpares = somaImpares + i
			}

			escreva("Soma dos numeros impares: ", somaImpares)
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
 * @POSICAO-CURSOR = 556; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
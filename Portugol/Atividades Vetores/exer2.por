//Feito por: Nicolas Alves

programa 
{
    inclua biblioteca Util-->u
	funcao inicio() {
		
	   real media = 0
        inteiro maiorNum = 0, atualNum = 0, rodadas = 10,
                resultados[10]
        
        para(inteiro i = 0; i < rodadas; i++){
            resultados[i] = u.sorteia(1, 6)
            escreva(" ", resultados[i])
            media = media + resultados[i]
            
            se(resultados[i] > atualNum){
                maiorNum = 1
                atualNum = resultados[i]
            }senao se(resultados[i] == atualNum){
                maiorNum++
            }
        }

u.aguarde(3000)
limpa()
        
        escreva("\nA media dos lançamentos: ", media/rodadas)
        escreva("\nMaior numero: ", atualNum)
        escreva("\nVez(es) que o maior numero foi repetido: ", maiorNum + " vezes o numero " + atualNum)


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
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
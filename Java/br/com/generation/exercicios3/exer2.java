package java.br.com.generation.exercicios3;
import java.util.*;


public class exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random gerador = new Random(System.nanoTime()); 
        double media = 0;
        int maiorNum = 0, atualNum =0, rodadas = 10;
        int resultados [] = new int [10];

        for(int i = 0; i < rodadas; i++){
            resultados[i] = gerador.nextInt(1,6);
            System.out.println(" " + resultados[i]);
            media = media + resultados[i];

            if(resultados[i] > atualNum){
                maiorNum = 1;
                atualNum = resultados[i];
            }else if(resultados[i] == atualNum){
                maiorNum++;
            }
        }
        System.out.println("A media dos lançamentos: " + media/rodadas);
        System.out.println("Maior numero: " + atualNum);
        System.out.println("Vez(es) que o maior numero foi repetido: "+ maiorNum + " vezes o numero " + atualNum);


        input.close();
    }
}

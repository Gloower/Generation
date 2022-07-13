package java.br.com.generation.exercicios3;
import java.util.*;

public class exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pontuacao [] = new int [5];
        int maiorNumero = 0;

//Inserir valores
        System.out.println("Insira 5 valores: ");
            for(int i = 0; i <= 4; i++){
                System.out.println((i+1) + "º valor: ");
                    pontuacao[i] = input.nextInt();
                   
                    if(pontuacao[i] > maiorNumero){
                        maiorNumero = pontuacao[i];
        
                    }
            }
        System.out.println("A maior pontuação é: " + maiorNumero);

        input.close();
    }
}

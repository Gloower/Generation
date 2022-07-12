package br.com.generation.vetor;
import java.util.*;

public class vetor1 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int vetor [] = new int [10];
            vetor[2] = 100;
            

        for(int a = 0; a <= 9; a++){
            System.out.println("Posição " + a + " | " + vetor[a]);
        }
        u.close();
    }
}

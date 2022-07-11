package br.com.generation.exercicios2;
import java.util.*;


public class exer2 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);  

        int number = 0;

        for (int number2 = 0; number < 10; number++){
            number = u.nextInt();
            if (number % 2 == 0){
                System.out.println("Par");
            }
            else{
                System.out.println("Impar");
            }
        }
    }
}

package br.com.generation.while1;
import java.util.*;

public class While3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero =0;

            while(numero != 10){
                System.out.println("Digite o numero: ");
            numero = read.nextInt();
            
            if(numero == 10){
                System.out.println("Voce acertou o numero 10!!!");
            }

            else{
                System.out.println("Voce errou, tente novamente.");
            }
        
        
        
     read.close();  
        }
    }
}

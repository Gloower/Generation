package Java.br.com.generation.exercicios1;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        int num1, num2, num3, aux;

       

       System.out.println("Escreva o primeiro numero: ");
            num1 = read.nextInt();

       System.out.println("Escreva o segundo numero: ");
            num2 = read.nextInt();

       System.out.println("Escreva o terceiro numero: ");
            num3 = read.nextInt();

//Calculo para ser crescente 
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }

            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;

            }
             
         
            if (num1 > num2) {
                aux= num1;
                num1 = num2;
                num2 = aux;
            }
       
            System.out.println("Ordem crescente: " + num1 + " " + num2 + " " + num3);
            read.close(); 
    }
   
}

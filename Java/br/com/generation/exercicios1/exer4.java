package Java.br.com.generation.exercicios1;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

    double num = 0;


        System.out.println("Insira um número: ");
        num = read.nextDouble();

    if (num % 2 == 0){

        System.out.println("Par"+"\nA raiz quadrada de "+ num +" é: "+ Math.sqrt(num));
    }
    else{
        System.out.println("Impar"+"\nO número "+num+" elevado ao quadrado é: "+ Math.pow(num, 2));
    }

    read.close();
    }
}

package Java.br.com.generation.exercicios1;
import java.util.Scanner;


public class exer1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2, num3;
        int maiorNum = 0;

System.out.println("Insira um numero: ");
num1 = read.nextInt();

System.out.println("Insira um numero: ");
num3 = read.nextInt();

System.out.println("Insira um numero: ");
num2 = read.nextInt();

if (num1 > maiorNum){
    maiorNum = num1;

}

if(num2 > maiorNum){
    maiorNum = num2;
}

if(num3 > maiorNum){
    maiorNum = num3;
}


System.out.println("O maior numero é: " + maiorNum);

read.close();
    }
}

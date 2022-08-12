package Java.exercicios.soltos;
import java.util.*;

public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a, b;
        int soma, divisao, modulo, multipli;

        System.out.println("Insira o primeiro numero da sua conta: ");
        a = input.nextInt();

        System.out.println("Insira o segundo numero da sua conta: ");
        b = input.nextInt();

        soma = a + b;
        divisao = a / b;
        modulo = a % b;
        multipli = a * b;

        System.out.println("Os resultados são: ");
        System.out.println(soma);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(multipli);
        

        if(multipli >= 20){
            System.out.println("A sua multiplicação é maior ou igual a 20.");
        }

        else{
            System.out.println("A sua multiplicação é menor que 20.");
        }
        input.close();
    }
}

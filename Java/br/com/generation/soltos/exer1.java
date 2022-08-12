package Java.exercicios.soltos;
import java.util.*;

public class exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//Declaração dos numeros
        double a, b, resultado;
        char operacao;

        System.out.println("Insira o primeiro numero da sua conta: ");
        a = input.nextDouble();

        System.out.println("Insira o simbolo da operação.");
        System.out.println("+ , - , * , %");
        operacao = input.next().charAt(0);

        System.out.println("Insira o segundo numero da sua conta: ");
        b = input.nextDouble();


//Operações        
        switch(operacao){
            case '+':
            resultado = a + b;
            System.out.println("O resultado da soma é: " + resultado);
        break;

            case '-':
        resultado = a - b;
        System.out.println("O resultado da subtração é: " + resultado);
        break;

            case '/':
            resultado = a / b;
            System.out.println("O resultado da divisão é: " + resultado);
        break;

            case '%':
            resultado = a % b;
            System.out.println("O resultado do modulo é: " + resultado);
        break;

        default:
            System.err.println("Insira uma opção válida.");

        }
    input.close();
    }
}

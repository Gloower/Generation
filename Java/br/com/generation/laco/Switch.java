package Java.br.com.generation.laco;
import java.util.Scanner;



public class Switch {
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);  
    
    int num1, num2, resultado;
    char oper;

System.out.println("Insira o primeiro numero: ");
num1 = read.nextInt();

System.out.println("Digite a operação que você quer(Simbolo): ");
oper = read.next().charAt(0);

System.out.println("Insira o segundo numero: ");
num2 = read.nextInt();

switch(oper){
      case '+':
        resultado = num1 + num2;
    System.out.println("O resultado da soma é: " + resultado);
break;

  case '-':
        resultado = num1 - num2;
    System.out.println("O resultado da subtração é: " + resultado);
break;

  case '/':
        resultado = num1 / num2;
    System.out.println("O resultado da divisão é: " + resultado);
break;

  case '*':
        resultado = num1 * num2;
    System.out.println("O resultado da multiplicação é: " + resultado);

break; 
   
  default:
    System.out.println("Opção invalida, tente novamente.");


}
read.close();

    }
}
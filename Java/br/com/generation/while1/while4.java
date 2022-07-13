package Java.br.com.generation.while1;
import java.util.*;


public class while4 {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);

       int a = 0;

        do{
            System.out.println("Insira o primeiro numero: ");
            int num1 = read.nextInt();

            System.out.println("Insira o segundo numero: ");
            int num2 = read.nextInt(); 

            System.out.println("A divisão entre " + num1 + " e " + num2 + " é: " + (num1/num2));
            a++;
        }
        while(a <= 10);
        read.close();
    }
}

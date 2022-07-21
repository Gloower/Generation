//Entrada e Saida de dados 
package variavel;
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a, b, soma;
        
        System.out.println("Escreva o valor de A: ");
            a = leia.nextInt();


        System.out.println("Escreva o valor de B: ");
            b = leia.nextInt(); 
            
        soma = a + b;

        System.out.println("A soma entre a + b é: " + soma);
leia.close();        
    }
}

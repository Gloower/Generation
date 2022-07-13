package Java.br.com.generation.exercicios2;
import java.util.*;

public class exer6 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int number = 0, plusMult3 = 0, mult3 = 0, numbers = 0;

        do{

            if(number % 3 == 0){
                plusMult3 += number;
                mult3++;
                numbers++;
            }
            else{
                numbers++;
            }

            System.out.println("Insira um numero: ");
            number = u.nextInt();

        }
        while(number != 100);

        System.out.println("A soma dos multiplos de 3 é: " + plusMult3);
        System.out.println("Quantidade de multiplos de 3: " + plusMult3);
        System.out.println("A media de multiplos de 3: " + (plusMult3/mult3));
        System.out.println("Media geral com multiplos de 3: " + (plusMult3/numbers));
    }
}

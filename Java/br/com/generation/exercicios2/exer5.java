package Java.br.com.generation.exercicios2;
import java.util.*;

public class exer5 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int number = 0, plusNum = 0;

        do{
            System.out.println("Insira um numero: ");
            number = u.nextInt();

            plusNum += number;
        }
        while(number != 0);

        System.out.println("A soma total dos numeros é: " + plusNum);
    }
}

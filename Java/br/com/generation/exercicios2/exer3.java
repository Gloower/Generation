package java.br.com.generation.exercicios2;
import java.util.*;

public class exer3 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int age = 0;
        int age50 = 0;
        int age21 = 0;

        while(age != -99){
            System.out.println("Insira uma idade: ");
            age = u.nextInt();

            if (age == -99){
                break;
            }

            if (age < 21){
                age21++;
            }
            else if(age > 50){
                age50++;
            }

            System.out.println("Pessoas menor de 21 anos: " + age21);
            System.out.println("Pessoas maior de 50 anos: " + age50);
            
        }

    }
}

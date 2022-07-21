package exercicios2;
import java.util.*;

public class exer1 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        for(int number = 1000; number < 2000; number++){
        if (number % 11 == 5){
            System.out.println(number);
            }
        }
        u.close();
    }   
}

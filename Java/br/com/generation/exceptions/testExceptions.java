package exceptions;
import java.util.*;

public class testExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try{
            System.out.println("Insira o primeiro numero: ");
            int firstNum = input.nextInt();
            System.out.println("Insira o segundo numero: ");
            int secondNum = input.nextInt();

            int div = firstNum / secondNum;

            System.out.println("O resultado da conta é " + div);
        }
        catch(ArithmeticException e) {
            System.out.println("Impossivel dividir por 0");
        }
        catch(InputMismatchException e){
            System.out.println("Impossivel dividir por uma letra");
        }
      
        input.close();
    }
}

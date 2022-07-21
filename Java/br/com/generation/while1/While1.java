package while1;
import java.util.*;

public class While1 {
    public static void main(String[] args) throws InterruptedException {
    
        Scanner read = new Scanner(System.in);
            
        int contador = 0;

            while(contador <= 10){

                System.out.println("O numero atual é: "+ contador);
                contador++;
                Thread.sleep(1500);

            }
read.close();

        }
    }


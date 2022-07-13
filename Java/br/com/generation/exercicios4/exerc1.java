package Java.br.com.generation.exercicios4;
import java.util.*;

public class exerc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameClient, buyProduct;
        exer1 buyer = new exer1();

        System.out.println("Qual o seu nome? ");
        nameClient = input.next();

        System.out.println("O que você deseja comprar? ");
        buyProduct = input.next();



        buyer.setBuy(buyProduct);
        buyer.setClient(nameClient);
        buyer.console();

input.close();
    }
    
}

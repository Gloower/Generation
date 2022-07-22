package exercicios4;

import java.util.*;

public class exerc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameRetailer, idRetailer, acessRetailer, productRetailer;
        exer2 sell = new exer2();


// Question to fill the get and the set
        System.out.println("Qual o seu nome? ");
        nameRetailer = input.next();

        System.out.println("Qual o seu id de acesso? ");
        idRetailer = input.next();

        System.out.println("Qual a sua senha de acesso? ");
        acessRetailer = input.next();

        System.out.println("Qual produto você vai vender hoje? ");
        productRetailer = input.next();


// Set and get 
        sell.setAcess(acessRetailer);
        sell.setId(idRetailer);
        sell.setProduct(productRetailer);
        sell.setRetailer(nameRetailer);

        sell.console();
input.close();
    }
}

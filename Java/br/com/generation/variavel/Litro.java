package java.br.com.generation.variavel;
import java.util.Scanner;


public class Litro {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);    
        double galao, litros, formula;


        System.out.println("Insira quantos galões de água você precisa? ");
            galao = leia.nextDouble();

        System.out.println("Insira quantos litros de água você precisa? ");
            litros = leia.nextDouble();  
            
        formula = galao * litros;


        System.out.println("Você vai receber " + galao +" galões");
        System.out.println("Você vai receber " + litros +" litros");
        System.out.println("Você vai receber " + formula + " litros de água");

        

        leia.close();
    }
}

package Java.br.com.generation.incremento;
import java.util.Scanner;

public class relacionais {
    public static void main(String[] args) {
    Scanner leia = new Scanner (System.in);
    boolean maiorIdade;
        int idade; 
        

        System.out.println("Quantos anos você tem? ");
        idade = leia.nextInt();   
        
        
    maiorIdade = !(idade >= 18 );  
    System.out.println(maiorIdade);    
    
leia.close();
}

}

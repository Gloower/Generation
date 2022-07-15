package Java.br.com.generation.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int [] vetor = new int [4];

        System.out.println("Antes da exception");

        try{
        vetor[4] = 10;
        System.out.println("Após a exceptiom");
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Existe um problema no script");
}
        System.out.println("Tente resolver o problema ArrayIndexOutOfBoundsException");
    }
}

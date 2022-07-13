package java.br.com.generation.exercicios3;
import java.util.*;

public class exer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 [][] = {{6,32,63,7,5,23}, {1,28,3,64,5,36}, {1,26,3,54,45,6}, {1,62,3,24,35,36}};
        int n2 [][] = {{6,2,13,7,25,23}, {1,42,3,54,5,6}, {1,32,3,45,35,6}, {1,42,33,54,55,6}};
        int m1 [][] = new int [4][6];
        int m2 [][] = new int [4][6];
    
        
            for (int l = 0; l < 4; l++) {
                for(int c = 0; c < 6; c++){
                    m1[l][c] = n1[l][c] + n2[l][c];
                    m2[l][c] = n1[l][c] - n2[l][c];
            
                }
                System.out.println("\nSoma:");
                for(int c = 0; c < 6; c++){
                    System.out.print(m1[l][c] + " | ");

                }

                System.out.println("\nDiferenca:");
                for(int c = 0; c < 6; c++){
                    System.out.print(m2[l][c] + " | ");
                }
            }    
input.close();
    }
}
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


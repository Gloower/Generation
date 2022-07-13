package Java.br.com.generation.exercicios3;



public class exer4 {
    public static void main(String[] args) {
        int matriz [][] = {{7,54,57},{9,23,7},{63,75,1}};
        int somarTudo = 0, somarDiagonal = 0;

            for(int l = 0; l < 3; l++){
            somarDiagonal += matriz[l][l];
	        for(int c = 0; c < 3; c++){
	            somarTudo += matriz[l][c];

            }
        } 
        System.out.println("A soma da diagonal é: " + somarDiagonal);    
        System.out.println("A soma da diagonal é: " + somarTudo); 
    }
}

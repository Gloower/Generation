package br.com.generation.vetor;

import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        double notasAlunos [][] = new double [2][2];
        

        System.out.println("Insira a primeira nota: ");
        notasAlunos[0][0] = u.nextDouble();

        System.out.println("Insira a segunda nota: ");
        notasAlunos[0][1] = u.nextDouble();


        System.out.println("Insira a primeira nota: ");
        notasAlunos[1][0] = u.nextDouble();

        System.out.println("Insira a segunda nota: ");
        notasAlunos[1][1] = u.nextDouble();


        


        for (int a = 0; a < notasAlunos.length; a++){
            for(int b = 0; b < notasAlunos.length; b++){
                System.out.println(notasAlunos[a][b] + " | " + " Suas notas");
            }
        }
        u.close();
    }
}

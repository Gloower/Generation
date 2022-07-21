package vetor;
import java.util.*;

public class vetor2 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        double [] note = new double[2];
        String [] nomeAluno = new String[2];
        double plus = 0.0, average = 0.0;

        //Primeiro aluno
        System.out.println("Insira o nome do aluno: ");
        nomeAluno [0] = u.next();

        System.out.println("Insira a nota do primeiro aluno: ");
        note[0] = u.nextDouble();


        //Segundo aluno
        System.out.println("Insira o nome do aluno: ");
        nomeAluno [1] = u.next();

        System.out.println("Insira a nota do segundo aluno: ");
        note[1] = u.nextDouble();

    
        for(int a = 0; a <= 2; a++){
            System.out.println("Aluno: " + nomeAluno[a] + " sua nota foi: " + note[a]);
        
       

        plus += note[a];
        average = plus / note.length;
        System.out.println("A media das notas: " + average);
        }

        
        u.close();
    }
}


//DANDO ERRO, ARRUMAR DPS
package laco;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double primeiraNota, segundaNota, media;

            System.out.println("Escreva a primeira nota do aluno: ");
            primeiraNota = leia.nextDouble();

            System.out.println("Escreva a segunda nota do aluno: ");
            segundaNota = leia.nextDouble();

//Calculo da media
            media = (primeiraNota + segundaNota) / 2;
            System.out.println("A media do aluno é de: " + media);

//Aprovado ou reprovado
            if(media >= 7){
                System.out.println("Aluno foi aprovado com sucesso.");
            }

            else{
                System.out.println("Aluno foi reprovado.");
            }

  leia.close();          
    }

}

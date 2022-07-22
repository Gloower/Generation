package exercicios2;
import java.util.*;

public class exer4 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        Random generate = new Random(System.nanoTime());

        int age, sex, calm;

        int pessoasCalm = 0, mulheresNerv = 0, homensAgressive = 0;
        int pessoasCalm18 = 0, outrosCalm = 0, pessoasAgres40 = 0;
        int i = 0;

        while (i < 500){
      System.out.print("Insira idade: ");
      age = u.nextInt();
      System.out.print("Insira sexo: (1 - Masc / 2 - Fem / 3 - outros) ");
      sex = u.nextInt();
      System.out.print("Insira opção: (1 - calma / 2 - nervosa / 3 - agressiva) ");
      calm = u.nextInt();
      

      if (calm == 1){
        pessoasCalm++;
      }
      if (sex == 2 && calm == 2){
        mulheresNerv++;
      }
      if (sex == 1 && calm == 3){
        homensAgressive++;
      }
      if (sex == 3 && calm == 1){
        outrosCalm++;
      }
      if (age > 40 && calm == 2){
        pessoasAgres40++;
      }
      if (age < 18 && calm == 1){
        pessoasCalm18++;
      }
      i++;
    

    System.out.println("Pessoas Calmas: " + pessoasCalm);
    System.out.println("Mulheres Nervosas: " + mulheresNerv);
    System.out.println("Homens Agressivos: " + homensAgressive);
    System.out.println("Outros Calmos: " + outrosCalm);
    System.out.println("Pessoas Calmas Menor 18: " + pessoasCalm18);
    System.out.println("Pessoas Nervosas Maior 40: " + pessoasAgres40);


            }
            u.close();
    }
   
}




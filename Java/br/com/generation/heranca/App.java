package Java.br.com.generation.heranca;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;


        Teacher prof = new Teacher();

        prof.setName(" Nicolas");
        prof.setEndereço("Rua Gregorio Allegri, 35 | ");
        prof.setIdade(27);
        prof.setSubject(" Java nu e cru ");
        prof.setSalario(2000.0);

        prof.console();
    }
}

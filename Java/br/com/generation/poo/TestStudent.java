package java.br.com.generation.poo;



public class TestStudent {
        public static void main(String[] args) {
        String name = "Nicolas";
        
        Student aluno = new Student();

        aluno.setName(name);

        System.out.println("O nome da pessoa é: " + aluno.getName());
            
    }
}

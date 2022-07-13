package Java.br.com.generation.projeto;
import java.util.*;

public class login {
    public static void main(String[] args)  throws InterruptedException {
        Scanner read = new Scanner(System.in);

        String cadastro [] = new String [4];
        String nickname;

//Cadastro e confirmação de login e senha. 

do{
    System.out.println("Cadastre o seu login: ");
    cadastro[0] = read.next();
    Thread.sleep(2000);

    System.out.println("Cadastre a sua senha: ");
    cadastro[1] = read.next();
    Thread.sleep(2000);

    System.out.println("Confirme o seu login: ");
    cadastro[2] = read.next();
    Thread.sleep(2000);
    
    System.out.println("Confirme a sua senha: ");
    cadastro[3] = read.next();
    Thread.sleep(2000);

//Verificação de login e senha --> assim prosseguir para o login. 

   if (cadastro[2].equals(cadastro[0]) && cadastro [1].equals(cadastro[3])){
    System.out.println("Login cadastrado com sucesso.");
    
   }
   else{
    System.out.println("Login ou senha não correspondem, repita o cadastro.");
    
   }
}while(!cadastro[2].equals(cadastro[0]) && !cadastro[1].equals(cadastro [3]));

//Nome de usuario no site. 

           
System.out.println("Cadastre o seu nome de usuario: ");
nickname = read.next();
Thread.sleep(2500);

do {
    System.out.println("Insira o seu login: ");
    cadastro[2] = read.next();

    System.out.println("Insira a sua senha: ");
    cadastro[3] = read.next();

    if(cadastro [2].equals(cadastro [0])  && cadastro [1].equals(cadastro[3]) ){
        System.out.println("Login valido");
        Thread.sleep(2000);
    }

    else{
        System.out.println("Login e/ou senha invalidos, tente novamente");
    }
}while(!cadastro[2].equals(cadastro [0]) && !cadastro [1].equals(cadastro [3]));
        System.out.println("Bem vinde ao .......");

        
read.close();
    }
}

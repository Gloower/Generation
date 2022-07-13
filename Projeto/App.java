package Projeto;
import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        String [] Login = new String [1];
        String [] Senha = new String [1];
        String [] Cadastro = new String [4];
      
//Api's de cadastro e login
        Login logs = new Login();
        Scanner input = new Scanner(System.in);

//Sistema de Cadastro.       
do{
        System.out.println("Cadastre o seu login: ");
        Cadastro [0] = input.next();

        System.out.println("Cadastre a sua senha: ");
        Cadastro [1] = input.next();

        System.out.println("Confirme o cadastro do seu login: ");
        Cadastro [2] = input.next();

        System.out.println("Confirme o cadastro da sua senha: ");
        Cadastro [3] = input.next();
    
        if (Cadastro[2].equals(Cadastro[0]) && Cadastro[1].equals(Cadastro[3])){
            System.out.println("Login cadastro com sucesso.");
            Thread.sleep(2000);
        }

        else{
            System.out.println("Login ou senha não correspondem, repita o cadastro.");
        }
    
    
    
    
    
    
    
    
    
    }while(!Cadastro[2].equals(Cadastro[0]) || !Cadastro[1].equals(Cadastro [3]));

//Sistema de login.

do{
    System.out.println("Insira o seu login de entrada: ");
    Login [0] = input.next();

    System.out.println("Insira a sua senha de entrada: ");
    Senha [0] = input.next();

    if(Login [0].equals(Cadastro [2])  && Senha [0].equals(Cadastro[3]) ){
        System.out.println("Login valido");
        Thread.sleep(2000);
    }

    else{
        System.out.println("Login e/ou senha invalidos, tente novamente");
    }

}while(!Login[0].equals(Cadastro [2]) || !Senha [0].equals(Cadastro [3]));


//Segurança dos dados
        logs.setUser(Cadastro[2]); 
        logs.setPassword(Cadastro[3]);
        logs.login();


        input.close();
    }
}

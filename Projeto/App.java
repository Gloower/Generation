package Projeto;
import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        String [] Login = new String [1]; // --> Login do usuario.
        String [] Senha = new String [1]; // --> Senha do usuario.
        String [] Cadastro = new String [4]; // --> Cadastro do usuario.
        int button; // --> Decisão do codigo.
      
//Api's de cadastro e login
        Login logs = new Login();
        Scanner input = new Scanner(System.in);

//Desição de login --> 1 - Para fazer o cadastro 2 - Para fazer o login 3 - Quem somos nós?



System.out.println("Use 1 para fazer o cadastro | 2 para - Ja tenho cadastro | 3 para - Quem somos nós?");
button = input.nextInt();

//Sistema de Cadastro. --> Inserir login e senha - confirmar os dois.
if(button == 1){
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

//Login após o cadastro.
    do{
        System.out.println("Insira o seu login de entrada: ");
        Login [0] = input.next();
    
        System.out.println("Insira a sua senha de entrada: ");
        Senha [0] = input.next();
    
        if(Login [0].equals(Cadastro [2])  && Senha [0].equals(Cadastro[3]) ){
            System.out.println("Login valido");
            Thread.sleep(2000);
        }
    
        else {
            System.out.println("Login e/ou senha invalidos, tente novamente");
        }
    
    }while(!Login[0].equals(Cadastro [2]) || !Senha [0].equals(Cadastro [3]));    
}


    
//Sistema de login. --> Caso não tenha cadastro, ele retorna para o cadastro.
if(button == 2){
    do{
        System.out.println("Insira o seu login de entrada: ");
        Login [0] = input.next();
    
        System.out.println("Insira a sua senha de entrada: ");
        Senha [0] = input.next();
    
        if(Login [0].equals(Cadastro [2])  && Senha [0].equals(Cadastro[3]) ){
            System.out.println("Login valido");
            Thread.sleep(2000);
        }

//Login não cadastrado --> faz o cadastro    
        else {
            System.out.println("Login não cadastrado, faça o cadastro.");
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
    
    }    
}while(!Login[0].equals(Cadastro [2]) || !Senha [0].equals(Cadastro [3]));
}

//Quem somos nós?
if(button == 3){
    System.out.println("");
}




//Segurança dos dados --> Api.java
        logs.setUser(Cadastro[2]); 
        logs.setPassword(Cadastro[3]);
        logs.login();


        input.close();
    }
}

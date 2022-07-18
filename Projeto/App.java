//Codigo feito em Java, feito por: Hellen Sabo, Matheus Mota, Nicolas Alves, Victor Mariano, Vitor Galdino, Yasmin Nicolau!

package Projeto;
import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        String [] Login = new String [1]; // --> Login do usuario.
        String [] Senha = new String [1]; // --> Senha do usuario.
        String [] Cadastro = new String [5]; // --> Cadastro do usuario.
        int button, botao, quantidade; // --> DecisÃ£o do codigo.
        int choose = 0;
        String Address;



//Api's de cadastro e login
        Beneficiario bene = new Beneficiario();
        Login logs = new Login();
        Scanner input = new Scanner(System.in);



//ASCII no menu --> do(aÃ§Ã£o);
System.out.println("    _________               _____             _      _                   ");
System.out.println("    //    ) )          ((  // | |           // \\ \\_//            ))  ");
System.out.println("   //    / /  ___     //  //__| |     ___      ___      ___     //   ");
System.out.println("  //    / / //   ) ) //  / ___  |   //   ))  //   ) ) //   ))  //  () ");
System.out.println(" //    / / //   / / //  //    | |  //       //   / / //   / / //     ");
System.out.println("//____/ / ((___/ / ((  //     | | ((____   ((___( ( ((___/ / //   //  ");
System.out.println("--------               -      ---                                //                    ");

Thread.sleep(4000);




//DesiÃ§Ã£o de login --> 1 - Para fazer o cadastro 2 - Para fazer o login 3 - Quem somos nÃ³s?

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

        input.nextLine();
        System.out.println("Informe o seu endereço" + " para prosseguir o cadastro: ");
        Cadastro[4] = input.nextLine();

        


    
        if (Cadastro[2].equals(Cadastro[0]) && Cadastro[1].equals(Cadastro[3])){
            System.out.println("Login cadastro com sucesso.");
            Thread.sleep(2000);
        }

        else{
            System.out.println("Login ou senha não correspondem, repita o cadastro.");
        }
    
    }while(!Cadastro[2].equals(Cadastro[0]) || !Cadastro[1].equals(Cadastro [3]));

    

//Login apÃ³s o cadastro.
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
               } // --> fechamento do if 1


    
//Sistema de login. --> Caso nÃ£o tenha cadastro, ele retorna para o cadastro.
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

//Login nÃ£o cadastrado --> faz o cadastro    
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
                
                input.nextLine();
                System.out.println("Informe o seu endereço para prosseguir o cadastro: ");
                Cadastro[4] = input.nextLine();
            
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
                } // --> fechamento do if 2

//Quem somos nÃ³s?
if(button == 3){
    System.out.println("Somos um grupo de estudantes e aspirantes da tecnologia, que compartilha experiências vividas ao longo da vida em comunidades carentes.");
    System.out.println("Diante disso surgiu a ideia do projeto Do(ação), que visa usar a tecnologia como uma ferramenta aliada que ajuda pessoas da nossa cidade a enfrentarem as dificuldades do dia a dia.");
    System.out.println("Pessoas carentes de ajuda e pessoas carentes de ajudar. É simplesmente uma troca de amor.");
    System.out.println("Sim, aqui todos são ajudados de uma forma ou de outra, o importante é colocar o Do em ação ;)");
    System.out.println("Gostou? Quer ser um colaborador contínuo ou tem mais dúvidas ? Envie um e-mail para - - > doeparanos@do.acao.org");

    Thread.sleep(7000);

    do{
        System.out.println("Cadastre o seu login: ");
        Cadastro [0] = input.next();

        System.out.println("Cadastre a sua senha: ");
        Cadastro [1] = input.next();

        System.out.println("Confirme o cadastro do seu login: ");
        Cadastro [2] = input.next();

        System.out.println("Confirme o cadastro da sua senha: ");
        Cadastro [3] = input.next();

        input.nextLine();
        System.out.println("Informe o seu endereço para prosseguir o cadastro: ");
        Cadastro[4] = input.nextLine();

        


    
        if (Cadastro[2].equals(Cadastro[0]) && Cadastro[1].equals(Cadastro[3])){
            System.out.println("Login cadastro com sucesso.");
            Thread.sleep(2000);
        }

        else{
            System.out.println("Login ou senha não correspondem, repita o cadastro.");
        }
    
    }while(!Cadastro[2].equals(Cadastro[0]) || !Cadastro[1].equals(Cadastro [3]));

    

//Login apÃ³s o cadastro.
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


                } // --> fechamento do if 3


//SeguranÃ§a dos dados --> Api.java
bene.setEndereco(Cadastro[4]);
logs.setUser(Cadastro[2]); 
logs.setPassword(Cadastro[3]);
logs.login(); // Mensagem de bem vindo.



  




System.out.println("Como o do(acao) pode ser útil para você");
System.out.println("Use 1 para - Eu gostaria de doar | e 2 para - Eu preciso de ajuda! | 3 para - Conhece alguem que precisa de uma do(ação);? ");

botao = input.nextInt();
//Escolha 1 --> Feito por Nicolas e Matheus Mota.
    if (botao == 1) {
    System.out.println("O que voce quer doar? ");
    System.out.println("1- Roupas | 2- Roupas de cama | 3- Mantimentos | 4- Brinquedos");
    choose = input.nextInt();
    Thread.sleep(2000);

    if(choose == 1){
    System.out.println("Quantas peças de roupas você quer doar? ");
    quantidade = input.nextInt();
    }

    if(choose == 2){
    System.out.println("Quantas peças de roupas de cama você quer doar? ");
    quantidade = input.nextInt();
    }

    if(choose == 3){
    System.out.println("Quantos mantimentos você quer doar? ");
    quantidade = input.nextInt();
    }

    if(choose == 4){
    System.out.println("Quantos brinquedos você quer doar? ");
    quantidade = input.nextInt();
    }

Thread.sleep(2000);
System.out.println("Em 4 dias úteis iremos ao seu endereço:" + bene.getEndereco() + " fazer a coleta da doação.");
Thread.sleep(7000);
System.out.println("Obrigado por contribuir com o nosso projeto <3");
}

//Escolha 2   --> Feito por Vitor Galdino

    if (botao == 2) {
        do {
			try {
		System.out.println("Kits disponiveis: ");
		System.out.println("Kit 1: 4 peças de roupa || 3 peças de roupa de cama || 2 mantimentos || 1 brinquedo");
		System.out.println("KIt 2: 3 peças de roupa || 1 peças de roupa de cama || 4 mantimentos || 1 brinquedo");
		System.out.println("Kit 3: 2 peças de roupa || 4 peças de roupa de cama || 3 mantimentos || 1 brinquedo");
		System.out.println("\nQual kit você deseja?");
		choose = input.nextInt();
			}
			catch(InputMismatchException f) {
				Thread.sleep(500);
	        	System.out.println("Ops... parece que o sistema caiu. Tente iniciar novamente.");
	        	System.exit(0);
	        }
		
		
		if (choose == 1) {
			System.out.println("Você escolheu o kit 1");
			
			
		}
		else if (choose == 2) {
			System.out.println("Você escolheu o kit 2");
			
		}
		else if (choose == 3) {
			System.out.println("Você escolheu o kit 3");
			
		}
		else {
			System.out.println("Ops... parece que não temos esse kit, por que não seleciona um outro?\n");
			continue;
			}
		
		} while(choose > 3 );		
		
		
		input.nextLine();
		
		Thread.sleep(2000);
		System.out.println("Enviaremos para o endereço: " + bene.getEndereco() + " as doações.");
        Thread.sleep(7000);
        System.out.println("Obrigado por contribuir com o nosso projeto <3");





    }

    if (botao == 3) {
    input.nextLine();    
    System.out.println("Informe o endereço da pessoa que queira indicar: ");
    Address = input.nextLine();
    bene.setBenefiAddress(Address);
    do {
        try {
    System.out.println("Kits disponiveis: ");
    System.out.println("Kit 1: 4 peças de roupa || 3 peças de roupa de cama || 2 mantimentos || 1 brinquedo");
    System.out.println("KIt 2: 3 peças de roupa || 1 peças de roupa de cama || 4 mantimentos || 1 brinquedo");
    System.out.println("Kit 3: 2 peças de roupa || 4 peças de roupa de cama || 3 mantimentos || 1 brinquedo");
    System.out.println("\nQual kit você deseja?");
    choose = input.nextInt();
        }
        catch(InputMismatchException f) {
        	Thread.sleep(500);
        	System.out.println("Ops... parece que o sistema caiu. Tente iniciar novamente.");
        	System.exit(0);
        }
    
    
    if (choose == 1) {
        System.out.println("Você escolheu o kit 1");
        
        
    }
    else if (choose == 2) {
        System.out.println("Você escolheu o kit 2");
        
    }
    else if (choose == 3) {
        System.out.println("Você escolheu o kit 3");
        
    }
    else {
        System.out.println("Ops... parece que não temos esse kit, por que não seleciona um outro?\n");
        continue;
        }
    
    } while(choose > 3 );		
    
    
    input.nextLine();
    

    Thread.sleep(2000);
    System.out.println("Enviaremos para o endereço: " + bene.getBenefiAddress() + " as doações.");
    Thread.sleep(7000);
    System.out.println("Obrigado por contribuir com o nosso projeto <3");



    }





System.out.println("Código feito para o trabalho em java para a Generation Brazil.");
System.out.println("Feito por: Hellen Sabo, Matheus Mota, Nicolas Alves, Victor Mariano, Vitor Galdino, Yasmin Nicolau.");

    
        input.close();
    
    } // --> Main

} // --> Class
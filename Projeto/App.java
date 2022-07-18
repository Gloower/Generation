//Codigo feito em Java, feito por: Hellen Sabo, Matheus Mota, Nicolas Alves, Victor Mariano, Vitor Galdino, Yasmin Nicolau!

package Projeto;
import java.util.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        String [] Login = new String [1]; // --> Login do usuario.
        String [] Senha = new String [1]; // --> Senha do usuario.
        String [] Cadastro = new String [5]; // --> Cadastro do usuario.
        int button, botao, quantidade; // --> Decisão do codigo.
        int choose = 0;
        String Address;



//Api's de cadastro e login
        Beneficiario bene = new Beneficiario();
        Login logs = new Login();
        Scanner input = new Scanner(System.in);



//ASCII no menu --> do(ação);
System.out.println("    _________               _____             _      _                   ");
System.out.println("    //    ) )          ((  // | |           // \\ \\_//            ))  ");
System.out.println("   //    / /  ___     //  //__| |     ___      ___      ___     //   ");
System.out.println("  //    / / //   ) ) //  / ___  |   //   ))  //   ) ) //   ))  //  () ");
System.out.println(" //    / / //   / / //  //    | |  //       //   / / //   / / //     ");
System.out.println("//____/ / ((___/ / ((  //     | | ((____   ((___( ( ((___/ / //   //  ");
System.out.println("--------               -      ---                                //                    ");

Thread.sleep(4000);




//Desição de login --> 1 - Para fazer o cadastro 2 - Para fazer o login 3 - Quem somos nós?

System.out.println("Use 1 para fazer o cadastro | 2 para - Ja tenho cadastro | 3 para - Quem somos n�s?");
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
        System.out.println("Informe o seu endere�o" + " para prosseguir o cadastro: ");
        Cadastro[4] = input.nextLine();

        


    
        if (Cadastro[2].equals(Cadastro[0]) && Cadastro[1].equals(Cadastro[3])){
            System.out.println("Login cadastro com sucesso.");
            Thread.sleep(2000);
        }

        else{
            System.out.println("Login ou senha n�o correspondem, repita o cadastro.");
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
               } // --> fechamento do if 1


    
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
            System.out.println("Login n�o cadastrado, fa�a o cadastro.");
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
                System.out.println("Informe o seu endere�o para prosseguir o cadastro: ");
                Cadastro[4] = input.nextLine();
            
                if (Cadastro[2].equals(Cadastro[0]) && Cadastro[1].equals(Cadastro[3])){
                    System.out.println("Login cadastro com sucesso.");
                    Thread.sleep(2000);
                }
        
                else{
                    System.out.println("Login ou senha n�o correspondem, repita o cadastro.");
                }
        }while(!Cadastro[2].equals(Cadastro[0]) || !Cadastro[1].equals(Cadastro [3]));

    }    
}while(!Login[0].equals(Cadastro [2]) || !Senha [0].equals(Cadastro [3]));
                } // --> fechamento do if 2

//Quem somos nós?
if(button == 3){
    System.out.println("Somos um grupo de estudantes e aspirantes da tecnologia, que compartilha experi�ncias vividas ao longo da vida em comunidades carentes.");
    System.out.println("Diante disso surgiu a ideia do projeto Do(a��o), que visa usar a tecnologia como uma ferramenta aliada que ajuda pessoas da nossa cidade a enfrentarem as dificuldades do dia a dia.");
    System.out.println("Pessoas carentes de ajuda e pessoas carentes de ajudar. � simplesmente uma troca de amor.");
    System.out.println("Sim, aqui todos s�o ajudados de uma forma ou de outra, o importante � colocar o Do em a��o ;)");
    System.out.println("Gostou? Quer ser um colaborador cont�nuo ou tem mais d�vidas ? Envie um e-mail para - - > doeparanos@do.acao.org");

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
        System.out.println("Informe o seu endere�o para prosseguir o cadastro: ");
        Cadastro[4] = input.nextLine();

        


    
        if (Cadastro[2].equals(Cadastro[0]) && Cadastro[1].equals(Cadastro[3])){
            System.out.println("Login cadastro com sucesso.");
            Thread.sleep(2000);
        }

        else{
            System.out.println("Login ou senha n�o correspondem, repita o cadastro.");
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


                } // --> fechamento do if 3


//Segurança dos dados --> Api.java
bene.setEndereco(Cadastro[4]);
logs.setUser(Cadastro[2]); 
logs.setPassword(Cadastro[3]);
logs.login(); // Mensagem de bem vindo.



  




System.out.println("Como o do(acao) pode ser �til para voc�");
System.out.println("Use 1 para - Eu gostaria de doar | e 2 para - Eu preciso de ajuda! | 3 para - Conhece alguem que precisa de uma do(a��o);? ");

botao = input.nextInt();
//Escolha 1 --> Feito por Nicolas e Matheus Mota.
    if (botao == 1) {
    System.out.println("O que voce quer doar? ");
    System.out.println("1- Roupas | 2- Roupas de cama | 3- Mantimentos | 4- Brinquedos");
    choose = input.nextInt();
    Thread.sleep(2000);

    if(choose == 1){
    System.out.println("Quantas pe�as de roupas voc� quer doar? ");
    quantidade = input.nextInt();
    }

    if(choose == 2){
    System.out.println("Quantas pe�as de roupas de cama voc� quer doar? ");
    quantidade = input.nextInt();
    }

    if(choose == 3){
    System.out.println("Quantos mantimentos voc� quer doar? ");
    quantidade = input.nextInt();
    }

    if(choose == 4){
    System.out.println("Quantos brinquedos voc� quer doar? ");
    quantidade = input.nextInt();
    }

Thread.sleep(2000);
System.out.println("Em 4 dias �teis iremos ao seu endere�o:" + bene.getEndereco() + " fazer a coleta da doa��o.");
Thread.sleep(7000);
System.out.println("Obrigado por contribuir com o nosso projeto <3");
}

//Escolha 2   --> Feito por Vitor Galdino

    if (botao == 2) {
        do {
			try {
		System.out.println("Kits disponiveis: ");
		System.out.println("Kit 1: 4 pe�as de roupa || 3 pe�as de roupa de cama || 2 mantimentos || 1 brinquedo");
		System.out.println("KIt 2: 3 pe�as de roupa || 1 pe�as de roupa de cama || 4 mantimentos || 1 brinquedo");
		System.out.println("Kit 3: 2 pe�as de roupa || 4 pe�as de roupa de cama || 3 mantimentos || 1 brinquedo");
		System.out.println("\nQual kit voc� deseja?");
		choose = input.nextInt();
			}
			catch(InputMismatchException f) {
				Thread.sleep(500);
	        	System.out.println("Ops... parece que o sistema caiu. Tente iniciar novamente.");
	        	System.exit(0);
	        }
		
		
		if (choose == 1) {
			System.out.println("Voc� escolheu o kit 1");
			
			
		}
		else if (choose == 2) {
			System.out.println("Voc� escolheu o kit 2");
			
		}
		else if (choose == 3) {
			System.out.println("Voc� escolheu o kit 3");
			
		}
		else {
			System.out.println("Ops... parece que n�o temos esse kit, por que n�o seleciona um outro?\n");
			continue;
			}
		
		} while(choose > 3 );		
		
		
		input.nextLine();
		
		Thread.sleep(2000);
		System.out.println("Enviaremos para o endere�o: " + bene.getEndereco() + " as doa��es.");
        Thread.sleep(7000);
        System.out.println("Obrigado por contribuir com o nosso projeto <3");





    }

    if (botao == 3) {
    input.nextLine();    
    System.out.println("Informe o endere�o da pessoa que queira indicar: ");
    Address = input.nextLine();
    bene.setBenefiAddress(Address);
    do {
        try {
    System.out.println("Kits disponiveis: ");
    System.out.println("Kit 1: 4 pe�as de roupa || 3 pe�as de roupa de cama || 2 mantimentos || 1 brinquedo");
    System.out.println("KIt 2: 3 pe�as de roupa || 1 pe�as de roupa de cama || 4 mantimentos || 1 brinquedo");
    System.out.println("Kit 3: 2 pe�as de roupa || 4 pe�as de roupa de cama || 3 mantimentos || 1 brinquedo");
    System.out.println("\nQual kit voc� deseja?");
    choose = input.nextInt();
        }
        catch(InputMismatchException f) {
        	Thread.sleep(500);
        	System.out.println("Ops... parece que o sistema caiu. Tente iniciar novamente.");
        	System.exit(0);
        }
    
    
    if (choose == 1) {
        System.out.println("Voc� escolheu o kit 1");
        
        
    }
    else if (choose == 2) {
        System.out.println("Voc� escolheu o kit 2");
        
    }
    else if (choose == 3) {
        System.out.println("Voc� escolheu o kit 3");
        
    }
    else {
        System.out.println("Ops... parece que n�o temos esse kit, por que n�o seleciona um outro?\n");
        continue;
        }
    
    } while(choose > 3 );		
    
    
    input.nextLine();
    

    Thread.sleep(2000);
    System.out.println("Enviaremos para o endere�o: " + bene.getBenefiAddress() + " as doa��es.");
    Thread.sleep(7000);
    System.out.println("Obrigado por contribuir com o nosso projeto <3");



    }





System.out.println("C�digo feito para o trabalho em java para a Generation Brazil.");
System.out.println("Feito por: Hellen Sabo, Matheus Mota, Nicolas Alves, Victor Mariano, Vitor Galdino, Yasmin Nicolau.");

    
        input.close();
    
    } // --> Main

} // --> Class
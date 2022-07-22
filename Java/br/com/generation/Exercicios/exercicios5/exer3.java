package exercicios5;
import java.util.*;

public class exer3 {
    public static void main(String[] args) {

        ArrayList<exer3Stock> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        String name;
        int contador, quantidade = 0;
        double preco = 0;

        do {
            System.out.println("\n1 - Inserir Produto | 2 - Remover Produto | 3 - Atualizar Produto | 4 - Listar todos produtos");
            contador = entrada.nextInt();

            switch (contador){
                case 1:
                    System.out.println("Insira nome produto: ");
                    name = entrada.next();
                    System.out.println("Insira quantidade produto: ");
                    quantidade = entrada.nextInt();
                    System.out.println("Insira preco produto: ");
                    preco = entrada.nextDouble();
                    lista.add(new exer3Stock(name, quantidade, preco));

                    contador = 0;
                    break;

                case 2:
                    System.out.println("\nInsira nome produto: ");
                    name = entrada.next();
                    int i = 0;
                    for (exer3Stock item: lista) {
                        if (item.getnameProduct().equals(name)){
                            lista.remove(i);
                            break;
                        }
                        i++;
                    }
                    contador = 0;
                    break;

                case 3:
                    System.out.println("Insira nome produto: ");
                    name = entrada.next();

                    for (exer3Stock item: lista) {
                        if (item.getnameProduct().equals(name)){
                            System.out.println("Insira nova quantidade produto: ");
                            quantidade = entrada.nextInt();
                            System.out.println("Insira novo preco produto: ");
                            preco = entrada.nextDouble();

                            item.setquantidadeStock(quantidade);
                            item.setPreco(preco);
                            break;
                        }
                    }

                    contador = 0;
                    break;

                case 4:
                    System.out.println("\nListando produtos: ");
                    for (exer3Stock item: lista) {
                        System.out.println("Produto: " + item.getnameProduct() + " Qtd: " + item.getquantidadeStock() + " R$" + item.getPreco());
                    }
                    contador = 0;
                    break;
                default:
                    contador = 9;
                    break;
            }
        }while (contador != 9);
    }
}
package br.com.generation.exercicios1;
import java.util.Scanner;

/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */



public class exer3 {
public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int idade;

    System.out.println("Quantos anos você tem? ");
    idade = read.nextInt();

    if(idade >= 10 && idade <= 14){
        System.out.println("Você é cosiderado infantil, você tem: " + idade + "anos." );

    }

    if(idade >= 15 && idade <= 17){
        System.out.println("Você é cosiderado juvenil, você tem: " + idade + "anos." );

    }
    
    if(idade >= 18 && idade <= 25){
        System.out.println("Você é cosiderado adulto, você tem: " + idade + "anos." );

    }
    
    else{
        System.out.println("Idade não permitida para a pesquisa!");
    }

    read.close();
 } 
}

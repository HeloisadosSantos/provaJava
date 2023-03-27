import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
     
//  Aplicação deverá permitir a “entrada” de dois números, do tipo decimal, e deve realizar operações
// aritméticas entre eles:
// a. O Usuário deverá ser capas de escolher a operação Aritmética a ser executada entre os dois
// números. (Adição, Subtração, Multiplicação, Divisão);
// b. Ao final das operações aritméticas os resultados devem ser exibidos para o usuário;

        System.out.println("Digite dois números decimais ,podendo ser 1- adição 2- subtração 3-multiplicação 4- divisão");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int op =sc.nextInt();

        if (op==1) {
            System.out.println("O resultado da sua operação será de " + (val1+val2));
        }
        if (op==2){
            System.out.println("O resulatdo é de " + (val1-val2));
        }
        if (op==3){
            System.out.println("O resultado é de " + (val1*val2));
        }
        if (op==4){
            System.out.println("O resultado é de " + (val1/val2));
        }
    }   
//    4 times que terão na escola, (Time do Chris, Time do Greg, Time do Caruso, Time do Jerome).
// a. O Programa deve ler o no de Matricula do aluno;
// b. O Programa deve escolher o Time que o Aluno irá participar;

    public void Exercicio2() {
        System.out.println("Digite seu número de matricula");
        int matr = sc.nextInt();
        int time = matr % 4;

        if (time==0) {
            System.out.println("Você ficará no time  do Chris ");
        } 
        if (time==1){
            System.out.println("Você ficará no time Greg");
        }
        if (time==2) {
            System.out.println("Você ficrá no time Caruso");
        }
        if (time==3) {
            System.out.println("Você ficará no time Jerome");
        }
    }

// A Quitanda do Seu Madruga está vendendo frutas com a seguinte tabela de preços:
// Morangos – R$ 3,50 o kilo;
// Maças – R$2,30 o kilo;
// Bananas – R$ 1,80 o kilo;
// Se o cliente comprar mais de 15 Kg em frutas ou o valor total da compra ultrapassar R$ 30,00,
// receberá ainda um desconto de 10% sobre este total.
// a. Escreva um algoritmo para ler a quantidade (em Kg) de morangos, a quantidade (em
// Kg) de maçãs e a quantidade (em Kg) de bananas adquiridas
// b. escreva o valor a ser pago pelo cliente.

    public void Exercicio3() {
        System.out.println("Digite o número da fruta que você deseja (1-Morango 2-Maçã 3-Banana) e o seu kilo");

        double morango;
        double maca;
        double banana;
        double kilo = sc.nextDouble();
        String frut = sc.nextLine();
        morango = 3.50;
        maca = 2.30;
        banana = 1.80;

        System.out.println("O preço do produto é de " + morango*kilo + " reais");

        double percentualDesconto = 10.0;
        percentualDesconto = kilo/100;
        System.out.println("O desconto será de " + percentualDesconto + "%.");
        
        double desconto = frut*percentualDesconto/100;
       
        double precoComDesconto = frut - desconto;

        System.out.println("Com desconto, o produto sai " + "por R$" + precoComDesconto + ".");
        System.out.println("Fim!");
        System.out.println("====================");
    }
}
package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao(){

        double area;
        double preco;
        double largura, comprimento, metro_quadrado;

        System.out.println("Digite area: ");
        Scanner leia = new Scanner(System.in);
        area = leia.nextDouble();

        System.out.println("Digite largura ");
        largura = leia.nextDouble();

        System.out.println("Digite o comprimento: ");
        comprimento = leia.nextDouble();
         
        area = largura * comprimento;
        System.out.println("Digite o preco do metro quadrado");
        metro_quadrado = leia.nextDouble();

        preco = area * metro_quadrado;
        System.out.printf("A area é = " + "%.2f", area);
        System.out.printf ("\nO valor do metro quadrado é = " + "R$" +  "%.2f" , preco);
    }
}

package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio2 {
    public static void resolucao(){
             
        int n1;
        
        System.out.print("Digite um numero: \n");
        Scanner leia = new Scanner(System.in);
        n1 = leia.nextInt();

        System.out.print("O antecessor é: " +(n1-1)+ "\nE o sucessor é: " + (n1+1));

        


    }

}

package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){
            
        	// 1) Leia dos valores pelo teclado e imprima a soma

		int n1; // variavel 1 inteiro n1sss
		int n2; // variavel 2 inteiro n2

		System.out.print("Digite o primeiro numero: "); // Aqui é o "Escreva"
		Scanner scannerLeia = new Scanner(System.in);        // Aqui cria o scanner
		n1 = scannerLeia.nextInt();                          // Aqui é o "leia"
		
		System.out.print( "O primeiro numero é: " +n1+ "\n");
		
		System.out.println("Digite o segundo numero: ");
		n2 = scannerLeia.nextInt();

		System.out.println("O segundo numero é: " +n2);

		System.out.println("A soma é: " +(n1+n2)); 
	}

}


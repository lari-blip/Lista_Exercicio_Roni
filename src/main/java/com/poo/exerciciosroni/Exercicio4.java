package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){

        int ano_nascimento, ano_futuro;
        int resultado;

        System.out.println("Digite o ano de nascimento: ");
        Scanner leia = new Scanner(System.in);
        ano_nascimento = leia.nextInt();

        System.out.println("Digite o ano futuro: ");
        ano_futuro = leia.nextInt();

        resultado = ano_futuro - ano_nascimento;

        System.out.println("Sua idade em: " + ano_futuro + "sera" + resultado + "anos");
    }
}

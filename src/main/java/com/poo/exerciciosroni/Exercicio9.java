package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio9 {
        public void resolucao(){

            double km;
            double combustivel, consumo_medio;

            System.out.println("Digite a distância percorrida em km: ");
            Scanner leia = new Scanner(System.in);
            km= leia.nextDouble();
            
            System.out.println("Digite o total de gasto em combustivel: ");
            combustivel = leia.nextDouble();

            consumo_medio = km/combustivel;
            System.out.printf("O consumo medio em km é: " +  "%.2f" , consumo_medio);

        }
}

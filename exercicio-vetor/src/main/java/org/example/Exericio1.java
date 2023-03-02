package org.example;

import java.util.Scanner;

public class Exericio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[7];


        // Solicita que o usuário digite os valores do vet5
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o valor de vetor1[" + i + "]");
            vetor1[i] = leitor.nextInt();
        }


    exibeVetor(vetor1);

    }

    public static void exibeVetor(int[] v) {
        for (int i=0; i < v.length; i++) {
            System.out.print("v[" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }


}


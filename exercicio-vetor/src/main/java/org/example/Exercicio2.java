package org.example;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor2 = new int[10];
        Integer soma = 0;
        Integer media = 0;

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite o valor de vetor1[" + i + "]");
            vetor2[i] = leitor.nextInt();
            soma = soma + vetor2[i];
            for (int j = 0; j < vetor2.length; j++) {
                media = soma / vetor2.length;
            }

        }
        System.out.println("A média dos valores do vetor é " + media);

    }
    public static void exibeVetor(int[] v) {
        for (int i=0; i < v.length; i++) {
            System.out.print("v[" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }

}

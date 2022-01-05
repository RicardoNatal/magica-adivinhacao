import javax.swing.*;
import java.util.Scanner;

public class Rodador {

    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[][] carta1 = {
                {1, 2, 5, 7, 9},
                {11, 13, 15, 17, 19},
                {21, 23, 25, 27, 29},
                {31, 33, 35, 37, 39},
                {41, 43, 45, 47, 49},
                {51, 53, 55, 57, 59}
        };
        int[][] carta2 = {
                {2, 3, 6, 7, 10},
                {11, 14, 15, 18, 19},
                {22, 23, 26, 27, 30},
                {31, 34, 35, 38, 39},
                {42, 43, 46, 47, 50},
                {51, 54, 55, 58, 59}
        };
        int[][] carta3 = {
                {4, 5, 6, 7, 12},
                {13, 14, 15, 20, 21},
                {22, 23, 28, 29, 30},
                {31, 36, 37, 38, 39},
                {44, 45, 46, 47, 52},
                {53, 54, 55, 60}
        };
        int[][] carta4 = {
                {8, 9, 10, 11, 12},
                {13, 14, 15, 24, 25},
                {26, 27, 28, 29, 30},
                {31, 40, 41, 42, 43},
                {44, 45, 46, 47, 56},
                {57, 58, 59, 60}
        };
        int[][] carta5 = {
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30},
                {31, 48, 49, 50, 51},
                {52, 53, 54, 55, 56},
                {57, 58, 59, 60}
        };
        int[][] carta6 = {
                {32, 33, 34, 35, 36},
                {37, 38, 39, 40, 41},
                {42, 43, 44, 45, 46},
                {47, 48, 49, 50, 51},
                {52, 53, 54, 55, 56},
                {57, 58, 59, 60}
        };

        int resultado = 0;

        System.out.println("Olá, bem vindo, hoje vou adivinhar o número que estás pensando!");
        System.out.println("Primeiro, pense em um número de 1 a 60!");
        System.out.println("Escreva algo aqui quando tiver pensado: ");
        String inicio = leitor.nextLine();

        for (int[] row : carta1) {
            printRow(row);
        }
        System.out.println("Ok, passo 1/6, seu número se encontra ali em cima? Se sim, digite 1, caso não, digite outro número");
        int valor1 = leitor.nextInt();

        if (valor1 == 1) {
            resultado += 1;
        }

        for (int[] row : carta2) {
            printRow(row);
        }
        System.out.println("Muito bem, passo 2/6, seu número se encontra ali em cima? Se sim, digite 1, caso não, digite outro número\"");
        int valor2 = leitor.nextInt();

        if (valor2 == 1) {
            resultado += 2;
        }

        for (int[] row : carta3) {
            printRow(row);
        }
        System.out.println("Boaa, passo 3/6, seu número se encontra ali em cima? Se sim, digite 1, caso não, digite outro número\"");
        int valor3 = leitor.nextInt();

        if (valor3 == 1) {
            resultado += 4;
        }

        for (int[] row : carta4) {
            printRow(row);
        }
        System.out.println("Humm, interessante, ok, passo 4/6, seu número se encontra ali em cima? Se sim, digite 1, caso não, digite outro número\"");
        int valor4 = leitor.nextInt();

        if (valor4 == 1) {
            resultado += 8;
        }

        for (int[] row : carta5) {
            printRow(row);
        }
        System.out.println("Entendi, passo 5/6, seu número se encontra ali em cima? Se sim, digite 1, caso não, digite outro número\"");
        int valor5 = leitor.nextInt();

        if (valor5 == 1) {
            resultado += 16;
        }

        for (int[] row : carta6) {
            printRow(row);
        }
        System.out.println("Última vez, passo 6/6, seu número se encontra ali em cima? Se sim, digite 1, caso não, digite outro número\"");
        int valor6 = leitor.nextInt();

        if (valor6 == 1) {
            resultado += 32;
        }

        System.out.println("Acho que o número que estavas pensando era: >>" + resultado + "<<, acertei, não? Hehe, valeeeeu");
    }
}

package arraysMultidimensionais;

import java.util.Scanner;

public class somaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("-----------------------");
        System.out.println("PREENCHA A MATRIZ 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("-----------------------");
        System.out.println("A MATRIZ PREENCHIDA É:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                soma += matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        System.out.println("A SOMA DOS ELEMENTOS É: " + soma);
    }
}


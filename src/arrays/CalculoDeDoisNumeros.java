package arrays;

import java.util.Scanner;

public class CalculoDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array1[] = new int[3];
        int array2[] = new int[3];
        int resp[] = new int[3];

        System.out.println("----------------------");
        System.out.println("VETOR 1");
        System.out.println("----------------------");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            array1[i] = sc.nextInt();
        }
        System.out.println("----------------------");
        System.out.println("VETOR 2");
        System.out.println("----------------------");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            array2[i] = sc.nextInt();
        }
        System.out.println("----------------------");
        System.out.println("MULTIPLICAÇÃO");
        System.out.println("----------------------");
        for (int i = 0; i < resp.length; i++) {
            resp[i] = array1[i] * array2[i];
            System.out.println("O resultado da multiplicação de " + array1[i] + " X " + array2[i] + " é: " + resp[i]);
        }
    }
}

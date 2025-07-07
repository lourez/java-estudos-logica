package arrays;

import java.util.Scanner;

public class CalculoDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1[] = new int[3];
        int numero2[] = new int[3];
        int resultadoMultiplicacao[] = new int[3];

        System.out.println("----------------------");
        System.out.println("VETOR 1");
        System.out.println("----------------------");
        for (int i = 0; i < numero1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero1[i] = sc.nextInt();
        }
        System.out.println("----------------------");
        System.out.println("VETOR 2");
        System.out.println("----------------------");
        for (int i = 0; i < numero2.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero2[i] = sc.nextInt();
        }
        System.out.println("----------------------");
        System.out.println("MULTIPLICAÇÃO");
        System.out.println("----------------------");
        for (int i = 0; i < resultadoMultiplicacao.length; i++) {
            resultadoMultiplicacao[i] = numero1[i] * numero2[i];
            System.out.println("O resultado da multiplicação de " + numero1[i] + " X " + numero2[i] + " é: " + resultadoMultiplicacao[i]);
        }
    }
}

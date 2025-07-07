package arrays;

import java.util.Scanner;

public class MaiorNotaComMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notas[] = new double[3];
        String nomeAluno[] = new String[3];

        double media = 0;
        double maiorNota = 0;
        int indiceMaiorNota = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ": ");
            nomeAluno[i] = sc.next();
            System.out.println("Informe a nota de " + nomeAluno[i] + ": ");
            notas[i] = sc.nextDouble();
            media = media + notas[i];
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                indiceMaiorNota = i;

            }
        }
        System.out.println("---------------------");
        media = media / notas.length;
        System.out.println("Média das notas: " + media);
        System.out.println("Aluno com a maior nota: " + nomeAluno[indiceMaiorNota] + " com nota " + notas[indiceMaiorNota] + " !");
    }
}


package loops;

import java.util.Scanner;

public class CaixaEltronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco While Java");
        int saldo = 1000;


        while (true) {
            System.out.println("Seu saldo atual é: " + "R$" + saldo);
            System.out.print("Quanto deseja sacar? ");
            int saque = sc.nextInt();

            if (saque <= saldo) {
                saldo -= saque;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!"); // false
            }

            System.out.println("Seu novo saldo é: " + "R$" + saldo);

            if (saldo == 0) {
                System.out.print("Seu saldo acabou. Encerrando.");
                break;
            }
            System.out.println("Deseja sacar novamente? [S/N]");
            String resposta = sc.next();

            if (!resposta.equalsIgnoreCase("S")) {
                System.out.println("Obrigado por usar o caixa eletrônico.");
            }
        }
    }
}

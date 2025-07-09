package projetosDio.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("------------------");
        System.out.println("Bem vindo ao Banco DIO");
        System.out.println("Vamos iniciar o seu cadastro :)");
        System.out.println("-----------------");

        System.out.print("Digite seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print("Digite o número da sua agencia: ");
        agencia = input.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = input.nextInt();

        System.out.print("Quanto de saldo você deseja depositar ?: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + numero + " e seu saldo depositado de R$" + saldo + " já está disponível para saque.");

    }
}

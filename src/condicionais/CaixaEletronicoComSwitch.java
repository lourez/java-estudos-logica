package condicionais;

import java.util.Scanner;

public class CaixaEletronicoComSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao banco java");
        System.out.println("1 - Ver Saldo | 2 - Depositar dinheiro | 3 - Sacar dinheiro | 4 Sair");
        System.out.print("Escolha uma opcao: ");
        int opcao = sc.nextInt();
        int saldo = 1000;
        String resposta;

        switch (opcao) {
            case 1:
                resposta = "Seu saldo é: " + saldo;
                break;
            case 2:
                resposta = "Depósito realizado com sucesso.";
                break;
            case 3:
                resposta = "Sacado realizado com sucesso.";
                break;
            case 4:
                resposta = "Obrigado por usar nosso banco. Até logo!";
                break;
            default:
                resposta = "Opção inválida. Tente novamente.";
        }
        System.out.println(resposta);
    }
}

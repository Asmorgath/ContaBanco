package com.dio.contabanco;
import java.util.Scanner;
/*
*https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe
*
* */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;


        System.out.println("Informe seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Informe numero da agencia: ");
        agencia = sc.nextLine();
        System.out.println("Informe a conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Inform o saldo inicial: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por " +
                "criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível" +
                " para saque");
    }
}

package br;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000.0, 2358, 0); // saldo, numero, limite
        ContaEspecial conta2 = new ContaEspecial(0.0, 4562, 300.0);

        // Operações na ContaBancaria
        System.out.println("------------------------------");
        System.out.println("OPERAÇÕES NA CONTA BANCÁRIA");


        // Operações na ContaEspecial
        System.out.println("------------------------------");
        System.out.println("OPERAÇÕES NA CONTA ESPECIAL");
        conta2.sacar(400);
        conta2.consultarSaldo();

    }
}

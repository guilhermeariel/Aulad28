package br;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1000.0, 123, 0); // saldo, numero, limite
        ContaEspecial conta2 = new ContaEspecial(500.0, 456, 300.0);

        // Operações na ContaBancaria
        System.out.println("------------------------------");
        System.out.println("OPERAÇÕES NA CONTA BANCÁRIA");
        conta1.sacar(10.0);
        conta1.consultarSaldo();



        System.out.println("------------------------------");
        // Operações na ContaEspecial
        System.out.println("OPERAÇÕES NA CONTA ESPECIAL");
        conta2.consultarSaldo();

    }
}

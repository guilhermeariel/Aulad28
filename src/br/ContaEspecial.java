package br;

public class ContaEspecial extends ContaBancaria {


  public ContaEspecial(double saldo, int numero, double limite) {
    super(saldo, numero, limite);
  }

  // Permite sacar até o limite, mesmo que o saldo seja insuficiente
  @Override
  public boolean sacar(double valor){
    if (valor <= (saldo + limite) ){
      saldo -= valor;
      return true;
    } else {
      System.out.println( "Limite execedido!");
      return false;
    }
  }
  @Override
  public void consultarSaldo() {
    System.out.printf("Conta Especial %d - Saldo atual: R$ %.2f | Limite: R$ %.2f\n", numero, saldo, limite);

  }
}

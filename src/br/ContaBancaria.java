package br;

public class ContaBancaria {
  //ATRIBUTOS
  //protected ideal para herança controlada
  protected double saldo;
  protected int numero;
  protected double limite;

  //GETTERS SETTERS
  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero =  numero;
  }

  public double getLimite(){
    return limite ;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  //CONSTRUTOR
  public ContaBancaria(double saldo, int numero, double limite) {
    this.saldo = saldo;
    this.numero = numero;
    this.limite = limite;
  }

  //METODOS PUBLICOS
  public boolean sacar(double valor) {
    if (valor <= saldo)  {
      saldo -= valor;
      return false;
    } else {
      System.out.println("Saldo insuficiente");
      return false;
    }
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Deposito realizado com sucesso " + valor);
  }

  public void consultarSaldo() {
    System.out.println("Saldo da conta: " + saldo);
  }

}

# Aulad28
Banco de Contas
Este projeto em Java simula operações bancárias básicas utilizando conceitos de Programação Orientada a Objetos (POO), com herança e sobrescrita de métodos.

Estrutura do Projeto
Classe ContaBancaria
Contém os atributos numero, saldo e limite, além dos métodos:

sacar(double valor)

depositar(double valor)

consultarSaldo()

Classe ContaEspecial
É uma subclasse de ContaBancaria que:

Permite saques acima do saldo, até o limite disponível.

Sobrescreve o método sacar(double valor).

Classe Main
Realiza testes criando contas bancárias e contas especiais, executando operações como saques e depósitos

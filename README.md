##Banco de Contas em Java
Este projeto simula operações bancárias simples utilizando os quatro pilares da Programação Orientada a Objetos (POO): encapsulamento, herança, polimorfismo e abstração.

##Objetivo
Demonstrar, por meio de um exemplo prático, como aplicar os fundamentos de POO em Java por meio de um sistema de contas bancárias com diferentes comportamentos.

##Estrutura das Classes
ContaBancaria
Classe base que representa uma conta comum, com métodos para saque, depósito e consulta de saldo.

##ContaEspecial
Subclasse de ContaBancaria que permite saques que ultrapassam o saldo, respeitando um limite.

##Main
Classe de execução que cria instâncias das contas, realiza operações e exibe os resultados no console.

##Fundamentos de POO aplicados
Pilar	Aplicado?	Descrição
Encapsulamento	✅	Atributos protegidos e manipulados apenas por métodos públicos.
Herança	        ✅	ContaEspecial herda comportamento e atributos de ContaBancaria.
Polimorfismo	  ✅	O método sacar() é sobrescrito em ContaEspecial com comportamento específico.
Abstração	      ✅	As classes expõem apenas o que é necessário: o usuário interage por meio dos métodos.

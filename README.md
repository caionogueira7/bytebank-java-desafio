# Simulador Bancário - ByteBank (Java)

Projeto desenvolvido no âmbito do treinamento de desenvolvedores e estudos de **Programação Orientada a Objetos (POO)** e **Tratamento de Exceções** em **Java**. 

O sistema simula o processamento de operações em contas digitais (como depósitos e saques), aplicando regras de negócio restritas e validações equivalentes ao lançamento de exceções.

---

## Tecnologias Utilizadas
* **Java 21**
* **Programação Orientada a Objetos (POO)**
* **Tratamento de Exceções** (`IllegalArgumentException`)
* **Estruturas de Entrada de Dados** (`java.util.Scanner`)

---

## Arquitetura do Projeto
O projeto está dividido em duas classes principais para garantir o encapsulamento e a separação de responsabilidades:

1. **`Conta.java`**: Modela o domínio do negócio. Contém o atributo privado `saldo`, construtores, métodos de comportamento (`depositar`, `sacar`), e regras de validação que disparam exceções de negócio caso ocorram inconsistências.
2. **`Main.java`**: Controla a interface de interação com o usuário via terminal (CLI), realizando a leitura dos dados de entrada, instanciando a conta e tratando o fluxo de exibição de resultados e erros.

---

## Regras de Negócio e Validações
O sistema valida as operações de acordo com as seguintes restrições:
* **Tipo de Operação:** Apenas `DEPOSITO` e `SAQUE` são aceitos. Caso contrário, retorna `Erro: operacao invalida`.
* **Valores Inválidos:** Qualquer valor menor ou igual a zero (`<= 0`) para depósito ou saque retorna `Erro: valor invalido`.
* **Saldo Insuficiente:** Tentativas de saque que ultrapassem o saldo atual da conta retornam `Erro: saldo insuficiente`.


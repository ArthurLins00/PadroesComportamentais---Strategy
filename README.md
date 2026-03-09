# Atividade: Padrões de Projeto Comportamentais

**Instituição:** CESAR School  
**Curso:** Análise e Desenvolvimento de Sistemas  
**Disciplina:** Requisitos, Projeto de Software e Validação  
**Professora:** Hayanna Silva Oliveira

O projeto demonstra a aplicação prática do padrão **Strategy** utilizando a linguagem Java e a IDE Eclipse.

## 📌 Padrão Implementado

### 1. Strategy (Calculadora de Frete)
* **O que resolve:** Evita o uso excessivo de estruturas condicionais (if/else ou switch) quando existem múltiplas variações de um mesmo algoritmo. Ele resolve o problema de acoplamento, permitindo que o sistema cresça sem precisar alterar o código que utiliza o algoritmo.
* **Como resolve:** Define uma família de algoritmos, encapsula cada um deles em classes separadas e os torna intercambiáveis. O objeto de contexto recebe uma instância da estratégia desejada e delega a execução para ela.
* **Implementação:** O projeto utiliza uma interface `EstrategiaFrete` (Strategy), classes concretas `FreteComum` e `FreteExpresso` (Concrete Strategies) e uma classe `CalculadoraFrete` (Contexto) que gerencia qual cálculo aplicar em tempo de execução.

## 🛠️ Tecnologias
* Java 21
* IDE Eclipse
* Git/GitHub

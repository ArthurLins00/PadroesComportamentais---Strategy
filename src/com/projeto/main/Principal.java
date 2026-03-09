package com.projeto.main;

import com.projeto.strategy.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== PADRÃO COMPORTAMENTAL STRATEGY ===\n");

        CalculadoraFrete calculadora = new CalculadoraFrete();
        double pesoProduto = 2.5;

        calculadora.setEstrategia(new FreteComum());
        System.out.println("Cenário: Frete Comum");
        System.out.printf("Valor para %.2fkg: R$ %.2f%n", pesoProduto, calculadora.realizarCalculo(pesoProduto));

        System.out.println("-".repeat(30));

        calculadora.setEstrategia(new FreteExpresso());
        System.out.println("Cenário: Frete Expresso");
        System.out.printf("Valor para %.2fkg: R$ %.2f%n", pesoProduto, calculadora.realizarCalculo(pesoProduto));
    }
}
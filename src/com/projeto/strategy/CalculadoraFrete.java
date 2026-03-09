package com.projeto.strategy;

public class CalculadoraFrete {
    private EstrategiaFrete estrategia;

    public void setEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double realizarCalculo(double peso) {
        if (estrategia == null) {
            throw new IllegalStateException("Selecione um tipo de frete primeiro!");
        }
        return estrategia.calcular(peso);
    }
}

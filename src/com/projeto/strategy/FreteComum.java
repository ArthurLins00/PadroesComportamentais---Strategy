package com.projeto.strategy;

public class FreteComum implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 5.0;
    }
}

package com.projeto.strategy;

public class FreteExpresso implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 15.0;
    }
}

package com.amanda.javaintermediario.enums.calculadora;

public enum Calculadora {
    SOMAR('+') {
        @Override
        double executarOperacao(double x, double y) {
            return x+y;
        }
    }, MULTIPLICAR('*') {
        @Override
        double executarOperacao(double x, double y) {
            return x*y;
        }
    }, SUBTRAIR('-') {
        @Override
        double executarOperacao(double x, double y) {
            return x-y;
        }
    }, DIVIDIR('/') {
        @Override
        double executarOperacao(double x, double y) {
            return x/y;
        }
    };

    private char operacao;

    Calculadora(char operacao) {
        this.operacao = operacao;
    }

    abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return " " + operacao + " ";
    }
}

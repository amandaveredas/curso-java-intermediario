package com.amanda.javaintermediario;

public enum DiaSemanaConstrutor {

    SEGUNDA(1), TERCA(2), QUARTA(3),
    QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    DiaSemanaConstrutor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

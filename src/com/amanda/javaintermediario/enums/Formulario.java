package com.amanda.javaintermediario.enums;

public class Formulario {

    enum Genero{
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }


    }

    private String nome;
    private String cpf;
    private Genero genero;
}

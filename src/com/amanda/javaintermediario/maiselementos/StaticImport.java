package com.amanda.javaintermediario.maiselementos;

import static java.lang.Math.pow;

public class StaticImport {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        //se for usar muito a classe Math: melhor importar a classe
        System.out.println(pow(a,b)); //Math.pow == pow
    }
}

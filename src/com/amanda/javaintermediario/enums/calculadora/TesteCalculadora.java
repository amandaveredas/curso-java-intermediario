package com.amanda.javaintermediario.enums.calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        double x = 5;
        double y = 2;
        for(Calculadora calculadora : Calculadora.values()){
            System.out.println(x + calculadora.toString() + y + " = " +                    
                    calculadora.executarOperacao(x,y));
        }
    }
}

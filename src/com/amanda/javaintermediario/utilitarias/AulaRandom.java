package com.amanda.javaintermediario.utilitarias;

import java.util.Random;

public class AulaRandom {
    public static void main(String[] args) {
        System.out.println(Math.random()); //0.9084829711529064

        //Classe mais precisa, onde é facil de definir limites
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt()); //1580749431
        System.out.println(aleatorio.nextInt(5+1)); //3 -> o valor dentro do bound é EXCLUSIVO

    }
}

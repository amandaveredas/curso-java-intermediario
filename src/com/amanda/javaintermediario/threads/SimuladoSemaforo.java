package com.amanda.javaintermediario.threads;

public class SimuladoSemaforo {
    public static void main(String[] args) {
        ThreadSemaforo semaforo = new ThreadSemaforo();

        for(int i=0;i<10;i++){
            System.out.println(semaforo.getCorSemaforo());
            semaforo.esperaCorMudar();
        }
        semaforo.desligarSemaforo();

    }
}

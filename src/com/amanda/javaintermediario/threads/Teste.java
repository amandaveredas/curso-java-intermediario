package com.amanda.javaintermediario.threads;

public class Teste {

    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("Thread #1",600);
        MinhaThread thread2 = new MinhaThread("Thread #2",900);
        MinhaThread thread3 = new MinhaThread("Thread #3", 300);

        //thread.start(); //chama o método run la na classe thread
        //Executando a thread
    }
}

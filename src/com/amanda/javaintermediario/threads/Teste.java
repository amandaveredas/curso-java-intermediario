package com.amanda.javaintermediario.threads;

public class Teste {

    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("Thread #1",600);
        MinhaThread thread2 = new MinhaThread("Thread #2",900);
        MinhaThread thread3 = new MinhaThread("Thread #3", 300);

        MinhaThreadRunnable thread4 = new MinhaThreadRunnable("Thread #4",100);
        MinhaThreadRunnable thread5 = new MinhaThreadRunnable("Thread #5",400);
        MinhaThreadRunnable thread6 = new MinhaThreadRunnable("Thread #6", 500);

        //Coloquei essas ações dentro do próprio construtor:
//        Thread t4 = new Thread(thread4);
//        Thread t5 = new Thread(thread5);
//        Thread t6 = new Thread(thread6);
//        t4.start();
//        t5.start();
//        t6.start();


        //thread.start(); //chama o método run la na classe thread
        //Executando a thread
    }
}

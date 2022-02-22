package com.amanda.javaintermediario.threads;

public class TestePrioridade {

    public static void main(String[] args) {

        MinhaThreadRunnable thread4 = new MinhaThreadRunnable("Thread #4",500);
        MinhaThreadRunnable thread5 = new MinhaThreadRunnable("Thread #5",500);
        MinhaThreadRunnable thread6 = new MinhaThreadRunnable("Thread #6", 500);

        //Coloquei essas ações dentro do próprio construtor:
        Thread t4 = new Thread(thread4);
        Thread t5 = new Thread(thread5);
        Thread t6 = new Thread(thread6);

        //prioridade vai de 1 a 10, sendo 10 prioridade máxima
        t4.setPriority(5);
        t5.setPriority(3);
        t6.setPriority(1);

        //outra possibilidade
//        t4.setPriority(Thread.NORM_PRIORITY);
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t6.setPriority(Thread.MIN_PRIORITY);

        t4.start();
        t5.start();
        t6.start();
    }
}

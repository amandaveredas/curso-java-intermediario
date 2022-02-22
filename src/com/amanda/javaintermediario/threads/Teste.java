package com.amanda.javaintermediario.threads;

public class Teste {

    public static void main(String[] args) {
//        MinhaThread thread1 = new MinhaThread("Thread #1",600);
//        MinhaThread thread2 = new MinhaThread("Thread #2",900);
//        MinhaThread thread3 = new MinhaThread("Thread #3", 300);
//
//        thread.start(); //chama o método run la na classe thread
//        Executando a thread

        MinhaThreadRunnable thread4 = new MinhaThreadRunnable("Thread #4",500);
        MinhaThreadRunnable thread5 = new MinhaThreadRunnable("Thread #5",700);
        MinhaThreadRunnable thread6 = new MinhaThreadRunnable("Thread #6", 800);

        //Coloquei essas ações dentro do próprio construtor:
        Thread t4 = new Thread(thread4);
        Thread t5 = new Thread(thread5);
        Thread t6 = new Thread(thread6);

        t4.start();
        t5.start();
        t6.start();



//        while(t4.isAlive() || t5.isAlive() || t6.isAlive()){
//            try {
//                Thread.sleep(200); //coloco o programa principal pra dormir
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        //implementando a mesma lógica acima:

        try {
            //aguardando a finalização das threads para seguir a execução do programa:
            t4.join();
            t5.join();
            t6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");



    }
}

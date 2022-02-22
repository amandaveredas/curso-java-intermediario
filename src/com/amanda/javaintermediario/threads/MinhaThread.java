package com.amanda.javaintermediario.threads;

public class MinhaThread  extends Thread{

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run(){
        //System.out.println("Excutando a thread");
        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " contador" + i);
                sleep(tempo); //executa, imprime e dorme por 1 segundo
            }
        } catch (InterruptedException e) {
                e.printStackTrace();

        }

        System.out.println("A thread " + nome + " terminou a execução");
    }
}

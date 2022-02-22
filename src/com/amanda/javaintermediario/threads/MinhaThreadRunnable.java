package com.amanda.javaintermediario.threads;

public class MinhaThreadRunnable implements Runnable{

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this); //recebe a própria runnable como parâmetro
        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++){
                System.out.println(nome + " contador" + i);
                Thread.sleep(tempo); //executa, imprime e dorme por 1 segundo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println("A thread " + nome + " terminou a execução");
    }
}

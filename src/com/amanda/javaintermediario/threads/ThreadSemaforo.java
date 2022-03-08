package com.amanda.javaintermediario.threads;

public class ThreadSemaforo implements Runnable {

    enum CorSemaforo{
        VERDE(1000), AMARELO(300), VERMELHO(2000);
        private int tempoDeEspera;

        CorSemaforo(int tempoDeEspera) {
            this.tempoDeEspera = tempoDeEspera;
        }

        public int getTempoDeEspera() {
            return tempoDeEspera;
        }
    }

    private CorSemaforo corSemaforo;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo() {
        this.corSemaforo = CorSemaforo.VERMELHO;
        new Thread(this).start();
    }


    @Override
    public void run() {
        while (!parar){
            try {
                /*switch (this.corSemaforo){
                    case VERMELHO:
                        Thread.sleep(2000);
                        break;
                    case AMARELO:
                        Thread.sleep(300);
                        break;
                    case VERDE:
                        Thread.sleep(1000);
                        break;
                }*/
                Thread.sleep(this.corSemaforo.getTempoDeEspera());
                this.mudarCor();

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor(){
        switch (this.corSemaforo){
            case AMARELO:
                this.corSemaforo = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.corSemaforo = CorSemaforo.AMARELO;
                break;
            case VERMELHO:
                this.corSemaforo = CorSemaforo.VERDE;
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaCorMudar(){
        try {
            while(!this.corMudou){
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.corMudou = false;
    }

    public synchronized void desligarSemaforo(){
        this.parar = true;
    }

    public CorSemaforo getCorSemaforo() {
        return corSemaforo;
    }
}

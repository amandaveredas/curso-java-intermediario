package com.amanda.javaintermediario.maiselementos;

public class EscopoVariaveis {

    private int valor; //escopo: classe

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int soma10(int valor){
        return valor+10;
    }

    public int teste(){
        int valor = 5; //escopo: método
        if(true){
            valor--;
        }
        return valor;
    }

    public void outroTeste(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

        //i++; -> erro, poi i é uma variável que é válida apenas dentro do for
        //escopo: bloco

        //declarando fora do laço:
        int j;
        for (j=0; j<10;j++){
            System.out.println(j);
        }
        System.out.println(j); //10
    }

    public void maisUmTeste(){
        boolean flag = true;

        if(flag){
            int umaVariavel = 10;
            umaVariavel++;
            System.out.println(umaVariavel); //11
        }
        //System.out.println(umaVariavel); -> erro de compilação
    }
}

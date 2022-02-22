package com.amanda.javaintermediario.maiselementos;

public class PassagemValorParametro {

    public static void main(String[] args) {
        Contato contato = new Contato("Contato1","1234-5678","contato1@email.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);
    }

    private static void testePassagemValorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato2","2345-6789","contato2@email.com");

    }

    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato2");

    }

    //Tipos primitivos: passagem por valor
    //Objetos: passagem por referência
}

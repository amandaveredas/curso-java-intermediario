package com.amanda.javaintermediario.maiselementos;

public class GarbageColector {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[100000];
        Contato contato;

        for(int i=0; i< contatos.length;i++){
            contato = new Contato("Contato"+i, "1234-5678-"+i, "contato"+i+"@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");
        obterMemoriaUsada();

        contatos = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc(); //forçando a execução do garbage colector

        System.out.println("Contatos removidos");
        obterMemoriaUsada();

        /*
        Contatos criados
        22
        Contatos removidos
        0
         */
    }

    public static void obterMemoriaUsada(){

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); //singleton
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);

    }
}

package com.amanda.javaintermediario.strings;

public class Main {

    public static void main(String[] args) {

        /*quando há atrbuição simples em Strings, esse valor é colocado em um pool de e
        se um valor igual for atribuído de forma simples em outra, o java verifica no pool se
        essa String já existe, e aponta para a mesma localização de memoria.
         */

        String palavra = "Amanda"; //id = xx
        String palavra2 = new String(palavra); //id = aa -> será um novo id, pois um novo lugar na memória foi alocado
        String palavra3 = "Amanda"; //id == xx -> foi feita uma atribuição simples de um valor que já existe no pool


        // "==" compara referência de memória quando usado em Strings
        System.out.println(palavra == palavra2); //false
        System.out.println(palavra == palavra3); //true

        //regionMatches
        String banana = "banana";
        String ana = "ana";
        String Ban = "Ban";

        System.out.println(banana.regionMatches(1,ana,0,3)); //true
        System.out.println(banana.regionMatches(0,Ban,0,3)); //false
        System.out.println(banana.regionMatches(true,0,Ban,0,3)); //true


        /*a.compareTo(b)
        -1 -> a > b
        0 -> a == b
        1 -> b > a
         */

        //trim: remove os espaços no início e no fim  da string
        String nome = " Meu nome é ";
        String nomeSemEspacos = nome.trim();
        System.out.println(nomeSemEspacos); //"Meu nome é"

        //join
        String alfabeto = String.join(",","A","B","C","D");
        System.out.println(alfabeto); //A,B,C,D

        //split
        String doArquivo = "1;Antonio;30";
        String[] infos = doArquivo.split(";");
        /*for (String info : infos){
            System.out.println(info);

        }

           1
           ANTONIO
           30
         */

        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(pessoa);



    }
}

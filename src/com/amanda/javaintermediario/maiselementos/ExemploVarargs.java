package com.amanda.javaintermediario.maiselementos;

public class ExemploVarargs {
    public static void main(String[] args) {

        System.out.println(soma(1,2));
        System.out.println(soma(1,2,3));
        int[] vetor = {1,2,3,4,5};
        System.out.println(soma(vetor));
        System.out.println(soma(1,2,3,4,5,6,7));
    }

    static int soma(int a, int b){
        return a+b;
    }

    static int soma(int a, int b, int c){
        return a+b+c;
    }

    static int soma(int[] vetor){
        int total = 0;
        for (int numero : vetor){
            total += numero;
        }
        return total;

    }

    //varargs -> observar que varargs não são utilizados com tipo primitivos, usar Wrappers
    static int soma(Integer... valores){
        int total = 0;
        for (int numero : valores){
            total += numero;
        }
        return total;

    }

}

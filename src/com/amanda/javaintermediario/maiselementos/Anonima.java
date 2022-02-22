package com.amanda.javaintermediario.maiselementos;

public class Anonima {
    public void imprimeTexto(){
        System.out.println("qualquer texto");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima(){
            @Override
            public void imprimeTexto() {
                System.out.println("sobrescreve qualquer texto");
            }
        };

        anonima.imprimeTexto();//sobrescreve qualquer texto

        //usando a interface
        Texto texto = new Texto() { //modifica em tempo de instanciação
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto(); //qualquer texto - interface
    }
}

/*
EXEMPLOS REAIS:

- Classes internas: somente usaremos essa classe dentro da classe externa
    **JPA/Hibernate (chave primária composta)
- Classes locais:
    **Actions do Swing
- Classes anônimas:
    **Collections (comparar objetos, entre outros)

 */


package com.amanda.javaintermediario.maiselementos;

public class Externa2 {
    public void metodoQualquer(){
        class ClasseLocal{ //o escopo dessa classe é apenas o método
            private String texto = "texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeTexto();
    }

    public static void main(String[] args) {
        Externa2 externa2 = new Externa2();
        //não tem como acessar a classe local daqui, somente o método:
        externa2.metodoQualquer();
        //texto classe local
    }
}

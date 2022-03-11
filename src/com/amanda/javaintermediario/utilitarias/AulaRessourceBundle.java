package com.amanda.javaintermediario.utilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

public class AulaRessourceBundle {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //pt_BR
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        System.out.println(rb.getString("hello")); //Olá

        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault()); //en_US
        rb = ResourceBundle.getBundle("meu-texto");
        System.out.println(rb.getString("hello")); //Hello



    }
}

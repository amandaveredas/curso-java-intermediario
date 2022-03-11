package com.amanda.javaintermediario.utilitarias;
import java.util.Date;

public class AulaDate {
    public static void main(String[] args) {
        Date hoje = new Date();

        System.out.println(hoje); //Thu Mar 10 22:15:16 BRT 2022

        System.out.println("Milisegundos desde 1 jan 1970: " + hoje.getTime());
    }
}

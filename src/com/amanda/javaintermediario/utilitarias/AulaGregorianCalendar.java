package com.amanda.javaintermediario.utilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AulaGregorianCalendar {

    public static void main(String[] args) {
        GregorianCalendar hoje = new GregorianCalendar();
        imprimirData(hoje); //Hoje é 10/03/2022

        System.out.println(hoje.isLeapYear(2020));//true -> é ano bissexto
    }
/*
a classe Calendar estende a classe GregorianCalendar
 */
    private static void imprimirData(Calendar hoje){
        int ano  = hoje.get(Calendar.YEAR);
        int mes  = hoje.get(Calendar.MONTH);
        int dia  = hoje.get(Calendar.DAY_OF_MONTH);

        System.out.printf("Hoje é %02d/%02d/%02d",dia, mes+1, ano); //Hoje é 10/03/2022
        System.out.println();
    }
}

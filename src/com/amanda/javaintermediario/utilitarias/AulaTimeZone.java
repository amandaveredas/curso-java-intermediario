package com.amanda.javaintermediario.utilitarias;

import java.util.Calendar;
import java.util.TimeZone;

public class AulaTimeZone {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        TimeZone tz = calendar.getTimeZone();
        System.out.println(tz); //America/Sao_Paulo
    }
}

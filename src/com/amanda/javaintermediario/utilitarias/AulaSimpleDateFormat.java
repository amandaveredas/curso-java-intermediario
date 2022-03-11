package com.amanda.javaintermediario.utilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AulaSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

        Calendar data = new GregorianCalendar(2022,2,20,14,32,25);

        System.out.println(sdf.format(data.getTime())); //20/mar/2022 14:32:25

        //Transformando Strings em Datas
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/03/2022";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);
            System.out.println(minhaDataEmDate); //Sun Mar 20 00:00:00 BRT 2022
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

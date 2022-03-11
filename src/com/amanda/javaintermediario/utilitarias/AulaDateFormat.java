package com.amanda.javaintermediario.utilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

//usa as configurações do locale
public class AulaDateFormat {
    public static void main(String[] args) {

        Date hoje = new Date();
        System.out.println(hoje); //Thu Mar 10 23:01:14 BRT 2022

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado); //10/03/2022 23:01

        //somente o horário
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado); //23:02:33

        //String para Data
        String data = "12/02/2022 13:35";
        try {
            Date dataDate =  DateFormat.getInstance().parse(data);
            System.out.println(dataDate); //Sat Feb 12 13:35:00 BRT 2022
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}

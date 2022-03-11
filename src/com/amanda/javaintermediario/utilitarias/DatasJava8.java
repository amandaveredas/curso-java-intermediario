package com.amanda.javaintermediario.utilitarias;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DatasJava8 {
    public static void main(String[] args) {

        //data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora); //2022-03-11 -> FORMATO ISO
        LocalDate data = LocalDate.of(2022,3,11);
        System.out.println(data); //2022-03-11
        System.out.println(LocalDate.parse("2022-03-11")); //2022-03-11
        System.out.println(agora.plusDays(20)); //2022-03-31
        System.out.println(agora.minusDays(2)); //2022-03-09
        System.out.println(agora.getDayOfWeek()); //FRIDAY
        System.out.println(agora.isLeapYear()); //false

        //horario
        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora); //11:00:41.071184 -> formato ISO

        // DATA E HORA
        LocalDateTime dataHoraAgora = LocalDateTime.now();
        System.out.println(dataHoraAgora); //2022-03-11T11:02:13.239914

        //trabalhando com fusos
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso); //America/Sao_Paulo

        ZonedDateTime dataComFuso = ZonedDateTime.of(LocalDateTime.parse("2022-03-11T11:06:27.610404"), ZoneId.systemDefault());
        System.out.println(dataComFuso); //2022-03-11T11:06:27.610404-03:00[America/Sao_Paulo]

        //Convertendo para LocalDate
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime  ldtData = LocalDateTime.ofInstant(date.toInstant(),ZoneId.systemDefault());
        System.out.println(ldtData); //2022-03-11T12:47:09.122
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault())); //2022-03-11T12:47:38.846

    }
}

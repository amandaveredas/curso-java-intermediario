package com.amanda.javaintermediario.enums;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemanaConstrutor dia = DiaSemanaConstrutor.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());

        //outra forma de usar o ENUM
        Data data = new Data(06,11,1989, DiaSemanaConstrutor.SEGUNDA);
        System.out.println(data.toString());
        System.out.println(data.getDiaSemana().getValor());

        //percorrendo um enum
        //DiaSemana[] diaSemanas = DiaSemana.values();
        for (DiaSemana diaSemana : DiaSemana.values()){
            System.out.println(diaSemana);
        }

        System.out.println(DiaSemanaConstrutor.valueOf("DOMINGO"));


    }
}

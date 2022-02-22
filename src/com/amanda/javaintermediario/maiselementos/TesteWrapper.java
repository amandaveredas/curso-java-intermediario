package com.amanda.javaintermediario.maiselementos;

public class TesteWrapper {

    public static void main(String[] args) {

        //tipos primitivos
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';

        //wrappers
        Short num7 = new Short((short) 1); //deprecated

        //autoboxing:
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 1000L;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character b = 'b';

        //indo de string para wrappers:
        Double num13 = new Double("3.555"); //deprecated
        Double num14 = Double.valueOf("3.55555");
        Integer num15 = Integer.parseInt("126");

        //cnvertendo entre as wrappers:
        Long num16 = num9.longValue();

        //autounboxing
        int num17 = num9; //num9.intValue();

        //o Java faz esses boxings e unboxings de maneira transparente em expressões

        //quando é boa prática usar primitvos?
        //Quando for manipulá-los matematicamente de forma frequente









    }
}

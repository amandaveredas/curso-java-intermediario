package com.amanda.javaintermediario.maiselementos;

public class ExemploPrintf {
    public static void main(String[] args) {
        System.out.printf("%s", "Olá, Mundo!"); //Olá, Mundo!
        System.out.println();
        System.out.printf("%S", "Olá, mundo!"); //OLÁ, MUNDO!
        System.out.println();

        System.out.printf("%c", 'a'); //a
        System.out.printf("%n"); //pula linha
        System.out.printf("%C", 'a'); //A
        System.out.printf("%n");

        System.out.printf("%d", 123456); //123456
        System.out.printf("%n");

        System.out.printf("%f", 0.3654); //0,365400
        System.out.printf("%n");

        System.out.printf("%20s", "Olá, Mundo!"); //         Olá, Mundo!
        System.out.println();
        System.out.printf("%-20s", "Olá, Mundo!"); //Olá, Mundo!
        System.out.println();

        System.out.printf("%+d", 123456); //+123456
        System.out.printf("%n");
        System.out.printf("%015d", 123456); //000000000123456
        System.out.printf("%n");
        System.out.printf("%,d", 123456); //separar os milhares: 123.456
        System.out.printf("%n");
        System.out.printf("% d", -123456); //-123456
        System.out.printf("%n");
        System.out.printf("% d", 123456); // 123456
        System.out.printf("%n");

        System.out.printf("%.2f", 0.3654); //0,37
        System.out.printf("%n");
        System.out.printf("R$%.2f", 0.3654); //R$0,37
        System.out.printf("%n");

        testeMaisCompleto();

    }

    private static void testeMaisCompleto(){
        double[] precos = {1000,123.54,7843.567,1,4.56789};

        for(double preco : precos){
            System.out.printf("%s: total de R$%,10.2f%n", "Item", preco);
            //Como formatar:
            // %[flags][largura][.precisão]caractere-de-conversão
            /*Item: total de R$  1.000,00
Item: total de R$    123,54
Item: total de R$  7.843,57
Item: total de R$      1,00
Item: total de R$      4,57

             */
        }
    }

    //Java.util.Formater

}

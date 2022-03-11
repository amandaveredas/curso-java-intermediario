package com.amanda.javaintermediario.utilitarias;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

//quando não há muita preocupação com a precisão nas casas decimais
public class AulaNumberFormat {
    public static void main(String[] args) {
        Locale en =Locale.US;
        NumberFormat nf = NumberFormat.getInstance(en);
        System.out.println(nf.format(155555555.23d)); //155,555,555.23

        Locale pt = new Locale("pt","Brazil");
        NumberFormat nf1 = NumberFormat.getInstance(pt);
        System.out.println(nf1.format(155555555.23d)); //155.555.555,23

        //MOEDAS
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
        System.out.println(moeda.format(155555555.23d)); //$155,555,555.23

        NumberFormat moedaPT = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.println(moedaPT.format(155555555.23d)); //R$155.555.555,23
        Currency currency = moedaPT.getCurrency();
        System.out.println(currency); //BRL

        //PORCENTAGEM
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(12.99d);
        System.out.println(porcentagem); //1.299%





    }


}

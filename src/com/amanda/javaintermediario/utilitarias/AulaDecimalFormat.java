package com.amanda.javaintermediario.utilitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class AulaDecimalFormat {
    public static void main(String[] args) {

        String padrao = "###,###.##";
        String padraoComCasasDecimaisObrigatorias = "###,###.00";

        DecimalFormat df = new DecimalFormat(padrao);
        System.out.println(df.format(123456789123.23658d));//123.456.789.123,24

        DecimalFormat df2 = new DecimalFormat(padraoComCasasDecimaisObrigatorias);
        System.out.println(df2.format(123456789123d));//123.456.789.123,00

        //definindo os simboloa de separação
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
        df = new DecimalFormat(padrao,dfs);
        System.out.println(df.format(123456789123.23658d));//123,456,789,123.24
    }
}

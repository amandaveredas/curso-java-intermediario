package com.amanda.javaintermediario.utilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class AulaLocale {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale); //pt_BR
        System.out.println(locale.getDisplayCountry()); //Brasil

        //Para setar um locale default:
        locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault()); //en_US

        //formatando números
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(500000000000000d)); //$500,000,000,000,000.00

    }


}

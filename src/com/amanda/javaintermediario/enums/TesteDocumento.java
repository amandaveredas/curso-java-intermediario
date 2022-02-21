package com.amanda.javaintermediario.enums;

public class TesteDocumento {

    public static void main(String[] args) {
        for(TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc + " - " + doc.geraNumeroTeste());
        }

        Pessoa pessoaFisica = new Pessoa();
        pessoaFisica.setTipoDocumento(TipoDocumento.CPF);
        pessoaFisica.setNumeroDoDocumento(pessoaFisica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaFisica);

        Pessoa pessoaJuridica = new Pessoa();
        pessoaJuridica.setTipoDocumento(TipoDocumento.CNPJ);
        pessoaJuridica.setNumeroDoDocumento(pessoaJuridica.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoaJuridica);
    }
}

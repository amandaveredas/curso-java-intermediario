package com.amanda.javaintermediario.enums;

public class Pessoa {

    private TipoDocumento tipoDocumento;
    private String numeroDoDocumento;

    public Pessoa(TipoDocumento tipoDocumento, String numeroDoDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public Pessoa() {
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numero='" + numeroDoDocumento + '\'' +
                '}';
    }
}

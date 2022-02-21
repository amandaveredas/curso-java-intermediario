package com.amanda.javaintermediario.enums;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    //usando o enum na declaração da classe
    private DiaSemanaConstrutor diaSemana;

    public Data() {
    }

    public Data(int dia, int mes, int ano, DiaSemanaConstrutor diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemanaConstrutor getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemanaConstrutor diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", diaSemana=" + diaSemana +
                '}';
    }
}

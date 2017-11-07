package com.fyakut;

public class Daire extends GeometrikSekil {
    private double yaricap;
    public static final double pi=3;

    public Daire() {
    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap<0)
            this.yaricap=0;
        else
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return pi*yaricap*yaricap;
    }
}

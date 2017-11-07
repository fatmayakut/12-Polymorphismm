package com.fyakut;

public class Kare  extends GeometrikSekil{
    private double kenar;

    public Kare() {
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        if (kenar<0)
            this.kenar=0;
        else
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }
}

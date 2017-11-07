package com.fyakut;

public class Main1 {
    public static void main(String... args){
        GeometrikSekil gs1=new GeometrikSekil();
        Kare k1=new Kare(10);
        Dikdortgen d1=new Dikdortgen(7,6);
        Daire daire1=new Daire(3);


        GeometrikSekil gs2=new GeometrikSekil();
        Kare k2=new Kare(15);
        Dikdortgen d2=new Dikdortgen(5,11);
GeometrikSekil[] sekildizisi=new GeometrikSekil[7];
sekildizisi[0] =gs1;
sekildizisi[1]=k1;
sekildizisi[2]=d1;
sekildizisi[3]=gs2;
sekildizisi[4]=k2;
sekildizisi[5]=d2;
sekildizisi[6]=daire1;
sekilAlanHesaplaMetodu(sekildizisi);


    }
    public static void sekilAlanHesaplaMetodu(GeometrikSekil[] sekiller){
        for (GeometrikSekil geciciNesne:sekiller)
            System.out.println("Sekilalanları:"+geciciNesne.alanHesapla());


    }
}

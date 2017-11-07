package com.fyakut;

public class Main {
    /**
     * çok biçimlilik=farklı biçimlerde çalışan nesnelere aynı biçimde erişmeye yada
     * bir nesnenin farklı bir nesne gibi davranmasına denir
     * @param args
     */

    public static void main(String[] args) {
/*Dikdortgen d1=new Dikdortgen(5,10);
System.out.println("dikdörtgen alanı:"+d1.alanHesapla());
        Kare kare=new Kare(5);
        System.out.println("karenin alanı:"+kare.alanHesapla());*/

GeometrikSekil gs1=new GeometrikSekil();
Kare k1=new Kare(10);
Dikdortgen d1=new Dikdortgen(7,6);

alanBilgisi(gs1);//farklı nesnelere aynı şekilde erişim yapıldı buna çok biçimlilik denir.
alanBilgisi(k1);
alanBilgisi(d1);


    }
    public static  void alanBilgisi(GeometrikSekil sekil){//şekıl alanı göre nesne çağır
        System.out.println("alan bilgisi:"+sekil.alanHesapla());
    }

}


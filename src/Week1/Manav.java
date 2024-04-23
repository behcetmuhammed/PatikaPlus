package Week1;
/*
    Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Alınan Aldığınız Armut Miktarını KG Cinsinden Yazınız: ");
        double armutKG = input.nextDouble();
        System.out.print("Alınan Aldığınız Elma Miktarını KG Cinsinden Yazınız: ");
        double ElmaKG = input.nextDouble();
        System.out.print("Alınan Aldığınız Domates Miktarını KG Cinsinden Yazınız: ");
        double DomatesKG = input.nextDouble();
        System.out.print("Alınan Aldığınız Muz Miktarını KG Cinsinden Yazınız: ");
        double MuzKG = input.nextDouble();
        System.out.print("Alınan Aldığınız  Miktarını KG Cinsinden Yazınız: ");
        double PatlıcanKG = input.nextDouble();

        double armutKGF = 2.14, ElmaKGF = 3.67, DomatesKGF = 1.11, MuzKGF = 0.95,PatlıcanKGF = 5;
        double ToplamTutar = armutKG*armutKGF + ElmaKG * ElmaKGF + DomatesKG * DomatesKGF + MuzKG * MuzKGF + PatlıcanKG * PatlıcanKGF;

        System.out.println("Toplam Tutar: "+ ToplamTutar + " TL");
    }
}

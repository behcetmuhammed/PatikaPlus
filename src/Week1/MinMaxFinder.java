package Week1;

import java.util.Scanner;

/*
    Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
    ve bu sayıları ekrana yazan programı yazın.

    ##SENARYO:
    Kaç tane sayı gireceksiniz: 4
    1. Sayıyı giriniz: 16
    2. Sayıyı giriniz: -22
    3. Sayıyı giriniz: -15
    4. Sayıyı giriniz: 100
    En büyük sayı: 100
    En küçük sayı: -22
*/
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayiAdedi = input.nextInt();

        int[] dizi = new int[sayiAdedi];
        int temp; //geçici değişken. varsayılan bir değer tutmak için..

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            dizi[i] = sayi;
        }

        System.out.println("Dizinin elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

        // En büyük ve en küçük değerleri bulma
        int enBuyuk = dizi[0]; // dizinin 1. indexini en büyük olarak varsaydık //Not: dizi indexleri 0 dan başlar.
        int enKucuk = dizi[0]; // dizinin 1. indexini en küçük olarak varsaydık

        for (int i = 1; i < sayiAdedi; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}

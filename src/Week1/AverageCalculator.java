package Week1;

import java.util.Scanner;

/*
    Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
    ##Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
    ortalamasını hesaplayan programı yazınız.*/
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0; // Bölünen sayıların toplamını tutmak için değişken
        int adet = 0; // Bölünen sayıların adedini tutmak için değişken

        // 0'dan girilen sayıya kadar olan sayıları kontrol eder
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) { // 3'e ve 4'e tam bölünüyor mu kontrol eder
                toplam += i; // Bölünen sayıyı toplama ekler
                adet++; // Bölünen sayı adedini artırır
            }
        }

        if (adet > 0) {
            double ortalama = toplam / adet; // Ortalama heseplama
            System.out.println("0'dan " + sayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("0'dan " + sayi + "'e kadar olan 3 ve 4'e tam bölünen sayı yok.");
        }

/*
        int i = 0;
        while(i<=sayi){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }*/

    }
}
